package com.alaw810.lvl1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Undo undo = Undo.getInstance();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("-- Commands Menu --");
            System.out.println("1) Add command");
            System.out.println("2) Remove last command");
            System.out.println("3) List commands");
            System.out.println("4) Exit");
            System.out.print("Choose an option: ");

            String input = sc.nextLine().trim();

            switch (input) {
                case "1" -> {
                    System.out.println("Enter command:");
                    String command = sc.nextLine();
                    undo.addCommand(command);
                }
                case "2" -> undo.removeLastCommand();
                case "3" -> System.out.println(undo.listCommands());
                case "4" -> {
                    exit = true;
                    System.out.println("Bye bye");
                }
                default -> System.out.println("Invalid option. Try again");
            }

        }
    sc.close();
    }

}
