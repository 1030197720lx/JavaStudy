package com.lele.single;

/**
 * 饿汉式-直接new
 * 通过get体方法获取实例
 */
public class Singleton2 {
    private static final Singleton2 instance = new Singleton2();
    private Singleton2(){

    }

    public static Singleton2 getInstance() {
        return instance;
    }
}
