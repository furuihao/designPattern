package com.hao.singleton;

/**
 * 单例模式--枚举式,(效率高,jvm提供保障线程安全,没有反射漏洞,但不能实现懒加载)
 * @author hao
 */
public enum Singleton4 {
    //枚举元素,就是一个单例对象
    INSTANCE ;

    public void operation(){

    }
}
