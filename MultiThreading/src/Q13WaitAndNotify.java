
/*
* Coordinate 2 threads using wait() and notify().
* */

public class Q13WaitAndNotify {

    public void method1()throws Exception{
        synchronized (this){
            System.out.println("method 1 : ");
            wait();
            System.out.println("Ended Method 1");
        }
    }

    public void method2(){
        synchronized (this){
            System.out.println("method 2 : ");
            System.out.println("Ended Method 2");
            notify();

        }
    }
}

class DemoMain{
    public static void main(String[] args) {

        Q13WaitAndNotify q13WaitAndNotify = new Q13WaitAndNotify();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    q13WaitAndNotify.method1();
                }
                catch(Exception ex)
                {
                    System.out.println(ex);
                }

            }
        });
        thread1.start();
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                q13WaitAndNotify.method2();
            }
        });
        thread2.start();
    }
}
