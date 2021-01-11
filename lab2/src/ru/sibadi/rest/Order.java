package ru.sibadi.rest;

public class Order {
    private final Food food;

    public Order(Food food) {
        this.food = food;
    }

    public double getAmount() {
        return food.getPrice();
    }
    @Override
    public String toString() {
        return "Order: " + food.getTitle() + " Total: " + getAmount();
    }
}
