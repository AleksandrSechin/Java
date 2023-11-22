// ) Написать метод, который принимает массив элементов, помещает их в стэк
// и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов, помещает их в
// очередь и выводит на консоль содержимое очереди.

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        Stack<Integer> stack = getStack(array);
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.print(stack.pop() + " ");
        }
        Queue<Integer> queue = getQueue(array);
        System.out.println(queue);
    }

    private static Queue<Integer> getQueue(int[] array) {
        Queue<Integer> queue = new LinkedList<>();
        for (Integer item : array) {
            queue.add(item);
        }
        return queue;
    }

    private static Stack<Integer> getStack(int[] array) {
        Stack<Integer> stack = new Stack<>();
        for (Integer item : array) {
            stack.push(item);
        }
        return stack;
    }
}
