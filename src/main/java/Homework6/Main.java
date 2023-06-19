package Homework6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TechStore techStore = new TechStore();


        Notebook notebook1 = new Notebook("Model 1", "Brand 1", 1000.0, 8, "Red");
        techStore.addNotebook(notebook1);
        Notebook notebook2 = new Notebook("Model 2", "Brand 2", 1200.0, 16, "Blue");
        techStore.addNotebook(notebook2);
        Notebook notebook3 = new Notebook("Model 3", "Brand 1", 1500.0, 12, "Silver");
        techStore.addNotebook(notebook3);


        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - цвет");
        System.out.println("2 - бренд");

        Set<String> filters = new HashSet<>();
        int choice = scanner.nextInt();
        scanner.nextLine();

    }
}


