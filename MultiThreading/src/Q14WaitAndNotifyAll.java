public class Q14WaitAndNotifyAll {

    public void method1() throws Exception {
        synchronized (this) {
            System.out.println("method 1 : ");
            wait();
            System.out.println("Ended Method 1");
        }
    }

    public void method2() throws Exception {
        synchronized (this) {
            System.out.println("method 2 : ");
            wait();
            System.out.println("Ended Method 2");
        }
    }

    public void method3() {
        synchronized (this) {
            System.out.println("method 3 : ");
            System.out.println("Ended Method 3");
            notifyAll();

        }
    }
}

class DemoMain1 {
    public static void main(String[] args) {

        Q14WaitAndNotifyAll q14WaitAndNotifyAll = new Q14WaitAndNotifyAll();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    q14WaitAndNotifyAll.method1();
                } catch (Exception ex) {
                    System.out.println(ex);
                }

            }
        });
        thread1.start();
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    q14WaitAndNotifyAll.method2();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        thread2.start();

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                q14WaitAndNotifyAll.method3();
            }
        });
        thread3.start();
    }
}
