package com.dao;

import com.entity.BowuguanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BowuguanVO;
import com.entity.view.BowuguanView;


/**
 * 博物馆
 * 
 * @author 
 * @email 
 * @date 2021-04-09 18:09:11
 */
public interface BowuguanDao extends BaseMapper<BowuguanEntity> {
	
	List<BowuguanVO> selectListVO(@Param("ew") Wrapper<BowuguanEntity> wrapper);
	
	BowuguanVO selectVO(@Param("ew") Wrapper<BowuguanEntity> wrapper);
	
	List<BowuguanView> selectListView(@Param("ew") Wrapper<BowuguanEntity> wrapper);

	List<BowuguanView> selectListView(Pagination page,@Param("ew") Wrapper<BowuguanEntity> wrapper);
	
	BowuguanView selectView(@Param("ew") Wrapper<BowuguanEntity> wrapper);
	
}
