package com.alaw810.lvl1;

import java.util.Scanner;

public class Menu {
    private final Undo undo;
    private final Scanner sc;

    public Menu() {
        this.undo = Undo.getInstance();
        this.sc = new Scanner(System.in);
    }

    public void start() {
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
                case "1" -> addCommand();
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

    private void addCommand() {
        System.out.println("Enter command: ");
        String command = sc.nextLine();
        undo.addCommand(command);
    }
}
