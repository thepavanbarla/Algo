package com.pavanbarla.queues;

import com.pavanbarla.types.Node;

import static com.pavanbarla.queues.Constants.EMPTY_QUEUE_ERROR_MESSAGE;

public class LinkedListBasedQueue<T> implements Queue<T> {

    Node<T> head = null;
    Node<T> tail = null;
    private int numberOfItems = 0;

    @Override
    public void enqueue(T item) {
        if(head == null){
            head = new Node<>(item);
            tail = head;
        } else {
            Node newNode = new Node(item);
            tail.setNext(newNode);
            tail = newNode;
        }
        numberOfItems++;
    }

    @Override
    public T dequeue() {
        if(numberOfItems == 0)
            throw new RuntimeException(EMPTY_QUEUE_ERROR_MESSAGE);
        T item = head.getValue();
        head = head.getNext();
        numberOfItems--;
        return item;
    }

}
