package Dungeon.Equipment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SpellTest {

    Spell spell;

    @Before
    public void setUp() {
        spell = new Spell("Grease", 5);
    }

    @Test
    public void getName() {
        assertEquals("Grease", spell.getName());
    }

    @Test
    public void getDamage() {
        assertEquals(5, spell.getDamage());
    }
}