package Q7;

import java.util.concurrent.Callable;

public class Q7MyCallable2 implements Callable {
    @Override
    public Object call() throws Exception {
        for (int i=0;i<10;i++)
            System.out.println("==from callable2");
        return Thread.currentThread().getName();
    }
}