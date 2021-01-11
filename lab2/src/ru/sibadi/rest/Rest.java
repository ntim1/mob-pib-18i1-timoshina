package ru.sibadi.rest;

public class Rest {
    private final String name;
    private final Food[] menu;
    private final Table[] tables;

    public Rest() {
        this.name = "LUXE";
        this.menu = new Food[]{
                new Food("Whiskey", 500.00),
                new Food("Wine", 800.00),
                new Food("Cocktail", 300.00),
                new Food("Vodka", 1000.00),
		new Food("Water", 100.00),
        new Food("Shrimp", 500.00)
        };
        this.tables = new Table[]{
                new Table("1",500.0),
                new Table("2", 500.0),
                new Table("3", 500.0),
		new Table("4", 700.0),
		new Table("5", 700.0)
        };
    }

    public String getName() {
        return name;
    }

    public Food[] getMenu() {
        return menu;
    }

    public Table[] getTables() {
        return tables;
    }
}
