package com.study.demo01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: Heshan Dong
 * @date: 2022/2/23
 */
public class SaleTickets {
    private int tickets = 30;

    Lock lock = new ReentrantLock();

    public void sale(){

        lock.lock();
        try {
            if (tickets > 0) {
                System.out.println(Thread.currentThread().getName()+"卖出第"+(30-(tickets--))+"张票，剩余票数"+tickets);
            }
        } finally {
            lock.unlock();
        }
    }

}
