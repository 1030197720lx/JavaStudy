package com.lele.single;

import java.io.IOException;
import java.util.Properties;

/**
 * 饿汉式-在类初始化时创建、不管需要不需要-静态代码块初始化
 * 1、构造方法私有化，
 * 2、全局唯一，必须自己创建自己的实例
 * 3、必须给所有对象提供实例
 *
 * 直接讲实例声明为public,通过CLass.INSTANCE调用
 */
public class Singleton1 {
    private String info;
    public static final Singleton1 INSTANCE;
    private Singleton1(String info){
        this.info = info;
    }
    static {
        //可以在static处理其他东西，比如有参构造方法的获取
        Properties pro = new Properties();
        try {
            pro.load(Singleton1.class.getClassLoader().getResourceAsStream("singleton.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        INSTANCE = new Singleton1(pro.getProperty("info"));
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
