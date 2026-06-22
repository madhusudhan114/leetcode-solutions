package StackSolutions;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

//Implement Queue using Stacks (LeetCode #232)
//The Problem: Implement a First-In-First-Out (FIFO) queue using only two Last-In-First-Out (LIFO) stacks.
public class QueueUsingStacks {
    // inputStack holds newly pushed elements
    private final Deque<Integer> inputStack;
    // outputStack holds elements reversed, ready to be popped FIFO style
    private final Deque<Integer> outputStack;

    public QueueUsingStacks() {
        this.inputStack = new ArrayDeque<>();
        this.outputStack = new ArrayDeque<>();
    }

    // O(1) constant time
    public void push(int x) {
        inputStack.push(x);
    }

    // Amortized O(1) time
    public int pop() {
        shiftStacks();
        return outputStack.pop(); // Directly pops the oldest element safely
    }

    // Amortized O(1) time
    public int peek() {
        shiftStacks();
        return outputStack.peek(); // Looks at the oldest element cleanly
    }

    // O(1) constant time
    public boolean empty() {
        return inputStack.isEmpty() && outputStack.isEmpty();
    }

    // Helper method to shift elements ONLY when outputStack runs dry
    private void shiftStacks() {
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.push(10);
        queue.push(20);
        System.out.println(queue.pop());  // Output: 10
        System.out.println(queue.peek()); // Output: 20
        System.out.println(queue.empty());// Output: false
    }
}
