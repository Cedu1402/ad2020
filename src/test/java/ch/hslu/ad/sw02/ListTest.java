package ch.hslu.ad.sw02;
import ch.hslu.ad.sw02.list.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

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

}
