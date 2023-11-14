// Создать список типа ArrayList<String>.
//  Поместить в него как строки, так и целые числа.
//  Пройти по списку, найти и удалить целые числа.

import java.util.ArrayList;
import java.util.List;

public class CreateArray {
    public static List<String> getList() {
        List<String> list = new ArrayList<>();
        list.add("Earth");
        list.add("3");
        list.add("Mars");
        list.add("Mars");
        list.add("Venus");
        list.add("12124");
        list.add("Neptun");
        list.add("Uran");
        list.add("575534");
        return list;
    }

    public static boolean isNumbers(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void removeNumbers(List<String> list) {
        for (int i = list.size() - 1; i > 0; i--) {
            if (isNumbers(list.get(i))) {
                list.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        List<String> list = getList();
        System.out.println(list);
        removeNumbers(list);
        System.out.println(list);
    }
}