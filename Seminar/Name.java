// Написать программу, которая запросит пользователя ввести
// <Имя> в консоли. Получит введенную строку и выведет в консоль сообщение
// “Привет, <Имя>!”

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in, "ibm866");
        System.out.printf("Введите имя: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();
    }
}
