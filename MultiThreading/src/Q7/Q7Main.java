package Q7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Q7Main {

    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Callable<String> cl1 = new Q7MyCallable1();
        Callable<String> cl2 = new Q7MyCallable2();
        Callable<String> cl3 = new Q7MyCallable3();

        Future<String> future1 = executorService.submit(cl1);
        Future<String> future2 = executorService.submit(cl2);
        Future<String> future3 = executorService.submit(cl3);

        List<Future<String>> futureList = new ArrayList<>();
        futureList.add(future1);
        futureList.add(future2);
        futureList.add(future3);

        for (Future<String> stringFuture :
                futureList) {
            System.out.println(stringFuture.get());
        }

        executorService.shutdown();

        /*
        * when time unit is minutes all tasks are completed
        * */
        executorService.awaitTermination(10L, TimeUnit.MICROSECONDS);

        if (executorService.isTerminated()) {
            System.out.println("Terminated");
        } else {
            System.out.println("One or more tasks still remaining");
        }

    }
}
