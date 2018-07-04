package Dungeon.Equipment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WeaponTest {

    Weapon weapon;

    @Before
    public void setUp(){
        weapon = new Weapon("Sword", 5);
    }

    @Test
    public void getDamage() {
        assertEquals(5, weapon.getDamage());
    }

    @Test
    public void getType() {
        assertEquals("Sword", weapon.getType());
    }
}