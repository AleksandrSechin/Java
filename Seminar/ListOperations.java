// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя и “запоминает” строки.
// 2. Если введено print, выводит строки так, чтобы последняя введенная
// была первой в списке, а первая - последней.
// 3. Если введено revert, удаляет предыдущую введенную строку из памяти.

import java.util.LinkedList;
import java.util.Scanner;

public class ListOperations {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Введите текст или print/revert для вывода/удаления элемента или exit для выхода");
                String str = scanner.nextLine();
                if (str.equals("exit")) {
                    break;
                }
                if (str.equals("print")) {
                    printReverse(linkedList);
                    System.out.println();
                } else if (str.equals("revert")) {
                    if (!linkedList.isEmpty()) {
                        linkedList.removeLast();
                        System.out.println(linkedList);
                    }
                } else {
                    linkedList.add(str);
                    System.out.println(linkedList);
                }
            }
        }
    }

    private static void printReverse(LinkedList<String> linkedList) {
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            System.out.print(linkedList.get(i) + " ");
        }
    }
}