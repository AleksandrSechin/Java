package Java.ControlWork;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {

        Laptop pc1 = new Laptop("Dell", 8, 256, "Windows Pro", "Серебристый", 39999, 3);
        Laptop pc2 = new Laptop("HP", 16, 512, "Windows Pro", "Черный", 55790, 2);
        Laptop pc3 = new Laptop("Honor", 16, 256, "Windows Home", "Серебристый", 47200, 1);
        Laptop pc4 = new Laptop("Asus", 16, 512, "Без операционной системы", "Черный", 53300, 5);
        Laptop pc5 = new Laptop("Lenovo", 16, 1024, "Windows Home", "Красный", 74000, 2);

        HashSet<Laptop> laptops = new HashSet<>();
        laptops.add(pc1);
        laptops.add(pc2);
        laptops.add(pc3);
        laptops.add(pc4);
        laptops.add(pc5);

        for (Laptop pc : laptops) {
            System.out.println(pc);
            System.out.println();

        }
        System.out.println();

        System.out.println(
                "==============================================================================================");
        System.out.println();
        Map<Integer, String> mapCrit = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        mapCrit.put(1, "ОЗУ");
        mapCrit.put(2, "Oбъем ЖД");
        mapCrit.put(3, "Минимальная цена");

        System.out.println("Введите 1. ОЗУ: ");
        int ramUser = sc.nextInt();
        System.out.println("Введите 2. Oбъем ЖД: ");
        int storUser = sc.nextInt();
        System.out.println("Введите 3. Минимальную цену ");
        int priceUser = sc.nextInt();

        System.out.println();

        for (Laptop lap : laptops) {
            if ((lap.getRandomAccessMemory() >= ramUser) && (lap.getHardDiskDrive() >= storUser)
                    && (lap.getPrice() >= priceUser)) {
                System.out.println(lap.toString());
                System.out.println();

            }

        }
        sc.close();
    }

}