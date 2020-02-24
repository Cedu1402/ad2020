package ch.hslu.ad.sw01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AckermannTest {

    @Test
    void testCalculateShouldReturnSeven() {
        assertEquals(7, Ackermann.calculate(2, 2));
    }

    @Test
    void testCalculateShouldReturn4() {
        assertEquals(4, Ackermann.calculate(1, 2));
    }

    @Test
    void testCalculateShouldReturn5() {
        assertEquals(5, Ackermann.calculate(0, 4));
    }

}
