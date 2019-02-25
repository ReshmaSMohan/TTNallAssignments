package Q1;

public class Q1TheadClass extends Thread {
    @Override
    public void run() {
        for (int i=0;i<10;i++)
            System.out.println("thread class");
    }
}
