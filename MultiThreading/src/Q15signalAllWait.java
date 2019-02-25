
/*
* Q15 Use Reentract lock for coordinating 2 threads with signal(), signalAll() and wait().
* */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Q15signalAllWait {
    Lock lock = new ReentrantLock(true);
    int count;

    void increment(){
        lock.lock();
        count++;
        lock.unlock();
    }

    public void method1(){
        for (int i = 1; i <= 1000; i++) {
            increment();
        }
    }

    public void method2(){
        for (int i = 1; i <= 1000; i++) {
            increment();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Q15signalAllWait q15signalAllWait = new Q15signalAllWait();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                q15signalAllWait.method1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                q15signalAllWait.method2();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(q15signalAllWait.count);
    }
}
