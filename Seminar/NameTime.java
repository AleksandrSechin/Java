// В консоли запросить имя пользователя. В зависимости от
// текущего времени, вывести приветствие вида
// "Доброе утро, <Имя>!", если время от 05:00 до 11:59
// "Добрый день, <Имя>!", если время от 12:00 до 17:59;
// "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
// "Доброй ночи, <Имя>!", если время от 23:00 до 4:59


import java.time.LocalDateTime;
import java.util.Scanner;

public class NameTime {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in, "ibm866");
        System.out.printf("Введите имя: ");
        String name = iScanner.nextLine();

        int hour = LocalDateTime.now().getHour();
        String greeting = extracted(hour);

        System.out.println(greeting + ", " + name + "!");
        iScanner.close();
    }

    private static String extracted(int hour) {
        String greeting = "";

        if (hour >= 5 && hour < 12) {
            greeting = "Доброе утро";
        }
        else if (hour >= 12 && hour < 18) {
            greeting = "Добрый день";
        }
        else if (hour >= 18 && hour < 23) {
            greeting = "Добрый вечер";
        }
        else {
            greeting = "Добрый вечер";
        }
        return greeting;
    }
}
