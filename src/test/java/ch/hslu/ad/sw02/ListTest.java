package ch.hslu.ad.sw02;
import ch.hslu.ad.sw02.list.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ListTest {

    @Test
    void testAddShouldAddItemToList() {
        List actual = new List();
        actual.Add(new Allocation(9, 9));
        assertEquals(1, actual.size());
    }

    @Test
    void testSizeShouldReturn2() {
        List actual = new List();
        actual.Add(new Allocation(9, 9));
        actual.Add(new Allocation(50, 10));
        assertEquals(2, actual.size());
    }

    @Test
    void testContainsShouldReturnTrue() {
        List actual = new List();
        Allocation testItem = new Allocation(9, 9);
        actual.Add(testItem);
        actual.Add(new Allocation(50, 10));
        assertTrue(actual.contains(testItem));
    }

    @Test
    void testContainsItemLastShouldReturnTrue() {
        List actual = new List();
        Allocation testItem = new Allocation(9, 9);
        actual.Add(new Allocation(50, 10));
        actual.Add(testItem);
        assertTrue(actual.contains(testItem));
    }

    @Test
    void testContainsItemMiddleShouldReturnTrue() {
        List actual = new List();
        Allocation testItem = new Allocation(9, 9);
        actual.Add(new Allocation(50, 10));
        actual.Add(new Allocation(33, 10));
        actual.Add(testItem);
        actual.Add(new Allocation(66, 10));
        actual.Add(new Allocation(99, 10));
        assertTrue(actual.contains(testItem));
    }

    @Test
    void testPoll() {
        List actual = new List();
        Allocation testItem = new Allocation(9, 9);
        Allocation testItem2 = new Allocation(9, 9);
        actual.Add(new Allocation(66, 10));
        actual.Add(testItem2);
        actual.Add(testItem);
        assertEquals(testItem, actual.poll());
        assertEquals(2, actual.size());
        assertEquals(testItem2, actual.poll());
        assertEquals(1, actual.size());
    }


    @Test
    void testRemoveExistingItem() {
        List actual = new List();
        Allocation testItem = new Allocation(9, 9);
        actual.Add(testItem);
        Allocation remaining = new Allocation(50, 10);
        actual.Add(remaining);
        actual.remove(testItem);
        assertEquals(1, actual.size());
        assertTrue(actual.contains(remaining));
    }

    @Test
    void testRemoveExistingItemFirst() {
        List actual = new List();
        actual.Add(new Allocation(66, 10));
        actual.Add(new Allocation(99, 10));
        Allocation remaining = new Allocation(50, 10);
        actual.Add(remaining);
        Allocation testItem = new Allocation(9, 9);
        actual.Add(testItem);
        actual.remove(testItem);
        assertEquals(3, actual.size());
        assertTrue(actual.contains(remaining));
    }

    @Test
    void testRemoveExistingItemLast() {
        List actual = new List();
        Allocation testItem = new Allocation(9, 9);
        actual.Add(testItem);
        actual.Add(new Allocation(66, 10));
        actual.Add(new Allocation(99, 10));
        Allocation remaining = new Allocation(50, 10);
        actual.Add(remaining);
        actual.remove(testItem);
        assertEquals(3, actual.size());
        assertTrue(actual.contains(remaining));
    }

    @Test
    void testRemoveNotExistingItem() {
        List actual = new List();
        Allocation testItem = new Allocation(9, 9);
        actual.Add(testItem);
        Allocation remaining = new Allocation(50, 10);
        actual.Add(remaining);
        actual.remove(new Allocation(88, 1));
        assertEquals(2, actual.size());
        assertTrue(actual.contains(remaining));
        assertTrue(actual.contains(testItem));
    }

    @Test
    void testRemoveNullItem() {
        List actual = new List();
        Allocation testItem = new Allocation(9, 9);
        actual.Add(testItem);
        Allocation remaining = new Allocation(50, 10);
        actual.Add(remaining);
        actual.remove(null);
        assertEquals(2, actual.size());
        assertTrue(actual.contains(remaining));
        assertTrue(actual.contains(testItem));
    }

}
