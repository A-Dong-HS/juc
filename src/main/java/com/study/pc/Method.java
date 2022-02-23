package com.study.pc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: Heshan Dong
 * @date: 2022/2/23
 */
public class Method {
    private int number = 0;

    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public void increment() throws InterruptedException {
        lock.lock();

        try {
            while (number != 0){
                condition.await();
//                this.wait();
            }
            number++;
            System.out.println(Thread.currentThread().getName()+":"+number);
//            this.notifyAll();
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void decrement() throws InterruptedException {
        lock.lock();
        try {
            while (number == 0) {
                condition.await();
//                this.wait();
            }
            number--;
            System.out.println(Thread.currentThread().getName() + ":" + number);
//            this.notifyAll();
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
