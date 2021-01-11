package ru.sibadi.rest;

public class Table {
    private final String nameTable;
    private final double price;
    private TableStatus status;


    public Table(String nameTable, double price) {
        this.nameTable = nameTable;
        this.price = price;
        this.status = TableStatus.FREE;
    }

    public String getNameTable() {
        return nameTable;
    }

    public void setStatus(TableStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Table: " + nameTable + " Price: " + price + " Status: " + status;
    }
}
