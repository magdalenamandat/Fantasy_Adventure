package Dungeon;

import Dungeon.Equipment.EnemyAttack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EnemyTest {
    EnemyAttack attack;
    Enemy enemy;

    @Before
    public void setUp(){
        attack = new EnemyAttack(1, "Stick");
        enemy = new Enemy("Goblin", 3, attack);
    }

    @Test
    public void getType() {
        assertEquals("Goblin", enemy.getType());
    }

    @Test
    public void getHp() {
        assertEquals(3, enemy.getHp());
    }

    @Test
    public void getAttack() {
        assertEquals(attack, enemy.getAttack());
    }
}