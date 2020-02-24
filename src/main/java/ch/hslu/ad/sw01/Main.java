package ch.hslu.ad.sw01;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static Logger LOG = LogManager.getLogger();

    public static void main(String[] args){
        runAha();
    }

    private static void runEuklid(){
         LOG.info("Version 1");
        LOG.info(Euklid.ggtIterativ1(28, 68));
        LOG.info("Version 2");
        LOG.info(Euklid.ggtIterativ2(28, 68));
        LOG.info("Version 3");
        LOG.info(Euklid.ggtRekursiv(28, 68));
    }

    private static void runAha(){
        long startTime = System.currentTimeMillis();
        Aha.task(1, 5);
        LOG.info("Zeit: " + (System.currentTimeMillis() - startTime));
        startTime = System.currentTimeMillis();
        Aha.task(5, 5);
        LOG.info("Zeit: " + (System.currentTimeMillis() - startTime));
        startTime = System.currentTimeMillis();
        Aha.task(10, 5);
        LOG.info("Zeit: " + (System.currentTimeMillis() - startTime));
    }
}
