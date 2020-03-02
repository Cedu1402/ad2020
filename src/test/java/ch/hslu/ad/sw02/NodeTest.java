package ch.hslu.ad.sw02;

import ch.hslu.ad.sw01.Fibonacci;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NodeTest {


    @Test
    void testfiboRec1OneShouldReturnOne() {
        assertEquals(1, Fibonacci.fiboRec1(1));
    }

}
