package ch.hslu.ad.sw02.queue;

import ch.hslu.ad.sw02.stack.ArrayStack;
import ch.hslu.ad.sw02.stack.Stack;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class QueueTest {

    @Test
    void testNewQueueEmpty() {
        Queue actual = new QueueArray();
        assertThrows(NoSuchElementException.class, actual::dequeue);
    }

    @Test
    void testNewQueueNotEmpty() {
        Queue actual= new QueueArray();
        char test = 'c';
        actual.enqueue(test);
        assertEquals(test, actual.dequeue());
    }

    @Test
    void testNewQueueFull() {
        Queue actual= new QueueArray();
        actual.enqueue('a');
        actual.enqueue('b');
        actual.enqueue('c');
        actual.enqueue('c');
        actual.enqueue('e');
        actual.enqueue('f');
        actual.enqueue('g');
        actual.enqueue('h');
        assertThrows(IllegalStateException.class, () -> actual.enqueue('z'));
    }

    @Test
    void testNewQueueFullWithDequeue() {
        Queue actual= new QueueArray();
        char acutalChar = 'a';
        actual.enqueue(acutalChar);
        actual.enqueue('b');
        actual.enqueue('c');
        actual.enqueue('c');
        char test = actual.dequeue();
        assertEquals(acutalChar, test);

        actual.enqueue('e');
        actual.enqueue('f');
        actual.enqueue('g');
        actual.enqueue('h');
        actual.enqueue('i');
        assertThrows(IllegalStateException.class, () -> actual.enqueue('z'));
    }


    @Test
    void testNewQueueAllMoreThanPossibleDequeue() {
        Queue actual= new QueueArray();
        actual.enqueue('e');
        actual.enqueue('f');
        actual.dequeue();
        actual.dequeue();
        assertThrows(NoSuchElementException.class, actual::dequeue);
    }


    @Test
    void testNewQueueFullWithRing() {
        Queue actual= new QueueArray();
        char acutalChar = 'a';
        actual.enqueue(acutalChar);
        actual.enqueue('b');
        actual.enqueue('c');
        actual.enqueue('c');
        actual.enqueue('e');
        char actualChar2 = 'f';
        actual.enqueue(actualChar2);
        actual.enqueue('g');
        actual.enqueue('h');
        char test = actual.dequeue();
        assertEquals(acutalChar, test);
        actual.enqueue('b');
        actual.dequeue();
        actual.dequeue();
        actual.dequeue();
        actual.dequeue();
        actual.enqueue('c');
        actual.enqueue('c');
        actual.enqueue('e');
        assertEquals(actualChar2, actual.dequeue());
        actual.enqueue('e');
        actual.enqueue('e');
        assertThrows(IllegalStateException.class, () -> actual.enqueue('z'));
    }

}
