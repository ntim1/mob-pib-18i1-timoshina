package ru.sibadi.rest;

public class Food {
    private final String title;
    private final double price;

    public Food(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return title + ": " + price;
    }
}
