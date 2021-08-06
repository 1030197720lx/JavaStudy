package com.lele.single;

/**
 * 懒汉式-线程安全
 */
public class Singleton3 {
    private volatile static Singleton3 singleton = null;
    private Singleton3(){

    }

    public static Singleton3 getSingleton(){
        synchronized(Singleton3.class){
            if(singleton==null){
                singleton = new Singleton3();
            }
        }
        return singleton;
    }

}
