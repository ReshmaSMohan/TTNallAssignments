import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
* Create a deadlock and Resolve it using tryLock().
* */
public class Q16Deadlock {
    Lock lock1 = new ReentrantLock(true);
    Lock lock2 = new ReentrantLock(true);

    public void method1(){
        lock1.lock();
        System.out.println("lock 1 worker 1");
        lock2.lock();
        System.out.println("lock 2 worker 1");
        lock2.unlock();
        lock1.unlock();
    }

    public void method2(){
        lock1.lock();
        System.out.println("lock 1 worker 2");
        lock2.lock();
        System.out.println("lock 2 worker 2");
        lock2.unlock();
        lock1.unlock();
    }

    public static void main(String[] args) throws InterruptedException {
        Q16Deadlock q16Deadlock = new Q16Deadlock();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                q16Deadlock.method1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                q16Deadlock.method2();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
