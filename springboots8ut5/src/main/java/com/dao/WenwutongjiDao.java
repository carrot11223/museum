package com.dao;

import com.entity.WenwutongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenwutongjiVO;
import com.entity.view.WenwutongjiView;


/**
 * 文物统计
 * 
 * @author 
 * @email 
 * @date 2021-04-09 18:09:12
 */
public interface WenwutongjiDao extends BaseMapper<WenwutongjiEntity> {
	
	List<WenwutongjiVO> selectListVO(@Param("ew") Wrapper<WenwutongjiEntity> wrapper);
	
	WenwutongjiVO selectVO(@Param("ew") Wrapper<WenwutongjiEntity> wrapper);
	
	List<WenwutongjiView> selectListView(@Param("ew") Wrapper<WenwutongjiEntity> wrapper);

	List<WenwutongjiView> selectListView(Pagination page,@Param("ew") Wrapper<WenwutongjiEntity> wrapper);
	
	WenwutongjiView selectView(@Param("ew") Wrapper<WenwutongjiEntity> wrapper);
	
}
