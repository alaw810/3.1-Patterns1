package com.alaw810.lvl1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UndoTest {

    @Test
    void testSingletonInstanceUniqueness() {
        Undo manager1 = Undo.getInstance();
        Undo manager2 = Undo.getInstance();

        assertSame(manager1, manager2, "Two calls must return the same instance.");
    }

    @Test
    void addCommandPersistsInHistory() {
        Undo undo = Undo.getInstance();
        undo.addCommand("ls -l");
        assertTrue(undo.getCommands().contains("ls -l"),
                "The command 'ls -l' should be stored in the history");
    }

    @Test
    void removeLastCommandRemovesIt() {
        Undo undo = Undo.getInstance();
        undo.addCommand("help");
        undo.removeLastCommand();
        assertFalse(undo.getCommands().contains("help"),
                "The last command should have been removed.");
    }

    @Test
    void removeFromEmptyHistoryDoesNotThrow() {
        Undo undo = Undo.getInstance();
        undo.clear();

        assertDoesNotThrow(undo::removeLastCommand,
                "Removing from empty history should not throw an exception");
        assertTrue(undo.getCommands().isEmpty(),
                "History should remain empty after attempting to remove");
    }

}
