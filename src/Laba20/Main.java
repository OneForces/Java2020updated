package Laba20;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    private static final String PATH = ".\\src\\ru\\mirea\\Java2020updated\\Laba19\\text.txt";

    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> words = new HashMap<>();

        File file = new File(PATH);
        file.createNewFile();
        Scanner scanner = new Scanner(file);

        String line = scanner.nextLine();
        parseLine(line, words);
        while (true) {
            try{
                line = scanner.nextLine();
            } catch (Exception e) {
                break;
            }
            parseLine(line, words);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(words.entrySet());
        list.sort(Map.Entry.comparingByValue());
        Collections.reverse(list);

        System.out.print("Введите сколько слов вывести из списка: ");
        scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        for (int i = 0; i < amount; i++) {
            System.out.println((i + 1) + ") " + list.get(i).getKey() + "\t" + list.get(i).getValue());
        }
    }

    private static void parseLine(String line, HashMap<String, Integer> words) {
        if (!line.isEmpty()) {
            String[] wordsOfLine = line.split(" ");

            for (String word : wordsOfLine) {
                word = word.replaceAll( "[^a-zA-ZА-Яа-яёЁ]", "");

                word = word.toLowerCase();

                if (!word.isBlank() & !word.isEmpty()){
                    if (words.containsKey(word)) {
                        int tmp = words.get(word);
                        words.put(word, tmp + 1);
                    } else {
                        words.put(word, 1);
                    }
                }
            }
        }
    }
}