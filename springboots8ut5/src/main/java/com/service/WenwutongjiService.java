package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WenwutongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WenwutongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WenwutongjiView;


/**
 * 文物统计
 *
 * @author 
 * @email 
 * @date 2021-04-09 18:09:12
 */
public interface WenwutongjiService extends IService<WenwutongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenwutongjiVO> selectListVO(Wrapper<WenwutongjiEntity> wrapper);
   	
   	WenwutongjiVO selectVO(@Param("ew") Wrapper<WenwutongjiEntity> wrapper);
   	
   	List<WenwutongjiView> selectListView(Wrapper<WenwutongjiEntity> wrapper);
   	
   	WenwutongjiView selectView(@Param("ew") Wrapper<WenwutongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenwutongjiEntity> wrapper);
   	
}

