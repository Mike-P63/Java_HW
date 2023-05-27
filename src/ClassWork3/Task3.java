package ClassWork3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task3 {
    private static List<String> planets = new ArrayList<>();
    public static void main(String[] args) {
        printPlanets();
        removeEqualelements(planets);
    }

    private static void fillPlanets() {
        planets.add("Меркурий");
        planets.add("Юпитер");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Земля");
        planets.add("Земля");
    }
    private static void printPlanets(){
        fillPlanets();
        StringBuilder sb = new StringBuilder();
        List<String> result = new LinkedList<>();

        for (int i = 0; i < planets.size(); i++) {
            String currentPlanet = planets.get(i);
            if (!result.contains(currentPlanet)){
                result.add(currentPlanet);
                int count = 0;
                for (int j = 0; j < planets.size(); j++) {
                    if (planets.get(j).equals(currentPlanet)) count++;
                }
                sb.append(currentPlanet).append(": ").append(count).append(" ");
            }
        }
        System.out.println(sb);
    }
    public static void removeEqualelements(List<String> elems) {
        elems.sort(String::compareTo);
        for (int i = 1; i < elems.size(); i++) {
            if(elems.get(i).equals(elems.get(i-1))) elems.remove(elems.get(i));

        }
        System.out.println(elems);
    }
}


