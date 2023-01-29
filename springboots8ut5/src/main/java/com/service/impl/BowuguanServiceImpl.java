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


import com.dao.BowuguanDao;
import com.entity.BowuguanEntity;
import com.service.BowuguanService;
import com.entity.vo.BowuguanVO;
import com.entity.view.BowuguanView;

@Service("bowuguanService")
public class BowuguanServiceImpl extends ServiceImpl<BowuguanDao, BowuguanEntity> implements BowuguanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BowuguanEntity> page = this.selectPage(
                new Query<BowuguanEntity>(params).getPage(),
                new EntityWrapper<BowuguanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BowuguanEntity> wrapper) {
		  Page<BowuguanView> page =new Query<BowuguanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BowuguanVO> selectListVO(Wrapper<BowuguanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BowuguanVO selectVO(Wrapper<BowuguanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BowuguanView> selectListView(Wrapper<BowuguanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BowuguanView selectView(Wrapper<BowuguanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
