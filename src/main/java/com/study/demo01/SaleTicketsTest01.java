package com.study.demo01;

/**
 * @author: Heshan Dong
 * @date: 2022/2/23
 */
public class SaleTicketsTest01 {

    public static void main(String[] args) {

        SaleTickets saleTickets = new SaleTickets();

        new Thread(() -> {
            for (int i = 0;i < 10;i++){
                saleTickets.sale();
            }
        },"A").start();

        new Thread(() -> {
            for (int i = 0;i < 10;i++){
                saleTickets.sale();
            }
        },"B").start();

        new Thread(() -> {
            for (int i = 0;i < 10;i++){
                saleTickets.sale();
            }
        },"C").start();


    }
}


