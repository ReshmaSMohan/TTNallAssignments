
/*
* Q15 Use Reentract lock for coordinating 2 threads with signal(), signalAll() and wait().
* */

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Q15signalAllWait {
    Lock lock = new ReentrantLock(true);
    Condition condition = lock.newCondition();

    public void method1(){
        try {
            lock.lock();
            System.out.println("method 1 Started");
            condition.await();
            System.out.println("method 1 Finished");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void method2(){
        try{
            lock.lock();
            System.out.println("method 2 Started");
            condition.await();
            System.out.println("method 2 Finished");

        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void method3(){
        try {
            lock.lock();
            System.out.println("method 3 Started");
            System.out.println("method 3 Finished");
            condition.signal();
           // condition.signalAll();
        }  finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Q15signalAllWait q15signalAllWait = new Q15signalAllWait();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                q15signalAllWait.method1();
             //   q15signalAllWait.method2();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {

                q15signalAllWait.method3();
            }
        });

        thread1.start();
        thread2.start();;
        thread1.join();
        thread2.join();
    }
}
