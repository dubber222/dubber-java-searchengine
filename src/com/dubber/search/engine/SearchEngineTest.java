package com.dubber.search.engine;

import java.util.List;

/**
 * Created on 2018/5/8.
 *
 * @author dubber
 */
public class SearchEngineTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SearchBase searchBase = SearchBase.getSerachBase();
        searchBase.add("1", "你好！", "你好！");
        searchBase.add("2", "你好！我是张三。", "你好！我是张三。");
        searchBase.add("3", "今天的天气挺好的。", "今天的天气挺好的。");
        searchBase.add("4", "你是谁？", "你是谁？");
        searchBase.add("5", "高数这门学科很难", "高数确实很难。");
        searchBase.add("6", "测试", "上面的只是测试");
        String ids = searchBase.getIds("高");
        System.out.println(ids);
        List<Object> objs = searchBase.getObjects(ids);
        if (objs != null) {
            for (Object obj : objs) {
                System.out.println((String) obj);
            }
        }
    }
}
