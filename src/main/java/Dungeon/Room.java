package Dungeon;

import java.util.ArrayList;

public class Room {
    ArrayList<Enemy> enemy;
    ArrayList<Treasure> treasure;

    public Room(){
        enemy = new ArrayList<>();
        treasure = new ArrayList<>();
    }

    public ArrayList<Enemy> getEnemy() {
        return enemy;
    }

    public ArrayList<Treasure> getTreasure() {
        return treasure;
    }
}
