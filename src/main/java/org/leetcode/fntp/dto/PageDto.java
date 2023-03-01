package org.leetcode.fntp.dto;

import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;


public class PageDto<E> {
    @ApiModelProperty(
            value = "当前页码",
            example = "0"
    )
    private long curPage;
    @ApiModelProperty(
            value = "每页数量",
            example = "10"
    )
    private long pageSize;
    @ApiModelProperty(
            value = "起始行",
            example = "0"
    )
    private long startRow;
    @ApiModelProperty(
            value = "总行数",
            example = "0"
    )
    private long totalRows;
    @ApiModelProperty(
            value = "总页数",
            example = "0"
    )
    private long totalPages;
    @ApiModelProperty(
            name = "数据",
            value = "数据"
    )
    private List<E> result;

    public PageDto() {
    }

    public PageDto(long curPage, long pageSize) {
        this.curPage = curPage;
        this.pageSize = pageSize;
        this.startRow = curPage > 1L ? (curPage - 1L) * pageSize : 0L;
        this.result = new ArrayList();
    }

    public PageDto(long curPage, long pageSize, long totalRows) {
        this.curPage = curPage;
        this.pageSize = pageSize;
        this.startRow = curPage > 1L ? (curPage - 1L) * pageSize : 0L;
        this.totalRows = totalRows;
        this.result = new ArrayList();
    }

    public PageDto(long curPage, long pageSize, long totalRows, List<E> result) {
        this.curPage = curPage;
        this.pageSize = pageSize;
        this.startRow = curPage > 1L ? (curPage - 1L) * pageSize : 0L;
        this.totalRows = totalRows;
        this.result = result;
    }

    public Boolean isEmpty() {
        return Objects.equals(0L, this.totalRows) || this.result == null || this.result.isEmpty();
    }

    public static <E> PageDto empty(Class<E> clazz) {
        List<E> emptyList = Collections.emptyList();
        return new PageDto(1L, 10L, 0L, emptyList);
    }

    public static PageDto empty() {
        return new PageDto(1L, 10L);
    }

    public long getCurPage() {
        return this.curPage;
    }

    public void setCurPage(long curPage) {
        this.curPage = curPage;
        this.startRow = curPage > 1L ? (curPage - 1L) * this.pageSize : 0L;
    }

    public long getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(long pageSize) {
        this.pageSize = pageSize;
        this.startRow = this.curPage > 1L ? (this.curPage - 1L) * pageSize : 0L;
    }

    public long getStartRow() {
        return this.startRow;
    }

    public void setStartRow(long startRow) {
        this.startRow = startRow;
    }

    public long getTotalRows() {
        return this.totalRows;
    }

    public void setTotalRows(long totalRows) {
        this.totalRows = totalRows;
    }

    public long getTotalPages() {
        return this.totalRows > 0L && this.pageSize > 0L ? this.totalRows / this.pageSize + (long)(this.totalRows % this.pageSize > 0L ? 1 : 0) : this.totalPages;
    }

    public void setTotalPages(long totalPages) {
        this.totalPages = totalPages;
    }

    public List<E> getResult() {
        return this.result;
    }

    public void setResult(List<E> result) {
        this.result = result;
    }

    public String toString() {
        return "Page{curPage=" + this.curPage + ", pageSize=" + this.pageSize + ", startRow=" + this.startRow + ", totalRows=" + this.totalRows + ", totalPages=" + this.totalPages + ", result=" + this.result + '}';
    }
}
