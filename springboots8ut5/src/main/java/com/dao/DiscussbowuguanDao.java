package com.dao;

import com.entity.DiscussbowuguanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussbowuguanVO;
import com.entity.view.DiscussbowuguanView;


/**
 * 博物馆评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-09 18:09:12
 */
public interface DiscussbowuguanDao extends BaseMapper<DiscussbowuguanEntity> {
	
	List<DiscussbowuguanVO> selectListVO(@Param("ew") Wrapper<DiscussbowuguanEntity> wrapper);
	
	DiscussbowuguanVO selectVO(@Param("ew") Wrapper<DiscussbowuguanEntity> wrapper);
	
	List<DiscussbowuguanView> selectListView(@Param("ew") Wrapper<DiscussbowuguanEntity> wrapper);

	List<DiscussbowuguanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussbowuguanEntity> wrapper);
	
	DiscussbowuguanView selectView(@Param("ew") Wrapper<DiscussbowuguanEntity> wrapper);
	
}
