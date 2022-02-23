package com.study.callable;

import java.util.concurrent.Callable;

/**
 * @author: Heshan Dong
 * @date: 2022/2/23
 */
public class MethodAndAttribute01 implements Callable<Integer> {

    private int number = 111;

    @Override
    public Integer call() throws Exception {
        System.out.println("number=====>"+123);
        return number;
    }
}
