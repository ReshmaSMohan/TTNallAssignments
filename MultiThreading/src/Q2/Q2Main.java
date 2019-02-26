package Q2;

public class Q2Main {
    public static void main(String[] args) throws InterruptedException{
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for(int i=0;i<5;i++) {
                        Thread.sleep(100L);
                        System.out.println("Running 1st Thread");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for(int i=0;i<5;i++) {
                        Thread.sleep(100L);
                        System.out.println("Running 2st Thread");
                    };
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println("Ended....");

    }
}