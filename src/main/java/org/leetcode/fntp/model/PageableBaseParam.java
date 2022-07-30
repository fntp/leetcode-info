package org.leetcode.fntp.model;

import java.io.Serializable;

/**
 * 
 * @author guojingjing
 *
 */
public class PageableBaseParam implements Serializable {
	private static final long serialVersionUID = -2395156264660693014L;
	private Integer pageSize;
	private Integer pageNum;
	/** 排序字段 **/
	private String sortField;
	/** 0 升序 1降序 **/
	private Integer sortType;
	
	public String getSortField() {
		return sortField;
	}
	public void setSortField(String sortField) {
		this.sortField = sortField;
	}
	public Integer getSortType() {
		return sortType;
	}
	public void setSortType(Integer sortType) {
		this.sortType = sortType;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
}
