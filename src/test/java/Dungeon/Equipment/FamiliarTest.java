package Dungeon.Equipment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FamiliarTest {

    Familiar familiar;

    @Before
    public void setUp() {
        familiar = new Familiar("Kevin", "rat");
    }

    @Test
    public void getName() {
        assertEquals("Kevin", familiar.getName());
    }

    @Test
    public void getType() {
    assertEquals("rat", familiar.getType());
    }
}