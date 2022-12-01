package de.neuefische;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        NameBook nameBook = new NameBook();
        nameBook.add("Maik");
        Optional<String> maybeName = nameBook.getAt(10);
        String name = maybeName.orElse("N/A");
        System.out.println(name);

        boolean containsTest2 = false;
        String x = null;

        if (x == null) {
            x = "";
        }

        containsTest2 = x.contains("Test");

        boolean containsTest = Optional.ofNullable(x).orElse("")
            .contains("Test");
    }
}