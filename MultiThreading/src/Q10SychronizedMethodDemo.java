public class Q10SychronizedMethodDemo {

    public int sharedCount;

    synchronized public void increamentCount(){
        sharedCount++;
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

class MyMainClass1{
    public static void main(String[] args) throws InterruptedException {

        Q10SychronizedMethodDemo q10SychronizedMethodDemo = new Q10SychronizedMethodDemo();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                q10SychronizedMethodDemo.method1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                q10SychronizedMethodDemo.method2();
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(q10SychronizedMethodDemo.sharedCount);
    }
}
