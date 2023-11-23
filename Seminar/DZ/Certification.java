// Задание. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
// методы. Реализовать в java. Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии)
// фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно
// хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет
// Далее нужно запросить минимальные значения для указанных критериев - сохранить
// параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
// условиям.

package DZ;


// Класс "Ноутбук" может быть структурирован следующим образом:

public class Laptop {
    private String модель;
    private int объемОЗУ;
    private int объемЖД;
    private String операционнаяСистема;
    private String цвет;

    // Конструктор класса
    public Laptop(String модель, int объемОЗУ, int объемЖД, String операционнаяСистема, String цвет) {
        this.модель = модель;
        this.объемОЗУ = объемОЗУ;
        this.объемЖД = объемЖД;
        this.операционнаяСистема = операционнаяСистема;
        this.цвет = цвет;
    }

    // Геттеры и сеттеры для полей класса

    public String getМодель() {
        return модель;
    }

    public void setМодель(String модель) {
        this.модель = модель;
    }

    public int getОбъемОЗУ() {
        return объемОЗУ;
    }

    public void setОбъемОЗУ(int объемОЗУ) {
        this.объемОЗУ = объемОЗУ;
    }

    public int getОбъемЖД() {
        return объемЖД;
    }

    public void setОбъемЖД(int объемЖД) {
        this.объемЖД = объемЖД;
    }

    public String getОперационнаяСистема() {
        return операционнаяСистема;
    }

    public void setОперационнаяСистема(String операционнаяСистема) {
        this.операционнаяСистема = операционнаяСистема;
    }

    public String getЦвет() {
        return цвет;
    }

    public void setЦвет(String цвет) {
        this.цвет = цвет;
    }
}

// Для фильтрации ноутбуков и вывода соответствующих результатов, вы можете использовать следующий метод:

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Certification {
    public static void main(String[] args) {
        // Создание множества ноутбуков
        List<Ноутбук> ноутбуки = new ArrayList<>();
        ноутбуки.add(new Ноутбук("Модель 1", 8, 500, "Windows 10", "Черный"));
        ноутбуки.add(new Ноутбук("Модель 2", 16, 1000, "MacOS", "Серебристый"));
        ноутбуки.add(new Ноутбук("Модель 3", 8, 500, "Windows 10", "Белый"));

        // Запрос критериев фильтрации
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Object> критерии = new HashMap<>();
        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
        
        int выбранныйКритерий = scanner.nextInt();
        
        switch (выбранныйКритерий) {
            case 1:
                System.out.println("Введите минимальное значение ОЗУ:");
                int минимальноеОЗУ = scanner.nextInt();
                критерии.put(1, минимальноеОЗУ);
                break;
            case 2:
                System.out.println("Введите минимальный объем ЖД:");
                int минимальныйОбъемЖД = scanner.nextInt();
                критерии.put(2, минимальныйОбъемЖД);
                break;
            case 3:
                System.out.println("Введите операционную систему:");
                String операционнаяСистема = scanner.next();
                критерии.put(3, операционнаяСистема);
                break;
            case 4:
                System.out.println("Введите цвет:");
                String цвет = scanner.next();
                критерии.put(4, цвет);
                break;
            default:
                System.out.println("Некорректный выбор критерия.");
                break;
        }
        
        // Фильтрация ноутбуков и вывод результатов
        List<Ноутбук> результаты = фильтроватьНоутбуки(ноутбуки, критерии);
        
        if (результаты.isEmpty()) {
            System.out.println("Нет ноутбуков, удовлетворяющих выбранным критериям.");
        } else {
            System.out.println("Результаты фильтрации:");
            for (Ноутбук ноутбук : результаты) {
                System.out.println(ноутбук.getМодель());
            }
        }
    }
    
    private static List<Ноутбук> фильтроватьНоутбуки(List<Ноутбук> ноутбуки, Map<Integer, Object> критерии) {
        List<Ноутбук> результаты = new ArrayList<>();
        
        for (Ноутбук ноутбук : ноутбуки) {
            boolean проходитФильтр = true;
            
            for (Map.Entry<Integer, Object> entry : критерии.entrySet()) {
                int критерий = entry.getKey();
                Object значение = entry.getValue();
                
                switch (критерий) {
                    case 1:
                        if (ноутбук.getОбъемОЗУ() < (int) значение) {
                            проходитФильтр = false;
                        }
                        break;
                    case 2:
                        if (ноутбук.getОбъемЖД() < (int) значение) {
                            проходитФильтр = false;
                        }
                        break;
                    case 3:
                        if (!ноутбук.getОперационнаяСистема().equalsIgnoreCase((String) значение)) {
                            проходитФильтр = false;
                        }
                        break;
                    case 4:
                        if (!ноутбук.getЦвет().equalsIgnoreCase((String) значение)) {
                            проходитФильтр = false;
                        }
                        break;
                    default:
                        проходитФильтр = false;
                        break;
                }
                
                if (!проходитФильтр) {
                    break; // Если ноутбук не проходит хотя бы один критерий, прекратить проверку
                }
            }
            
            if (проходитФильтр) {
                результаты.add(ноутбук);
            }
        }
        
        return результаты;
    }
}