package com.pavanbarla.queues;

public interface Queue<T> {
    void enqueue(T item);
    T dequeue();
}
