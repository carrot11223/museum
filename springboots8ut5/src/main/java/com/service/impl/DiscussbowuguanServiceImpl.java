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


import com.dao.DiscussbowuguanDao;
import com.entity.DiscussbowuguanEntity;
import com.service.DiscussbowuguanService;
import com.entity.vo.DiscussbowuguanVO;
import com.entity.view.DiscussbowuguanView;

@Service("discussbowuguanService")
public class DiscussbowuguanServiceImpl extends ServiceImpl<DiscussbowuguanDao, DiscussbowuguanEntity> implements DiscussbowuguanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussbowuguanEntity> page = this.selectPage(
                new Query<DiscussbowuguanEntity>(params).getPage(),
                new EntityWrapper<DiscussbowuguanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussbowuguanEntity> wrapper) {
		  Page<DiscussbowuguanView> page =new Query<DiscussbowuguanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussbowuguanVO> selectListVO(Wrapper<DiscussbowuguanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussbowuguanVO selectVO(Wrapper<DiscussbowuguanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussbowuguanView> selectListView(Wrapper<DiscussbowuguanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussbowuguanView selectView(Wrapper<DiscussbowuguanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
