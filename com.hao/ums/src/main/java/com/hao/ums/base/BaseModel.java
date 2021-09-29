package com.hao.ums.base;

import lombok.Setter;

/** 
* @author TANG 
* @version 创建时间：2020年8月15日 下午3:45:19  
*/
@Setter
public class BaseModel {
	
	private static final Integer DEFAULT_PAGENUM = 0;
	
	private static final Integer DEFAULT_PAGESIZE = 20;
	
	private Integer pageNum;
	
	private Integer pageSize;
	
	private String companyId;
	
	protected String createdTime;
	
	private String createdBy;
	
	protected String updatedTime;
	
	private String updatedBy;
	
	private String fromTime;
	
	private String toTime;
	
	private String updateFromTime;
	
	private String updateToTime;
	
	private String def1;
	
	private String def2;
	
	private String def3;

	public Integer getPageNum() {
		return pageNum==null?DEFAULT_PAGENUM:pageNum;
	}

	public Integer getPageSize() {
		return pageSize==null?DEFAULT_PAGESIZE:pageSize;
	}

	public String getCreatedTime() {
		return createdTime;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public String getFromTime() {
		return fromTime;
	}

	public String getToTime() {
		return toTime;
	}

	public String getUpdatedTime() {
		return updatedTime;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public String getUpdateFromTime() {
		return updateFromTime;
	}

	public String getUpdateToTime() {
		return updateToTime;
	}

	public String getCompanyId() {
		return companyId;
	}

	public String getDef1() {
		return def1;
	}

	public String getDef2() {
		return def2;
	}

	public String getDef3() {
		return def3;
	}
}
