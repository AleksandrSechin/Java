//  Заполнить список названиями планет Солнечной
// системы в произвольном порядке с повторениями.
// 📌 Вывести название каждой планеты и количество его
// повторений в списке.
// Задание №2.2 (если выполнено первое задание)
// Пройти по списку из предыдущего задания и удалить
// повторяющиеся элементы.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Planet {
    public static void removeRepeats(List<String> planets) {
        for (int i = 0; i < planets.size(); i++) {
            for (int j = planets.size() - 1; j > 0; j--) {
                if (planets.get(j).equals(planets.get(i)) && j != i) {
                    planets.remove(j);
                }
            }
        }
    }

    public static void countPlanets(List<String> list) {
        String currentEl = list.get(0);
        int count = 1;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(currentEl)) {
                count += 1;
            } else {
                System.out.println(currentEl + " > " + count);
                currentEl = list.get(i);
                count = 1;
            }
        }
        System.out.println(currentEl + " > " + count);
    }

    public static List<String> listPlanets() {
        List<String> planets = new ArrayList<>();
        planets.add("Earth");
        planets.add("Mercury");
        planets.add("Mars");
        planets.add("Mars");
        planets.add("Venus");
        planets.add("Jupiter");
        planets.add("Neptun");
        planets.add("Uranus");
        planets.add("Jupiter");

        return planets;
    }

    public static void main(String[] args) {
        List<String> planets = listPlanets();
        List<String> sortedPlanets = new ArrayList<>(planets);
        Collections.sort(sortedPlanets);
        System.out.println(sortedPlanets);
        countPlanets(sortedPlanets);
        removeRepeats(planets);
        System.out.println(planets);
    }
}