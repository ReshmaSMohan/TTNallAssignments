
public class MyCallable implements Runnable {

    int id;

    public MyCallable(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Thread name::" + Thread.currentThread().getName() + " Start :" + id);
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread name::" + Thread.currentThread().getName() + " End :" + id);
    }
}

