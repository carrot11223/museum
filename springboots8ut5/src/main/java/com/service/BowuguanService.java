package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BowuguanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BowuguanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BowuguanView;


/**
 * 博物馆
 *
 * @author 
 * @email 
 * @date 2021-04-09 18:09:11
 */
public interface BowuguanService extends IService<BowuguanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BowuguanVO> selectListVO(Wrapper<BowuguanEntity> wrapper);
   	
   	BowuguanVO selectVO(@Param("ew") Wrapper<BowuguanEntity> wrapper);
   	
   	List<BowuguanView> selectListView(Wrapper<BowuguanEntity> wrapper);
   	
   	BowuguanView selectView(@Param("ew") Wrapper<BowuguanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BowuguanEntity> wrapper);
   	
}

