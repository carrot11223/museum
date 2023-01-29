package com.entity.view;

import com.entity.WenwutongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 文物统计
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-09 18:09:12
 */
@TableName("wenwutongji")
public class WenwutongjiView  extends WenwutongjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WenwutongjiView(){
	}
 
 	public WenwutongjiView(WenwutongjiEntity wenwutongjiEntity){
 	try {
			BeanUtils.copyProperties(this, wenwutongjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
