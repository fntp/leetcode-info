package org.leetcode.fntp.model;
/**
 * 
 * @author fntp
 *
 * @param <T>
 */
public class PageableBaseResult<T> extends BaseResult<PageableData<T>> {
	private static final long serialVersionUID = 1653099124648965901L;
	
	public PageableBaseResult() {
		super(new PageableData<T>());
	}
	
	public PageableBaseResult(PageableData<T> data) {
		super(data);
	}
	
}
