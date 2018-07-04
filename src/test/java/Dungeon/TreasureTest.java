package Dungeon;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreasureTest {
    Treasure treasure;

    @Before
    public void setUp() {
        treasure = new  Treasure(10, "Crown");
    }

    @Test
    public void getType() {
        assertEquals("Crown", treasure.getType());
    }

    @Test
    public void getValue() {
        assertEquals(10, treasure.getValue());
    }
}