package org.example;

public class Item {
    private String name; //назва продукту

    // конструктор
    public Item(String name) {
        this.name = name;
    }

    //getter для покупки
    public String getName() {
        return name;
    }

    //setter для покупки
    public void setName(String name) {
        this.name = name;
    }

    // вивід покупки
    @Override
    public String toString() {
        return name;
    }

}


