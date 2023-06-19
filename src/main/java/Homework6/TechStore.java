package Homework6;

import java.util.*;

public class TechStore {
    private Set<Notebook> notebooks;

    public TechStore() {
        notebooks = new HashSet<>();
    }

    public void addNotebook(Notebook notebook) {
        notebooks.add(notebook);
    }

    public Set<Notebook> filterNotebooks(Set<String> filters) {
        Set<Notebook> filteredNotebooks = new HashSet<>();

        for (Notebook notebook : notebooks) {
            if (filters.contains(notebook.getColor()) || filters.contains(notebook.getBrand())) {
                filteredNotebooks.add(notebook);
            }
        }

        return filteredNotebooks;
    }
}
