package Dungeon.Equipment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EnemyAttackTest {

    EnemyAttack attack;

    @Before
    public void setUp() {
        attack = new EnemyAttack(5, "Stick");
    }

    @Test
    public void getDamage() {
        assertEquals(5, attack.getDamage());
    }

    @Test
    public void getWeapon() {
        assertEquals("Stick", attack.getWeapon());
    }

}