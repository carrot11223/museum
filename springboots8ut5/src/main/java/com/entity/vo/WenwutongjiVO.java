package com.entity.vo;

import com.entity.WenwutongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 文物统计
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-09 18:09:12
 */
public class WenwutongjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 博物馆
	 */
	
	private String bowuguan;
		
	/**
	 * 文物数量
	 */
	
	private Integer wenwushuliang;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：博物馆
	 */
	 
	public void setBowuguan(String bowuguan) {
		this.bowuguan = bowuguan;
	}
	
	/**
	 * 获取：博物馆
	 */
	public String getBowuguan() {
		return bowuguan;
	}
				
	
	/**
	 * 设置：文物数量
	 */
	 
	public void setWenwushuliang(Integer wenwushuliang) {
		this.wenwushuliang = wenwushuliang;
	}
	
	/**
	 * 获取：文物数量
	 */
	public Integer getWenwushuliang() {
		return wenwushuliang;
	}
				
	
	/**
	 * 设置：登记日期
	 */
	 
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
