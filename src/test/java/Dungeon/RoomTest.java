package Dungeon;

import Dungeon.Equipment.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoomTest {

    Room room;
    Treasure treasure;
    Enemy enemy;
    Weapon weapon;

    @Before
    public void setUp(){
        treasure = new Treasure(30, "goblet");
        weapon = new Weapon("stick", 1);
        enemy = new Enemy("dog", 35555, weapon);
        room = new Room(enemy, treasure);
    }

    @Test
    public void getEnemy() {
        assertEquals(enemy, room.getEnemy());
    }

    @Test
    public void getEnemyName(){
        assertEquals("dog", room.getEnemy().getType());
    }

    @Test
    public void getTreasure() {
        assertEquals(treasure, room.getTreasure());
    }
}