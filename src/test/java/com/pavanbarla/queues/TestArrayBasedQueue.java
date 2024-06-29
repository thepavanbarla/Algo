package com.pavanbarla.queues;

import org.junit.jupiter.api.Test;

import static com.pavanbarla.queues.Constants.EMPTY_QUEUE_ERROR_MESSAGE;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestArrayBasedQueue {

    /** Not really testing the individual methods but
     *  the queue implementation in a single test */
    @Test
    public void test(){

        ArrayBasedQueue<Integer> queue = new ArrayBasedQueue<>(Integer.class, 2);

        queue.enqueue(10);
        queue.enqueue(20);

        int fromQueue = queue.dequeue();
        assertEquals(10, fromQueue);

        queue.enqueue(30);
        queue.enqueue(40);

        int arraySize = queue.getArraySize();
        assertEquals(4, arraySize);

        int anotherFromQueue = queue.dequeue();
        assertEquals(20, anotherFromQueue);

        int yetAnotherFromQueue = queue.dequeue();
        assertEquals(30, yetAnotherFromQueue);

        int lastItemFromQueue = queue.dequeue();
        assertEquals(40, lastItemFromQueue);

        Exception exceptionThrown
                = assertThrows(RuntimeException.class, () -> queue.dequeue());

        assertEquals(EMPTY_QUEUE_ERROR_MESSAGE, exceptionThrown.getMessage());
    }

}
