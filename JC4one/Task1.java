package JC4one;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        // Task 1
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("river");
        arrList.add("snow");
        arrList.add("kangoroo");
        arrList.add("sea");
        arrList.add("winter");
        arrList.add("kite");
        arrList.add("snow");
        arrList.add("snowflake");
        arrList.add("river");
        arrList.add("horse");

        System.out.println("ORIGINAL Array List:");
        arrList.forEach(System.out::println);
        System.out.println("\nCOUNT WORDS:");
        HashMap<String, Integer> words = new HashMap<>();
        for (String word : arrList) {
            if (!words.containsKey(word)) {
                words.put(word, 0);
            }
            words.put(word, words.get(word) + 1);
        }
        for (String word : words.keySet()) {
            System.out.println(word + " " + words.get(word));
        }

        System.out.println("\nUNIQUE words: ");
        Set<String> unique = new HashSet<>(arrList);
        unique.forEach(System.out::println);


    }

}






