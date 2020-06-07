package ch.hslu.ad.sw02.stack;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StackTest {

    @Test
    void testNewStackEmpty() {
        Stack actual = new ArrayStack();
        assertThrows(EmptyStackException.class, actual::pop);
    }

    @Test
    void testNewStackNotEmpty() {
        Stack actual = new ArrayStack();
        String test = "Test";
        actual.push(test);
        assertEquals(test, actual.pop());
    }

    @Test
    void testNewStackFull() {
        Stack actual = new ArrayStack();
        actual.push("test");
        assertThrows(StackOverflowError.class, () -> actual.push("kdflkd"));
    }
}
