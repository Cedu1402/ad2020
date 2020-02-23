package ch.hslu.sw01;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Aha {

    private static Logger LOG = LogManager.getLogger();
    private static int task1Counter = 0;
    private static int task2Counter = 0;
    private static int task3Counter = 0;
    private static int sleepTime = 0;

    public static void task(final int n, final int sleepTime) {
        Aha.sleepTime = sleepTime;
        task1();
        task1();
        task1();
        task1();
        // T ~ 4
        for(int i = 0; i < n; i++) {
            // äussere Schleife: n-mal
            task2();
            task2();
            task2();
            // T ~ n · 3
            for(int   j = 0; j < n; j++) {
                // innerer Schleife: n-mal
                task3();
                task3(); // T ~ n · n· 2
            }
        }
        LOG.info("N: " + n);
        LOG.info("Task 1: " + task1Counter);
        LOG.info("Task 2: " + task2Counter);
        LOG.info("Task 3: " + task3Counter);
        LOG.info("Total : " + (task3Counter + task1Counter + task2Counter));
    }

    private static void task1() {
        sleep();
        task1Counter++;
    }

    private static void sleep(){
        try{
            Thread.sleep(sleepTime);
        }catch(InterruptedException ex){
            LOG.error("Shit", ex);
        }
    }

    private static void task2(){
        sleep();
        task2Counter++;
    }

    private static void task3(){
        sleep();
        task3Counter++;
    }
}
