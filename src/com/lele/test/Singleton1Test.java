package com.lele.test;

import com.lele.single.Singleton1;
import com.lele.single.Singleton4;
import com.lele.single.Singleton5;

public class Singleton1Test {
    public static void main(String[] args) {
        Singleton1 s = Singleton1.INSTANCE;
        System.out.println(s.getInfo());
       // 普通类没有重写toString,所以输出的是类名+hashcode
        System.out.println(s);
        //枚举类型重写了toString方法，所以输出的是名字。
        Singleton4 s1 = Singleton4.INSTANCE;
        System.out.println(s1);
        Singleton5 s5 = Singleton5.getInstance();
    }
}
