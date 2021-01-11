package ru.sibadi.rest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class StreamFile {
    public void SereLiz() {
        Rest rest = new Rest();
        try (FileWriter writer = new FileWriter("src/ru/sibadi/rest/menu.txt")) {
            for (Food food : rest.getMenu()) {
                String name = food.getTitle();
                String price = String.valueOf(food.getPrice());


                writer.write(name + " " + price + File.separator);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void Ser() {
        try (FileInputStream menu = new FileInputStream("src/ru/sibadi/rest/menu.txt")) {
            System.out.printf("File size: %d bytes \n", menu.available());
            int i = -1;
            while ((i = menu.read()) != -1) {

                System.out.print((char) i);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
