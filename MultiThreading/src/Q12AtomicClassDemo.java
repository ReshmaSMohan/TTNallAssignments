import java.util.concurrent.atomic.AtomicInteger;

/*
* Use Atomic Classes instead of Synchronize method and blocks.
* */
public class Q12AtomicClassDemo {
    AtomicInteger sharedCount=new AtomicInteger();

    public void increamentCount(){

        synchronized (this){
            sharedCount.incrementAndGet();
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

class MyMainClass2{
    public static void main(String[] args) throws InterruptedException {

        Q12AtomicClassDemo q12AtomicClassDemo = new Q12AtomicClassDemo();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                q12AtomicClassDemo.method1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                q12AtomicClassDemo.method2();
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(q12AtomicClassDemo.sharedCount);
    }
}
