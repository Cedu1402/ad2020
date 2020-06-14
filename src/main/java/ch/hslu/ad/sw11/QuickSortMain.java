package ch.hslu.ad.sw11;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class QuickSortMain {

    private static Logger LOG = LogManager.getLogger();

    public static void main(String[] args){
        char[] test = new char[] {'z', 'x', 'a', 'b', 'y'};
        QuickSort.quickSort(test, 0, test.length -1);

        LOG.info(Arrays.toString(test));
    }
}
