package lesson3;

import java.util.*;

public abstract class Phonebook {
    private static Map<String, List<String>> phonebook = new HashMap<>(30);


    static void add(String name, String phone) {
        if (!phonebook.containsKey(name)) {
            phonebook.put(name, new ArrayList<>());
        }
        phonebook.get(name).add(phone);
    }

    static void get(String name) {
        System.out.println(name + " - " + phonebook.get(name));
    }

    static void getAll() {
        phonebook.forEach((s, strings) -> System.out.println(s + " - " + phonebook.get(s)));
    }
}
