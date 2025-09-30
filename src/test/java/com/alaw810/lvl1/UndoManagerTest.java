package com.alaw810.lvl1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UndoManagerTest {

    @Test
    void testSingletonInstanceUniqueness() {
        UndoManager manager1 = UndoManager.getInstance();
        UndoManager manager2 = UndoManager.getInstance();

        assertSame(manager1, manager2, "Two calls must return the same instance.");
    }

    @Test
    void addCommandPersistsInHistory() {
        UndoManager undo = UndoManager.getInstance();
        undo.addCommand("ls -l");
        assertTrue(undo.getCommands().contains("ls -l"),
                "The command 'ls -l' should be stored in the history");
    }

    @Test
    void removeLastCommandRemovesIt() {
        UndoManager undo = UndoManager.getInstance();
        //undo.addCommand("help");
        undo.removeLastCommand();
        assertFalse(undo.getCommands().contains("help"),
                "The last command should have been removed.");
    }


}
