package com.alaw810.lvl1;

import java.util.ArrayList;
import java.util.List;

public class Undo {
    private static Undo instance;

    private final List<String> commands = new ArrayList<>();

    private Undo() {}

    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void addCommand(String command) {
        if (command != null && !command.trim().isEmpty()) {
            commands.add(command);
        }
    }

    public void removeLastCommand() {
        if(!commands.isEmpty()) {
            commands.remove(commands.size()-1);
        }
    }

    public String listCommands() {
        if (commands.isEmpty()) {
            return "History is empty.";
        }
        return "History: " + commands;
    }

    // Test helpers
    public List<String> getCommands() {
        return new ArrayList<>(commands);
    }

    void clear() {
        commands.clear();
    }
}
