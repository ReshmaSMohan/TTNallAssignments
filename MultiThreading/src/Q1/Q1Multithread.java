package Q1;

public class Q1Multithread {
    public static void main(String[] args) {
//        Q1TheadClass thread = new Q1TheadClass();
//        thread.start();

        Thread thread = new Thread(new Q1UsingRunnable());
        thread.start();

        for (int i=0;i<10;i++)
            System.out.println("main class");
    }


}
