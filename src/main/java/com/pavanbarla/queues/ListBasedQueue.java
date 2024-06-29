package com.pavanbarla.queues;

import java.util.ArrayList;
import java.util.List;

import static com.pavanbarla.queues.Constants.EMPTY_QUEUE_ERROR_MESSAGE;

public class ListBasedQueue<T> implements Queue<T> {

    private List<T> list;

    public ListBasedQueue(){
        list = new ArrayList<>();
    }

    @Override
    public void enqueue(T item) {
        list.add(item);
    }

    @Override
    public T dequeue() {
        if(list.isEmpty())
            throw new RuntimeException(EMPTY_QUEUE_ERROR_MESSAGE);
        return list.remove(0);
    }
}
