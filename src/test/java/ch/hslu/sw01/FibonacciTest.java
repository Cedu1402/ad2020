package ch.hslu.sw01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void testfiboRec1OneShouldReturnOne() {
        assertEquals(1, Fibonacci.fiboRec1(1));
    }

    @Test
    void testfiboRec1TwoShouldReturnOne() {
        assertEquals(1, Fibonacci.fiboRec1(2));
    }

    @Test
    void testfiboRec1FiveShouldReturnFive(){
        assertEquals(5,  Fibonacci.fiboRec1(5));
    }

    @Test
    void testfiboRec1NullShouldReturnNull(){
        assertEquals(0,  Fibonacci.fiboRec1(0));
    }

    @Test
    void testfiboRec1TenShouldReturn55(){
        assertEquals(55,  Fibonacci.fiboRec1(10));
    }

    @Test
    void testfiboIterOneShouldReturnOne() {
        assertEquals(1, Fibonacci.fiboIter(1));
    }

    @Test
    void testfiboIterTwoShouldReturnOne() {
        assertEquals(1, Fibonacci.fiboIter(2));
    }

    @Test
    void testfiboIterFiveShouldReturnFive(){
        assertEquals(5,  Fibonacci.fiboIter(5));
    }

    @Test
    void testfiboIterNullShouldReturnNull(){
        assertEquals(0,  Fibonacci.fiboIter(0));
    }

    @Test
    void testfiboIterTenShouldReturn55(){
        assertEquals(55,  Fibonacci.fiboIter(10));
    }

}