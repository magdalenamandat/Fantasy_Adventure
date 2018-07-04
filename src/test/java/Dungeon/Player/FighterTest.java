package Dungeon.Player;

import Dungeon.Enemy;
import Dungeon.Equipment.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FighterTest {
    Weapon weapon1;
    Weapon weapon2;
    Weapon weapon3;
    Fighter fighter;
    Enemy enemy;

    @Before
    public void setUp(){
        weapon1 = new Weapon("Sword", 5);
        weapon2 = new Weapon("Brick in a Sock",15);
        fighter = new Fighter("Larry", 50, weapon1);
        weapon3 = new Weapon("Stick", 1);
        enemy = new Enemy("Goblin", 3, weapon1);
    }

    @Test
    public void getWeapon() {
        assertEquals(weapon1, fighter.getWeapon());
    }

    @Test
    public void setWeapon() {
        fighter.setWeapon(weapon2);
        assertEquals(weapon2, fighter.getWeapon());
    }

    @Test
    public void damage() {
        enemy.attack(fighter);
        assertEquals(49, fighter.getHp());
    }

    @Test
    public void attack(){
        fighter.attack(enemy);
        assertEquals(-12, enemy.getHp());
    }
}