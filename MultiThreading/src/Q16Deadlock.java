import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * Create a deadlock and Resolve it using tryLock().
 * */
public class Q16Deadlock {
    Lock lock1 = new ReentrantLock(true);
    Lock lock2 = new ReentrantLock(true);

    public int acquireLock(Lock lock1, Lock lock2) {
        boolean acquireLock1 = lock1.tryLock();
        boolean acquireLock2 = lock2.tryLock();

        if (acquireLock1 && acquireLock2) {
            return 1;
        }

        if (acquireLock1) {
            lock1.unlock();
        }

        if (acquireLock2) {
            lock2.unlock();
        }
        return 0;

    }

    public void method1() {
        if (acquireLock(lock1, lock2) == 1) {
            System.out.println("lock 1 method 1");
            System.out.println("lock 2 method 1");
            lock2.unlock();
            lock1.unlock();
        } else
            System.out.println("lock not aquired method1");
    }

    public void method2() {
        if (acquireLock(lock2, lock1) == 1) {
            System.out.println("lock 1 method 2");
            System.out.println("lock 2 method 2");
            lock1.unlock();
            lock2.unlock();
        } else
            System.out.println("lock not aquired method2");

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
