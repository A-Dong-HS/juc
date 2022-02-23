package com.study.pc;

/**
 * @author: Heshan Dong
 * @date: 2022/2/23
 */
public class Test2 {
    public static void main(String[] args) {
        Method method = new Method();
        new Thread(() -> {
            try {
                for (int i = 0;i < 10;i++){
                    method.increment();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"A").start();

        new Thread(() -> {
            try {
                for (int i = 0;i < 10;i++){
                    method.decrement();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"B").start();

        new Thread(() -> {
            try {
                for (int i = 0;i < 10;i++){
                    method.increment();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"C").start();

        new Thread(() -> {
            try {
                for (int i = 0;i < 10;i++){
                    method.decrement();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"D").start();
    }
}
