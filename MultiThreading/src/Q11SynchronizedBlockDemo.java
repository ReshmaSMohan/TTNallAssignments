
/*
* Q11 Use Synchronize block to enable synchronization between multiple threads trying to access method at same time.
* */

public class Q11SynchronizedBlockDemo {
    public int sharedCount;

    public void increamentCount(){
        synchronized (this) {
            sharedCount++;
        }
    }
    public void method1(){
        for(int i=0;i<1000;i++) {
            System.out.println("method 1 : "+sharedCount);
            increamentCount();
        }
    }

    public void method2(){
        for(int i=0;i<1000;i++) {
            System.out.println("method 2 : "+sharedCount);
            increamentCount();
        }
    }
}

class MyMainClass{
    public static void main(String[] args) throws InterruptedException {

        Q11SynchronizedBlockDemo q11SynchronizedBlockDemo = new Q11SynchronizedBlockDemo();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                q11SynchronizedBlockDemo.method1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                q11SynchronizedBlockDemo.method2();
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(q11SynchronizedBlockDemo.sharedCount);
    }
}
