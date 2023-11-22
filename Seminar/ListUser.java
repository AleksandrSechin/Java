// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя строку вида
// text~num
// 2. Нужно рассплитить строку по ~, сохранить text в связный список на
// позицию num.
// 3. Если введено print~num, выводит строку из позиции num в связном
// списке и удаляет её из списка.

import java.util.LinkedList;
import java.util.Scanner;

public class ListUser {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Введите строку вида текст~num либо exit для выхода");
                String str = scanner.nextLine();
                if (str.equals("exit")) {
                    break;
                }
                String[] arrStr = str.split("~");
                String text = arrStr[0];
                int index = Integer.parseInt(arrStr[1]);
                if (text.equals("print")) {
                    printAndRemoveEl(linkedList, index);
                } else {
                    addElem(linkedList, text, index);
                }
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private static void addElem(LinkedList<String> linkedList, String text, int index) {
        if (index <= linkedList.size() && index >= 0) {
            linkedList.add(index, text);
        } else {
            System.out.println("Ошибка. Такой позиции не существует.");
        }
        System.out.println(linkedList);
    }

    private static void printAndRemoveEl(LinkedList<String> linkedList, int index) {
        if (!linkedList.isEmpty() && index <= linkedList.size() && index >= 0) {
            System.out.println(linkedList.get(index));
            linkedList.remove(index);
        } else {
            System.out.println("Ошибка. Такой позиции не существует.");
        }
        System.out.println(linkedList);
    }
}