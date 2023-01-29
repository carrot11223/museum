package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussbowuguanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussbowuguanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussbowuguanView;


/**
 * 博物馆评论表
 *
 * @author 
 * @email 
 * @date 2021-04-09 18:09:12
 */
public interface DiscussbowuguanService extends IService<DiscussbowuguanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussbowuguanVO> selectListVO(Wrapper<DiscussbowuguanEntity> wrapper);
   	
   	DiscussbowuguanVO selectVO(@Param("ew") Wrapper<DiscussbowuguanEntity> wrapper);
   	
   	List<DiscussbowuguanView> selectListView(Wrapper<DiscussbowuguanEntity> wrapper);
   	
   	DiscussbowuguanView selectView(@Param("ew") Wrapper<DiscussbowuguanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussbowuguanEntity> wrapper);
   	
}

