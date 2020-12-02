package com.liwo.app.core;

/**
 * 分页请求基础类
 * Created by chenhuan on 15-9-13.
 */
public class BasePageReq extends BaseReq {
    /**
     * 排序字段
     */
    private String sort;
    /**
     * 起始数据
     */
    private int start = 0;
    /**
     * 返回条数
     */
    private int end = 10;

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
