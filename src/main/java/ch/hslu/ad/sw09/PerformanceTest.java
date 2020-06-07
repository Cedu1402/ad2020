package ch.hslu.ad.sw09;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Random;
import java.util.stream.IntStream;


public class PerformanceTest {
    private static Logger LOG = LogManager.getLogger();

    public static void main(String[] args) {
        /*testInsertSortPerformance();
        testSelectionSortPerformance();
        testBubbleSortPerformance();
        testBubbleSortOptimizedPerformance();*/
        testShellSortPerformance();
    }

    private static void testInsertSortPerformance(){
        testSortPerformance(SortEnum.InsertSort);
    }

    private static void testSelectionSortPerformance(){
        testSortPerformance(SortEnum.SelectionSort);
    }

    private static void testBubbleSortPerformance(){
        testSortPerformance(SortEnum.BubbleSort);
    }

    private static void testBubbleSortOptimizedPerformance(){
        testSortPerformance(SortEnum.BubbleSortOptimized);
    }

    private static void testShellSortPerformance(){
        testSortPerformance(SortEnum.ShellSort);
    }


    /**
     * Runs selected sorting algorithm with different Arrays
     * and prints duration to console.
     * @param sort Sorting algorithm.
     */
    private static void testSortPerformance(SortEnum sort){
        long startTime;
        long endTime;
        int small = 5_000_000;
        int large = 10_000_000;

        int[] unsortedSmall = getRandomArray(small);
        int[] unsorted = getRandomArray(large);
        int[] unsortedCopy = unsorted.clone();

        LOG.info(sort.toString() +  " unsorted Array 20000 start: ");
        startTime = System.currentTimeMillis();
        runSort(sort, unsortedSmall);
        endTime = System.currentTimeMillis();
        LOG.info(sort.toString() +  " unsorted Array finished in: " + (endTime - startTime) + " millis.");


        LOG.info(sort.toString() +  " unsorted Array 400000 start: ");
        startTime = System.currentTimeMillis();
        runSort(sort, unsorted);
        endTime = System.currentTimeMillis();
        LOG.info(sort.toString() +  " unsorted Array finished in: " + (endTime - startTime) + " millis.");

        LOG.info(sort.toString() +  " unsorted Array 400000 second run start: ");
        startTime = System.currentTimeMillis();
        runSort(sort, unsortedCopy);
        endTime = System.currentTimeMillis();
        LOG.info(sort.toString() +  " unsorted Array second run finished in: " + (endTime - startTime) + " millis.");

        int[] presorted = getSortedArray(large);
        LOG.info(sort.toString() +  " presorted Array start: ");
        startTime = System.currentTimeMillis();
        Sort.insertionSort(presorted);
        runSort(sort, presorted);
        endTime = System.currentTimeMillis();
        LOG.info(sort.toString() +  " presorted Array finished in: " + (endTime - startTime) + " millis.");
    }

    /**
     * Runs selected sorting algorithm.
     * @param sort
     * @param a
     */
    private static void runSort(SortEnum sort, int[] a){
        switch (sort){
            case BubbleSort:
                Sort.bubbleSort(a);
                break;
            case InsertSort:
                Sort.insertionSort(a);
                break;
            case SelectionSort:
                Sort.selectionSort(a);
                break;
            case BubbleSortOptimized:
                Sort.bubbleSortOptimized(a);
                break;
            case ShellSort:
                Sort.shellSort(a);
                break;
        }
    }

    /**
     * Creates a int Array with random values.
     * @param size size of array
     * @return array with random values with specified size.
     */
    public static int[] getRandomArray(int size){
        Random random = new Random();
        return  random
                .ints(size, 10,500000)
                .toArray();
    }

    /**
     * Creates a int Array with sorted values.
     * @param size size of array
     * @return array with sorted values with specified size.
     */
    private static int[] getSortedArray(int size){
        return  IntStream.range(0, size).toArray();
    }


}
