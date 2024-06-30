package com.pavanbarla.queues;

import java.util.Stack;

import static com.pavanbarla.queues.Constants.EMPTY_QUEUE_ERROR_MESSAGE;

public class StackBasedQueue<T> implements Queue<T> {

    private final Stack<T> baseStack;
    private final Stack<T> reverseStack;

    public StackBasedQueue() {
        baseStack = new Stack<>();
        reverseStack = new Stack<>();
    }

    @Override
    public void enqueue(T item) {
        baseStack.push(item);
    }

    @Override
    public T dequeue() {
        if (reverseStack.empty()) {
            moveAllItemsToReverseStack();
            if (reverseStack.empty())
                throw new RuntimeException(EMPTY_QUEUE_ERROR_MESSAGE);
        }
        return reverseStack.pop();
    }

    private void moveAllItemsToReverseStack() {
        while (!baseStack.empty()) {
            reverseStack.push(baseStack.pop());
        }
    }
}
