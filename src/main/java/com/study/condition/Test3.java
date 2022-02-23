package com.study.condition;

/**
 * @author: Heshan Dong
 * @date: 2022/2/23
 */
public class Test3 {
    public static void main(String[] args) {
        MethodAndAttribute methodAndAttribute = new MethodAndAttribute();

        new Thread(() -> {
            for (int i=0;i<10;i++) {
                methodAndAttribute.printA();
            }
        },"A").start();

        new Thread(() -> {
            for (int i=0;i<10;i++) {
                methodAndAttribute.printB();
            }
        },"B").start();

        new Thread(() -> {
            for (int i=0;i<10;i++) {
                methodAndAttribute.printC();
            }
        },"C").start();
    }
}
