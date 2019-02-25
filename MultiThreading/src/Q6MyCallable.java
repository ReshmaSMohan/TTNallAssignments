
/*
 * sometimes we wish that a thread could return some value that we can use.
 * Java 5 introduced java.util.concurrent.Callable interface in concurrency package
 * that is similar to Runnable interface but it can return any Object and able to throw Exception*/

//Q.6Return a Future from ExecutorService by using callable and use get(), isDone(), isCancelled()
// with the Future object to know the status of task submitted.

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Q6MyCallable implements Callable {
    @Override
    public Object call() throws Exception {
        return Thread.currentThread().getName();
    }
}

class myMain {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        List<Future<String>> list = new ArrayList<>();

        Callable<String> callable = new Q6MyCallable();

        for (int i = 0; i < 10; i++) {
            Future<String> future = executorService.submit(callable);
            list.add(future);
        }

        for (Future<String> stringFuture:
        list){
            try {
                System.out.println(stringFuture.get()+" : "+stringFuture.isDone()+" : "+stringFuture.isCancelled());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        executorService.shutdown();
    }
}
