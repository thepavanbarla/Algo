package com.pavanbarla.types;

public class Node<T> {
    T value;
    Node next;

    public Node(T val) {
        this.value = val;
    }

    public Node(T val, Node nextNode) {
        this.value = val;
        this.next = nextNode;
    }

    public T getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
