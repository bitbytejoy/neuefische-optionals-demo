package de.neuefische;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Data
public class NameBook {
    private List<String> names = new ArrayList<>();

    public void add (String name) {
        names.add(name);
    }

    public Optional<String> getAt(int i) {
        if (i < 0 || i > names.size() - 1) {
            return Optional.empty();
        }

        return Optional.of(names.get(i));
    }
}
