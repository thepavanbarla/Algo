package com.pavanbarla.queues;

import java.lang.reflect.Array;

import static com.pavanbarla.queues.Constants.EMPTY_QUEUE_ERROR_MESSAGE;

public class ArrayBasedQueue<T> implements Queue<T> {

    private final Class<T> itemType;
    private T[] array;
    private int firstItemIndex = 0;
    private int lastItemIndex = 0;
    private int numberOfElements = 0;

    public ArrayBasedQueue(Class<T> type, int initialSize) {
        itemType = type;
        array = (T[]) Array.newInstance(type, initialSize);
    }

    @Override
    public void enqueue(T item) {
        int length = array.length;
        if (numberOfElements == length) {
            biggerArray();
        }
        array[lastItemIndex++] = item;
        lastItemIndex %= length;
        numberOfElements++;
        System.out.println(item + " added to queue");
    }

    @Override
    public T dequeue() {
        if (numberOfElements == 0)
            throw new RuntimeException(EMPTY_QUEUE_ERROR_MESSAGE);

        T item = array[firstItemIndex++];
        firstItemIndex %= array.length;
        numberOfElements--;
        System.out.println(item + " removed from queue");
        return item;
    }

    private void biggerArray() {
        int length = array.length;
        T[] biggerArray = (T[]) Array.newInstance(itemType, length * 2);
        for (int i = 0; i < length; i++) {
            biggerArray[i] = array[(firstItemIndex + i) % length];
        }
        array = biggerArray;
        firstItemIndex = 0;
        lastItemIndex = length;
    }

    /**
     * Used just to test array size doubling
     *
     * @return size of the array
     */
    public int getArraySize() {
        return array.length;
    }

}
