package com.hao.factory.simple;

/**
 * 宝马汽车
 *
 * @author hao
 * @create 2018/1/14
 */
public class BMWCar implements Car {
    @Override
    public void run() {
        System.out.println("宝马汽车在跑");
    }
}
