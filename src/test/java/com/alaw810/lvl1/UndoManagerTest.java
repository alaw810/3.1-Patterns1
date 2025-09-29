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

}
