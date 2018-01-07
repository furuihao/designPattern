package com.hao.singleton;

/**
 * @author hao
 * 单例模式--饿汉式
 */
@SuppressWarnings("ALL")
public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton(){};

    public static Singleton getInstance(){
        return instance;
    }
}
