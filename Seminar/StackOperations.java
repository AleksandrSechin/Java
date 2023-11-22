// Реализовать стэк с помощью массива.
// Нужно реализовать методы:
// size(), empty(), push(), peek(), pop().

import java.util.Arrays;
import java.util.LinkedList;

public class StackOperations {
    private static int top = -1;
    private static int[] stackArray;

    public static void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
    }

    public static void createStack(int size) {
        stackArray = new int[size];
    }

    public static int size() {
        return top + 1;
    }

    public static boolean empty() {
        return top == -1;
    }

    public static void push(int val) {
        stackArray[++top] = val;
    }

    public static int peek() {
        return stackArray[top];
    }

    public static int pop() {
        int numPop = stackArray[top--];
        stackArray[top + 1] = 0;
        return numPop;
    }

    public static void main(String[] args) {
        createStack(4);
        System.out.println(size());
        push(7);
        push(19);
        push(43);
        printStack();
        System.out.println();
        System.out.println(size());
        System.out.println(pop());
        printStack();
    }
}