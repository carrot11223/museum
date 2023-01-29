package com.entity.view;

import com.entity.DiscusszhanlanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 展览信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-09 18:09:12
 */
@TableName("discusszhanlanxinxi")
public class DiscusszhanlanxinxiView  extends DiscusszhanlanxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusszhanlanxinxiView(){
	}
 
 	public DiscusszhanlanxinxiView(DiscusszhanlanxinxiEntity discusszhanlanxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discusszhanlanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
