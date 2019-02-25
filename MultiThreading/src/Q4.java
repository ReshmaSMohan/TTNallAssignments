import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Q4 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        try {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 1");
                }
            });

            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 2");
                }
            });

            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 3");
                }
            });

            System.out.println(executorService.isShutdown());
        } finally {
            executorService.shutdown();
        }

        /*
         * when we use shutdownNow the executorService() shuts down without checking whether
         * all the threads are executed or not
         * */

        executorService.shutdownNow();
    }
}


