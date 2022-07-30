package org.leetcode.fntp.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author fntp
 *
 * @param <T>
 */
public class PageableData<T> implements Serializable {
	private static final long serialVersionUID = 841561286794636967L;
	
	/** 总数据量 **/
	private Long sum = 0L;
	
	/** 总页数 **/
	private Integer totalPage = 1;
	
	/** 每页数据量 **/
	private Integer pageSize = 20;
	
	/** 页码 从1开始 **/
	private Integer pageNum = 1;

	private Object other;
	
	/** 数据 **/
	private List<T> list = new ArrayList<>();
	
	public Long getSum() {
		return sum;
	}
	public void setSum(Long sum) {
		this.sum = sum;
	}
	public Integer getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
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
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	public Object getOther() {
		return other;
	}
	public void setOther(Object other) {
		this.other = other;
	}
}
