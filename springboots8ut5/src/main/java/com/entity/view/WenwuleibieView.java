package com.entity.view;

import com.entity.WenwuleibieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 文物类别
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-09 18:09:11
 */
@TableName("wenwuleibie")
public class WenwuleibieView  extends WenwuleibieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WenwuleibieView(){
	}
 
 	public WenwuleibieView(WenwuleibieEntity wenwuleibieEntity){
 	try {
			BeanUtils.copyProperties(this, wenwuleibieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
