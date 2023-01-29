package com.dao;

import com.entity.DiscusszhanlanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszhanlanxinxiVO;
import com.entity.view.DiscusszhanlanxinxiView;


/**
 * 展览信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-09 18:09:12
 */
public interface DiscusszhanlanxinxiDao extends BaseMapper<DiscusszhanlanxinxiEntity> {
	
	List<DiscusszhanlanxinxiVO> selectListVO(@Param("ew") Wrapper<DiscusszhanlanxinxiEntity> wrapper);
	
	DiscusszhanlanxinxiVO selectVO(@Param("ew") Wrapper<DiscusszhanlanxinxiEntity> wrapper);
	
	List<DiscusszhanlanxinxiView> selectListView(@Param("ew") Wrapper<DiscusszhanlanxinxiEntity> wrapper);

	List<DiscusszhanlanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszhanlanxinxiEntity> wrapper);
	
	DiscusszhanlanxinxiView selectView(@Param("ew") Wrapper<DiscusszhanlanxinxiEntity> wrapper);
	
}
