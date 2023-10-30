
// Структура простой программы
public class program {
    public static void main(String[] args) {
        System.out.println("Goodbye world");
    }
}

// Основы: типы данных
class program {
    public static void main(String[] args) {
        short age = 10;
        int salary = 123456;
        System.out.println(age); // 10
        System.out.println(salary); // 123456
    }
}

public class program {
    public static void main(String[] args) {
        boolean flag1 = 123 <= 234;
        System.out.println(flag1); // true
        boolean flag2 = 123 >= 234 || flag1;
        System.out.println(flag2); // true
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3); // false
    }
}

// Неявная типизация
public class program {
    public static void main(String[] args) {
        var a = 123;
        System.out.println(a); // 123
        var d = 123.456;
        System.out.println(d); // 123.456
    }
}

// Массивы одномерные
public class program {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println(arr.length); // 10
        arr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(arr.length); // 5
    }
}

// Многомерные
public class program {
    public static void main(String[] args) {
        int[] arr[] = new int[3][5];
        for (int[] line : arr) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }
    }
}

public class program {
    public static void main(String[] args) {
        int[][] arr = new int[3][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}

// Получение данных из терминала
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();
    }
}

// Преобразования
public class program {
    public static void main(String[] args) {
        int i = 123;
        double d = i;
        System.out.println(i); // 123
        System.out.println(d); // 123.0
        d = 3.1415;
        i = (int) d;
        System.out.println(d); // 3.1415
        System.out.println(i); // 3
        d = 3.9415;
        i = (int) d;
        System.out.println(d); // 3.9415
        System.out.println(i); // 3
        byte b = Byte.parseByte("123");
        System.out.println(b); // 123
        b = Byte.parseByte("1234");
        System.out.println(b); // NumberFormatException: Value out of range
    }
}

// Получение данных из терминала строки
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        int x = iScanner.nextInt();
        System.out.printf("double a: ");
        double y = iScanner.nextDouble();
        System.out.printf("%d + %f = %f", x, y, x + y);
        iScanner.close();
    }
}

import java.util.Scanner;

public class program {
 public static void main(String[] args) {
 Scanner iScanner = new Scanner(System.in);
 System.out.printf("int a: ");
 int x = iScanner.nextInt();
 System.out.printf("double a: ");
 double y = iScanner.nextDouble();
 System.out.printf("%d + %f = %f", x, y, x + y);
 iScanner.close();
}}

// Проверка на соответствие получаемого типа
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        boolean flag = iScanner.hasNextInt();
        System.out.println(flag);
        int i = iScanner.nextInt();
        System.out.println(i);
        iScanner.close();
    }
}

// Форматированный вывод
public class program {
    public static void main(String[] args) {
        int a = 1, b = 2;
        int c = a + b;
        String res = a + " + " + b + " = " + c;
        System.out.println(res);
    }
}

// Виды спецификаторов
public class program {
    public static void main(String[] args) {

        float pi = 3.1415f;
        System.out.printf("%f\n", pi); // 3,141500
        System.out.printf("%.2f\n", pi); // 3,14
        System.out.printf("%.3f\n", pi); // 3,141
        System.out.printf("%e\n", pi); // 3,141500e+00
        System.out.printf("%.2e\n", pi); // 3,14e+00
        System.out.printf("%.3e\n", pi); // 3,141e+00
    }
}

// Область видимости переменных
// У переменных существует понятие «область видимости».
// Если переменную объявили внутри некоторого блока фигурных скобок { },
// то снаружи этого блока переменная будет недоступна.
public class program {
    public static void main(String[] args) {
        {
            int i = 123;
            System.out.println(i);
        }
        System.out.println(i); // error: cannot find symbol
    }
}

// Функции и методы
// Функции и методы — это технически одно и то же. Функции могут
// не принадлежать классам, а методы принадлежат.
// В java все функции являются методами.
public class program {
    static void sayHi() {
        System.out.println("hi!");
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static double factor(int n) {
        if (n == 1)
            return 1;
        return n * factor(n - 1);
    }

    public static void main(String[] args) {
        sayHi(); // hi!
        System.out.println(sum(1, 3)); // 4
        System.out.println(factor(5)); // 120.0
    }
}

// Управляющие конструкции: условный оператор
public class program {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 0;
        if (a > b)
            c = a;
        if (b > a)
            c = b;
        System.out.println(c);
    }
}

// тернарный оператор
public class Program {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int min = a < b ? a : b;
        System.out.println(min);
    }
}

// Оператор выбора
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int mounth = value;
        String text = "";
        switch (mounth) {
            case 1:
                text = "Autumn";
                break;
            ...
            default:
                text = "mistake";
                break;
            }
            System.out.println(text);
            iScanner.close();
        }
    }