package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscusszhanlanxinxiEntity;
import com.entity.view.DiscusszhanlanxinxiView;

import com.service.DiscusszhanlanxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 展览信息评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-09 18:09:12
 */
@RestController
@RequestMapping("/discusszhanlanxinxi")
public class DiscusszhanlanxinxiController {
    @Autowired
    private DiscusszhanlanxinxiService discusszhanlanxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscusszhanlanxinxiEntity discusszhanlanxinxi,
		HttpServletRequest request){
        EntityWrapper<DiscusszhanlanxinxiEntity> ew = new EntityWrapper<DiscusszhanlanxinxiEntity>();
		PageUtils page = discusszhanlanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusszhanlanxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscusszhanlanxinxiEntity discusszhanlanxinxi, HttpServletRequest request){
        EntityWrapper<DiscusszhanlanxinxiEntity> ew = new EntityWrapper<DiscusszhanlanxinxiEntity>();
		PageUtils page = discusszhanlanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusszhanlanxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscusszhanlanxinxiEntity discusszhanlanxinxi){
       	EntityWrapper<DiscusszhanlanxinxiEntity> ew = new EntityWrapper<DiscusszhanlanxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discusszhanlanxinxi, "discusszhanlanxinxi")); 
        return R.ok().put("data", discusszhanlanxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscusszhanlanxinxiEntity discusszhanlanxinxi){
        EntityWrapper< DiscusszhanlanxinxiEntity> ew = new EntityWrapper< DiscusszhanlanxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discusszhanlanxinxi, "discusszhanlanxinxi")); 
		DiscusszhanlanxinxiView discusszhanlanxinxiView =  discusszhanlanxinxiService.selectView(ew);
		return R.ok("查询展览信息评论表成功").put("data", discusszhanlanxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscusszhanlanxinxiEntity discusszhanlanxinxi = discusszhanlanxinxiService.selectById(id);
        return R.ok().put("data", discusszhanlanxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscusszhanlanxinxiEntity discusszhanlanxinxi = discusszhanlanxinxiService.selectById(id);
        return R.ok().put("data", discusszhanlanxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscusszhanlanxinxiEntity discusszhanlanxinxi, HttpServletRequest request){
    	discusszhanlanxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusszhanlanxinxi);
        discusszhanlanxinxiService.insert(discusszhanlanxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscusszhanlanxinxiEntity discusszhanlanxinxi, HttpServletRequest request){
    	discusszhanlanxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusszhanlanxinxi);
        discusszhanlanxinxiService.insert(discusszhanlanxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiscusszhanlanxinxiEntity discusszhanlanxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discusszhanlanxinxi);
        discusszhanlanxinxiService.updateById(discusszhanlanxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discusszhanlanxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DiscusszhanlanxinxiEntity> wrapper = new EntityWrapper<DiscusszhanlanxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discusszhanlanxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
