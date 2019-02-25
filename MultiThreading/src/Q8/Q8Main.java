package Q8;


/*
 * Schedule task using schedule(), scheduleAtFixedRate() and scheduleAtFixedDelay()
 * */


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Q8Main {

    public static void main(String[] args) {
        /*
         * schedule() : Creates and executes a callable task after the given delay
         */
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

        scheduledExecutorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("Task executed after 2 second");
            }
        }, 2, TimeUnit.SECONDS);

        ///////////////////////////////////////////////////////////////////////////////////
        /*
         * scheduleAtFixedRate method creates a new task
         * and submit it to the executor every period, regardless of whether or not the previous task finished.
         * */

        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
                                                         @Override
                                                         public void run() {
                                                             try {
                                                                 Thread.sleep(2000L);
                                                                 System.out.println("ScheduleAtFixedRate Scheduled Task to executed after fixed interval");
                                                             } catch (InterruptedException e) {
                                                                 e.printStackTrace();
                                                             }
                                                         }
                                                     }
                ,
                0, 1, TimeUnit.SECONDS);
        //////////////////////////////////////////////////////////////////////////////////
        /*
         * scheduleAtFixedDelay creates a new task after the previous task has finished
         * */

        scheduledExecutorService.scheduleWithFixedDelay(new Runnable() {
                                            @Override
                                            public void run() {
                                                try {
                                                    Thread.sleep(2000L);
                                                    System.out.println("ScheduleWithFixedDelay Scheduled Task to executed after fixed interval");
                                                } catch (InterruptedException e) {
                                                    e.printStackTrace();
                                                }

                                            }
                                        }
                        ,0,1,TimeUnit.SECONDS);
    }
}
