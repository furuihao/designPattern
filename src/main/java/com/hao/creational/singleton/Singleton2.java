package com.hao.creational.singleton;

/**
 * @author hao
 * 单例模式--懒汉式
 */
@SuppressWarnings("ALL")
public class Singleton2 {
    private static Singleton2 instance ;
    private Singleton2(){};

    public static synchronized Singleton2 getInstance(){
        if (instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
}
