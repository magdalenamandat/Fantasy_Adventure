package Dungeon.Player;

import Dungeon.Treasure;

import java.util.ArrayList;

public abstract class Character {
    String name;
    int hp;
    ArrayList<Treasure> loot;

    public Character(String name, int hp){
        this.name = name;
        this.hp = hp;
        this.loot = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public ArrayList<Treasure> getLoot() {
        return loot;
    }
}
