package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscusszhanlanxinxiDao;
import com.entity.DiscusszhanlanxinxiEntity;
import com.service.DiscusszhanlanxinxiService;
import com.entity.vo.DiscusszhanlanxinxiVO;
import com.entity.view.DiscusszhanlanxinxiView;

@Service("discusszhanlanxinxiService")
public class DiscusszhanlanxinxiServiceImpl extends ServiceImpl<DiscusszhanlanxinxiDao, DiscusszhanlanxinxiEntity> implements DiscusszhanlanxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszhanlanxinxiEntity> page = this.selectPage(
                new Query<DiscusszhanlanxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusszhanlanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszhanlanxinxiEntity> wrapper) {
		  Page<DiscusszhanlanxinxiView> page =new Query<DiscusszhanlanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszhanlanxinxiVO> selectListVO(Wrapper<DiscusszhanlanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszhanlanxinxiVO selectVO(Wrapper<DiscusszhanlanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszhanlanxinxiView> selectListView(Wrapper<DiscusszhanlanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszhanlanxinxiView selectView(Wrapper<DiscusszhanlanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
