package Laba26;

import java.util.*;

public class Main {
    public static void removeDuplicates(HashMap<String, String> map) {
        HashMap<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> e : copy.entrySet()) {
            for (Map.Entry<String, String> e1 : copy.entrySet()) {
                if (e.getValue().equals(e1.getValue()) && !e.getKey().equals(e1.getKey()))
                    map.values().remove(e.getValue());
            }
        }
    }

    public static void addValue(Map<String, ArrayList<String>> map, City city){
        map.computeIfAbsent(city.getCountry(), k -> new ArrayList<>());
        map.get(city.getCountry()).add(city.getCity());
    }

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Ivanov", "Ivan");
        map.put("Good job", "Oleg");
        map.put("Petrov", "Petr");

        removeDuplicates(map);
        System.out.println(map);

        Map<String, ArrayList<String>> countries = new HashMap<>();
        ArrayList<City> cities = new ArrayList<>(Arrays.asList(
                new City("Moscow", "Russia"),
                new City("Omsk", "Russia"),
                new City("Washington", "USA"),
                new City("Berlin", "Germany"),
                new City("New York", "USA")));

        for (City c: cities){
            addValue(countries, c);
        }
        System.out.println(countries);
    }
}