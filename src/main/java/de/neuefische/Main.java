package de.neuefische;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        NameBook nameBook = new NameBook();
        nameBook.add("Maik");
        Optional<String> maybeName = nameBook.getAt(10);
        String name = maybeName.get();
        System.out.println(name);
    }
}