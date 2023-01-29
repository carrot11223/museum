package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WenwuleibieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WenwuleibieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WenwuleibieView;


/**
 * 文物类别
 *
 * @author 
 * @email 
 * @date 2021-04-09 18:09:11
 */
public interface WenwuleibieService extends IService<WenwuleibieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenwuleibieVO> selectListVO(Wrapper<WenwuleibieEntity> wrapper);
   	
   	WenwuleibieVO selectVO(@Param("ew") Wrapper<WenwuleibieEntity> wrapper);
   	
   	List<WenwuleibieView> selectListView(Wrapper<WenwuleibieEntity> wrapper);
   	
   	WenwuleibieView selectView(@Param("ew") Wrapper<WenwuleibieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenwuleibieEntity> wrapper);
   	
}

