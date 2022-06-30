package lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> randomWords = new ArrayList<>(20);
        Collections.addAll(randomWords, "apple", "copper", "copper", "orange",
                "garlic", "garlic", "cat", "rose", "copper", "line", "garlic", "platinum",
                "philosophy", "copper", "garlic", "cat", "cat", "garlic", "garlic");

        System.out.println("Initial ArrayList: " + randomWords + "\n");

        List<String> tempList = (randomWords.stream().distinct().toList());
        System.out.println("ArrayList without repeats: " + tempList + "\n");
        tempList.forEach(s -> System.out.println(s + " repeat " + Collections.frequency(randomWords, s) + " times"));

        System.out.println();

        Phonebook.add("Nick", "9494949");
        Phonebook.add("Alex", "+099233");
        Phonebook.add("Oleg", "6544");
        Phonebook.add("Jordan", "1231249");
        Phonebook.add("Muhammad", "911");
        Phonebook.add("Alex", "112");
        Phonebook.add("Nick", "76665");

        Phonebook.get("Nick");
        Phonebook.get("Alex");
        Phonebook.get("Muhammad");
        Phonebook.get("Oleg");

        System.out.println();

        Phonebook.getAll();
    }
}
