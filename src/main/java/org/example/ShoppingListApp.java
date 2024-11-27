package org.example;

import java.util.Scanner;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ShoppingListApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> shoppingList = new ArrayList<>();


        boolean running = true;
        while (running) {
            printMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addItem(shoppingList);
                    break;
                case 2:
                    deleteItem(shoppingList);
                    break;
                case 3:
                    showItems(shoppingList);
                    break;
                case 4:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                    case 5:
                default:
                    System.out.println("Invalid choic, try again!");
            }
        }
    }

    // метод, який виводить пункти меню
    public static void printMenu() {
        System.out.println("menu: ");
        System.out.println("1. Add Item");
        System.out.println("2. Delete item");
        System.out.println("3. Show list of items");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
    }

    // метод, який додає введений користувачем продукт
    public static void addItem(ArrayList<Item> shoppingList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the item name: ");
        String itemName = scanner.nextLine();
        shoppingList.add(new Item(itemName));
        System.out.println("item added! ");
    }


    public static void showItems(ArrayList<Item> list) {
        if (list.isEmpty()) {
            System.out.println("empty list");
        } else {
            for (int i = 0; i < list.size(); i++) {
                System.out.println((i + 1) + ". " + list.get(i));
            }
        }
    }

    // метод,
    public static void deleteItem(ArrayList<Item> shoppingList) {
        Scanner scanner = new Scanner(System.in);
        showItems(shoppingList);
        System.out.println("enter the item number, what do you want to delete: ");
        int itemNumber = scanner.nextInt() - 1;
        shoppingList.remove(itemNumber);
        System.out.println("item deleted! ");
    }


}