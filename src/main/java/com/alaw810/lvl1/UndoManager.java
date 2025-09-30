package com.alaw810.lvl1;

import java.util.ArrayList;
import java.util.List;

public class UndoManager {
    private static UndoManager instance;

    private final List<String> commands = new ArrayList<>();

    private UndoManager() {}

    public static UndoManager getInstance() {
        if (instance == null) {
            instance = new UndoManager();
        }
        return instance;
    }

    public void addCommand(String command) {
        commands.add(command);
    }

    public void removeLastCommand() {
        if(!commands.isEmpty()) {
            commands.removeLast();
        }
    }

    // Test helper
    public List<String> getCommands() {
        return new ArrayList<>(commands);
    }
}
