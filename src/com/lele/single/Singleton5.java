package com.lele.single;

/**
 * 懒汉式-匿名内部类创建-jvm对匿名内部类做了处理使其线程安全
 * 静态内部类不会随着外部类的加载和初始化而初始化，他要单独去加载和初始化
 * 因为在内部类加载和初始化时创建的，所以线程安全，匿名内部类只有在被调用的时候才会加载，并且内部类的静态变量也是只有初始化的时候加载，且只加载一次
 */
public class Singleton5 {
    private Singleton5(){

    }
    private static class Inner{
        private static final Singleton5 instance = new Singleton5();
    }

    public static Singleton5 getInstance(){
        return Inner.instance;
    }

    public static String getInfo(){
        return "123";
    }
}
