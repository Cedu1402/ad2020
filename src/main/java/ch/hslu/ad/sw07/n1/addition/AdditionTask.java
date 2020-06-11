package ch.hslu.ad.sw07.n1.addition;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AdditionTask implements Runnable {

    private static final Logger LOG = LogManager.getLogger(AdditionTask.class);
    private volatile Thread runThread;
    private volatile boolean isStopped = false;
    private int rangeEnd;
    private int rangeBegin;

    public AdditionTask(int start, int stop){
        this.rangeBegin = start;
        this.rangeEnd = stop;
    }


    public void stopRequest() {
        isStopped = true;
        if (runThread != null) {
            runThread.interrupt();
        }
    }

    public boolean isStopped() {
        return isStopped;
    }

    @Override
    public void run() {
        this.runThread = Thread.currentThread();
        int n = 0;
        // Initialisierungsphase
        long sum = 0;
        // Arbeitsphase
        for (int i = this.rangeBegin; i <= this.rangeEnd; i++) {
            if(isStopped()){
                break;
            }
            sum += i;
            n++;
            try{
                Thread.sleep(50000);
            }catch (Exception ex){
                runThread.interrupt();;
            }

        }
        // Aufräumphase
        if (!isStopped()) {
            LOG.info(runThread.getName() + ": SUM " + n + " -> " + sum);
        }
        else {
            LOG.info(runThread.getName() + ": interrupted.");
        }
    }
}
