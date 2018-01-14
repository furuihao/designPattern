package com.hao.factory.simple;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarFactoryTest {
    @Test
    public void create() throws Exception {
        Car car = new CarFactory().create("BMW");
        car.run();
    }

}