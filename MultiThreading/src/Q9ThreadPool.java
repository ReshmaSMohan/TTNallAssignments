
/*
* Increase concurrency with Thread pools using newCachedThreadPool() and newFixedThreadPool().
* */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Q9ThreadPool {
    public static void main(String[] args) {
        /*
        * newCachedThreadPool() : Creates a thread pool that creates new threads as needed,
        * but will reuse previously constructed threads when they are available.
        * */

       // ExecutorService executorService= Executors.newCachedThreadPool();

        /*
        * newFixedThreadPool() : Creates a thread pool that reuses a fixed number number of threads.
        * */
        ExecutorService executorService= Executors.newFixedThreadPool(10);

        for (int i = 0; i <= 30; i++) {
            executorService.submit(new MyCallable(i));
        }
        executorService.shutdown();
    }
}
