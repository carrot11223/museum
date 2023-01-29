package com.dao;

import com.entity.WenwuleibieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenwuleibieVO;
import com.entity.view.WenwuleibieView;


/**
 * 文物类别
 * 
 * @author 
 * @email 
 * @date 2021-04-09 18:09:11
 */
public interface WenwuleibieDao extends BaseMapper<WenwuleibieEntity> {
	
	List<WenwuleibieVO> selectListVO(@Param("ew") Wrapper<WenwuleibieEntity> wrapper);
	
	WenwuleibieVO selectVO(@Param("ew") Wrapper<WenwuleibieEntity> wrapper);
	
	List<WenwuleibieView> selectListView(@Param("ew") Wrapper<WenwuleibieEntity> wrapper);

	List<WenwuleibieView> selectListView(Pagination page,@Param("ew") Wrapper<WenwuleibieEntity> wrapper);
	
	WenwuleibieView selectView(@Param("ew") Wrapper<WenwuleibieEntity> wrapper);
	
}
