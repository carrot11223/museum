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


import com.dao.WenwuleibieDao;
import com.entity.WenwuleibieEntity;
import com.service.WenwuleibieService;
import com.entity.vo.WenwuleibieVO;
import com.entity.view.WenwuleibieView;

@Service("wenwuleibieService")
public class WenwuleibieServiceImpl extends ServiceImpl<WenwuleibieDao, WenwuleibieEntity> implements WenwuleibieService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WenwuleibieEntity> page = this.selectPage(
                new Query<WenwuleibieEntity>(params).getPage(),
                new EntityWrapper<WenwuleibieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WenwuleibieEntity> wrapper) {
		  Page<WenwuleibieView> page =new Query<WenwuleibieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WenwuleibieVO> selectListVO(Wrapper<WenwuleibieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WenwuleibieVO selectVO(Wrapper<WenwuleibieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WenwuleibieView> selectListView(Wrapper<WenwuleibieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WenwuleibieView selectView(Wrapper<WenwuleibieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
