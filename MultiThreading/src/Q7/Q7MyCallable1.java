package Q7;

import java.util.concurrent.Callable;

public class Q7MyCallable1 implements Callable {
    @Override
    public Object call() throws Exception {
        for (int i=0;i<10;i++)
            System.out.println("==from callable1");
        return Thread.currentThread().getName();
    }
}
