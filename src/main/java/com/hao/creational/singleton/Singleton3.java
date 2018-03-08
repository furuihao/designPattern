package com.hao.creational.singleton;

/**
 * 单例模式--静态内部类实现懒加载
 *@author hao
 */
public class Singleton3 {
    private Singleton3(){};

    /**
     * 没有同步锁,效率高
     * @return
     */
    public static  Singleton3 getInstance(){
        return SingletonClassInstance.INSTANCE;
    }
    /**
     * 静态内部类
     * 线程安全
     *
     */
    private static class SingletonClassInstance{
        private static final Singleton3 INSTANCE = new Singleton3();
    }
}
