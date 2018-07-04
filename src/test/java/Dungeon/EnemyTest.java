package Dungeon;

import Dungeon.Equipment.Weapon;
import Dungeon.Player.Fighter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EnemyTest {
    Weapon weapon1;
    Weapon weapon2;
    Enemy enemy;
    Fighter fighter;

    @Before
    public void setUp(){
        weapon1 = new Weapon("Stick", 1);
        enemy = new Enemy("Goblin", 3, weapon1);
        weapon2 = new Weapon("Brick in a Sock",15);
        fighter = new Fighter("Larry", 50, weapon2);
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
        assertEquals(weapon1, enemy.getWeapon());
    }

    @Test
    public void attack() {
        enemy.attack(fighter);
        assertEquals(49, fighter.getHp());
    }

    @Test
    public void damage(){
        fighter.attack(enemy);
        assertEquals(-12, enemy.getHp());
    }
}