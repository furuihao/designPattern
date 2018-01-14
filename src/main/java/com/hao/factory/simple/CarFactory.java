package com.hao.factory.simple;

/**
 * 汽车工厂简单工厂
 *
 * @author hao
 * @create 2018/1/14
 */
public class CarFactory {
    public Car create(String type){
        switch (type){
            case "BYD":
                return new BYDCar();
            case "BMW":
                return new BMWCar();
            default:
                throw new RuntimeException("创建汽车失败,类型不存在");
        }
    }
}
