// Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на экран

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SortRandomList {
    public static List<Integer> createRandomList(int size) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(10));
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = createRandomList(10);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
