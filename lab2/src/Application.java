import ru.sibadi.rest.*;

import java.util.Scanner;


public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rest rest = new Rest();

        System.out.println("Welcome to " + rest.getName() + '\n');

        int pointMenu;
        do {
            System.out.println("1: Looking restoraunt menu");
            System.out.println("2: Looking the map tables");
            System.out.println("3: Make a reservation table");
            System.out.println("4: Exit");
            pointMenu = sc.nextInt();
            sc.nextLine();
            switch (pointMenu) {
                case 1: {
                    for (Food food : rest.getMenu()) {
                        System.out.println(food);
                    }
                    break;
		}
                case 2: {
                    for (Table tables : rest.getTables()) {
                        System.out.println(tables);
                    }
                    break; 
                }
                case 3: {
                    System.out.println("Enter a name table");
                    String tableName = sc.nextLine();
                    for (Table table : rest.getTables()) {
                        if (table.getNameTable().equals(tableName)) {
                            table.setStatus(TableStatus.RESERVED);
                        }
                    }
                    System.out.println("Select food");
                    for (Food food : rest.getMenu()) {
                        System.out.println(food);
                    }
                    System.out.println("Enter food name");
                    String menu = sc.nextLine();
                    for (Food food : rest.getMenu()) {
                        if (food.getTitle().equals(menu)) {
                            Order o = new Order(food);
                            System.out.println("Your order " + '\n' + o);
                        }
                    }
                }
                break;
            }
        } while (pointMenu != 4);
    }
}

