import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Q3andQ5 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        try{
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

            System.out.println("is shutdown : "+executorService.isShutdown());
            System.out.println("is terminated : "+executorService.isTerminated());
        }
        finally {
            System.out.println("is terminated : "+executorService.isTerminated());
            executorService.shutdown();
        }

        System.out.println("is shutdown : "+executorService.isShutdown());
        System.out.println("is terminated : "+executorService.isTerminated());

    }
}

