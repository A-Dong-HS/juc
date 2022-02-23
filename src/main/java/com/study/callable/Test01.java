package com.study.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author: Heshan Dong
 * @date: 2022/2/23
 */
public class Test01 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MethodAndAttribute01 methodAndAttribute01 = new MethodAndAttribute01();

        FutureTask<Integer> futureTask = new FutureTask<>(methodAndAttribute01);

        new Thread(futureTask).start();
        System.out.println(futureTask.get());


    }
}
