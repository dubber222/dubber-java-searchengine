package com.dubber.search.engine.model;

/**
 * Created on 2018/5/8.
 *
 * @author dubber
 *         <p>
 *         搜索时用于排序的Bean
 */
public class SortBean {
    private String id;
    private int times;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public int getTimes() {
        return times;
    }
    public void setTimes(int times) {
        this.times = times;
    }
}
