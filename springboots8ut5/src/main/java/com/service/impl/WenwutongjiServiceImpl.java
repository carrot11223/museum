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


import com.dao.WenwutongjiDao;
import com.entity.WenwutongjiEntity;
import com.service.WenwutongjiService;
import com.entity.vo.WenwutongjiVO;
import com.entity.view.WenwutongjiView;

@Service("wenwutongjiService")
public class WenwutongjiServiceImpl extends ServiceImpl<WenwutongjiDao, WenwutongjiEntity> implements WenwutongjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WenwutongjiEntity> page = this.selectPage(
                new Query<WenwutongjiEntity>(params).getPage(),
                new EntityWrapper<WenwutongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WenwutongjiEntity> wrapper) {
		  Page<WenwutongjiView> page =new Query<WenwutongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WenwutongjiVO> selectListVO(Wrapper<WenwutongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WenwutongjiVO selectVO(Wrapper<WenwutongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WenwutongjiView> selectListView(Wrapper<WenwutongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WenwutongjiView selectView(Wrapper<WenwutongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
