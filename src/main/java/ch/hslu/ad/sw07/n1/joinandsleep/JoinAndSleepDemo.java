package ch.hslu.ad.sw07.n1.joinandsleep;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class JoinAndSleepDemo {

    private static final Logger LOG = LogManager.getLogger(JoinAndSleepDemo.class);

    public static void main(String[] args) {
        Thread thread3 = new Thread(() -> {
            try{
                Thread.sleep(4000);
                LOG.info("Thread 3 beendet.");
            }catch (Exception e){
                LOG.error(e);
            }

        });
        Thread thread2 = new Thread(() -> {
            try{
                thread3.join();
                Thread.sleep(3000);
                LOG.info("Thread 2 beendet.");
            }catch (Exception e){
                LOG.error(e);
            }
        }, "Thread 2");

        Thread thread1 = new Thread(() -> {
            try{
                thread2.join();
                Thread.sleep(2000);
                LOG.info("Thread 1 beendet.");
            }catch (Exception e){
                LOG.error(e);
            }
        }, "Thread 1");

        try{
            thread1.start();
            thread2.start();
            thread3.start();
            thread1.join();

        }catch (Exception e){
            LOG.info("Ein fehler ist aufgetreten.");
        }
    }
}
