package ch.hslu.ad.sw01;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Euklid {
    private static Logger LOG = LogManager.getLogger();

    static int  ggtIterativ1(int a, int b) {
        while(a != b) {
            if(a > b) {
                a = a - b;
            }
            else{
                b = b - a;
            }
            LOG.info("a: " + a);
            LOG.info("b: " + b);
        }
        return a;
    }

    public static int   ggtIterativ2(int a,  int  b) {
        while((a != 0) && (b != 0)) {
            if(a > b) {
                a = a % b;
            } else{
                b = b % a;
            }
            LOG.info("a: " + a);
            LOG.info("b: " + b);
        }
        return(a + b); // Entweder a oder b ist 0!
    }

    public static int ggtRekursiv(final int a, final int b) {
        if(a > b) {
            LOG.info("a: " + a);
            LOG.info("b: " + b);
            return ggtRekursiv(a - b, b);
        } else{
            if(a < b) {
                LOG.info("a: " + a);
                LOG.info("b: " + b);
                return ggtRekursiv(a, b - a);
            } else{
                return a;
            }
        }
    }
}
