package com.alaw810.lvl1;

public class UndoManager {
    private static UndoManager instance;

    private UndoManager() {}

    public static UndoManager getInstance() {
        if (instance == null) {
            instance = new UndoManager();
        }
        return instance;
    }
}
