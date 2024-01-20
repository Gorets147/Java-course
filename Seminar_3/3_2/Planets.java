import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Planets {
    //📌 Заполнить список названиями планет Солнечной
    //системы в произвольном порядке с повторениями.
    //📌 Вывести название каждой планеты и количество его
    //повторений в списке.
    //Задание состоит из двух блоков
    //Задание №2.2 (если выполнено первое задание)
    //📌 Пройти по списку из предыдущего задания и удалить
    //повторяющиеся элементы.

    public static void main(String[] args) {
        List<String> listPlanets = CreateSunSystem();
        //List<String> planets2 = new ArrayList<>(Arrays.asList("Mercury", "Venus"));
        CountRepeatPlanet(listPlanets);

        DeleateRepeatPlanets(listPlanets);
    }

    private static void DeleateRepeatPlanets(List<String> listPlanets) {
        for (int i = 0; i < listPlanets.size(); i++) {
            String planet = listPlanets.get(i);
            for (int j = i + 1; j < listPlanets.size(); j++) {
                if (listPlanets.get(j).equals(planet)){
                    listPlanets.remove(j);
                    j--;
                }
            }
        }
    }

    private static void CountRepeatPlanet(List<String> listPlanets) {
        List<String> listSortedPlanets = new ArrayList<>(listPlanets);
        Collections.sort(listSortedPlanets);

        int count = 1;
        String currentPlanet = listSortedPlanets.get(0);
        for (int i = 0; i < listSortedPlanets.size(); i++) {
            if (listSortedPlanets.get(i).equals(currentPlanet)) {
                count++;
            } else {
                System.out.println(currentPlanet + " --> " + count);
                currentPlanet = listSortedPlanets.get(i);
                count = 1;
            }
        }
        System.out.println(currentPlanet + " --> " + count);
    }

    private static List<String> CreateSunSystem() {
        List<String> planets = new ArrayList<>();
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Neptune");
        planets.add("Earth");
        planets.add("Earth");
        planets.add("Pluto");
        planets.add("Venus");
        return planets;
    }
}
