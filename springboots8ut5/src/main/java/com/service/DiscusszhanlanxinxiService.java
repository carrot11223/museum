package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszhanlanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszhanlanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszhanlanxinxiView;


/**
 * 展览信息评论表
 *
 * @author 
 * @email 
 * @date 2021-04-09 18:09:12
 */
public interface DiscusszhanlanxinxiService extends IService<DiscusszhanlanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszhanlanxinxiVO> selectListVO(Wrapper<DiscusszhanlanxinxiEntity> wrapper);
   	
   	DiscusszhanlanxinxiVO selectVO(@Param("ew") Wrapper<DiscusszhanlanxinxiEntity> wrapper);
   	
   	List<DiscusszhanlanxinxiView> selectListView(Wrapper<DiscusszhanlanxinxiEntity> wrapper);
   	
   	DiscusszhanlanxinxiView selectView(@Param("ew") Wrapper<DiscusszhanlanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszhanlanxinxiEntity> wrapper);
   	
}

