package com.lzf.demo.demo.common;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * 写点注释
 * <br/>
 * Created in 2019-03-05 19:05
 *
 * @author Li Zhenfeng
 */
public class DemoPage<T> implements Serializable {
    private static final long serialVersionUID = -8270224786645662371L;
    /**
     * 当前页
     */
    private Integer page;
    /**
     * 每页大小
     */
    private Integer pageSize;

    /**
     * 总页数
     */
    private Integer totalPages;
    /**
     * 总行数
     */
    private Long totalNumber;
    /**
     * 是否为首页
     */
    private Boolean first = false;
    /**
     * 是否为末页
     */
    private Boolean last = false;
    /**
     * 数据列表
     */
    private Collection<T> data;

    public DemoPage() {
    }

    public DemoPage(Integer page, Integer pageSize, Integer totalPages,
                    Long totalNumber, Boolean first, Boolean last, List<T> data) {
        this.page = page;
        this.pageSize = pageSize;
        this.totalPages = totalPages;
        this.totalNumber = totalNumber;
        this.first = first;
        this.last = last;
        this.data = data;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Long getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Long totalNumber) {
        this.totalNumber = totalNumber;
    }

    public Boolean getFirst() {
        return first;
    }

    public void setFirst(Boolean first) {
        this.first = first;
    }

    public Boolean getLast() {
        return last;
    }

    public void setLast(Boolean last) {
        this.last = last;
    }

    public Collection<T> getData() {
        return data;
    }

    public void setData(Collection<T> data) {
        this.data = data;
    }
}
