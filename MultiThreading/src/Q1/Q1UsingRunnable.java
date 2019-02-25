package Q1;

public class Q1UsingRunnable implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<10;i++)
            System.out.println("runnable");
    }

}
