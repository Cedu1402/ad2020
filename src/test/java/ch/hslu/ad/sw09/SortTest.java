package ch.hslu.ad.sw09;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class SortTest {
    @Test
    void testInsertionSort() {
        int[] test = new int[]{5, 3, 4, 6, 7, 8, 2};
        Sort.insertionSort(test);
        assertEquals(2, test[0]);
        assertEquals(3, test[1]);
        assertEquals(8, test[test.length -1]);
    }

    @Test
    void testSelectionSort() {
        int[] test = new int[]{5, 3, 4, 6, 7, 8, 2};
        Sort.selectionSort(test);
        assertEquals(2, test[0]);
        assertEquals(3, test[1]);
        assertEquals(8, test[test.length -1]);
    }

    @Test
    void testBubbleSort() {
        int[] test = new int[]{5, 3, 4, 6, 7, 8, 2};
        Sort.bubbleSort(test);
        assertEquals(2, test[0]);
        assertEquals(3, test[1]);
        assertEquals(8, test[test.length -1]);
    }

    @Test
    void testBubbleOptimizedSort() {
        int[] test = new int[]{5, 3, 4, 6, 7, 8, 2};
        Sort.bubbleSortOptimized(test);
        assertEquals(2, test[0]);
        assertEquals(3, test[1]);
        assertEquals(8, test[test.length -1]);
    }

    @Test
    void testShellSort() {
        int[] test = new int[]{5, 3, 4, 6, 7, 8, 2};
        Sort.shellSort(test);
        assertEquals(2, test[0]);
        assertEquals(3, test[1]);
        assertEquals(4, test[2]);
        assertEquals(8, test[test.length -1]);
    }

    @Test
    void testShellSortHard() {
        Random random = new Random();
        int[] test = random
                .ints(20000, 10,500000)
                .toArray();
        Sort.shellSort(test);
        for(int i = 1; i < test.length; i++) {
            assertTrue(test[i - 1] < test[i]);
            assertTrue(test[i] < test[i + 1]);
        }
    }


}
