package Dungeon.Equipment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ToolTest {

    Tool tool;

    @Before
    public void setUp() {
        tool = new Tool("potion", 10);
    }

    @Test
    public void getType() {
        assertEquals("potion", tool.getType());
    }

    @Test
    public void getHealing() {
        assertEquals(10, tool.getHealing());
    }
}