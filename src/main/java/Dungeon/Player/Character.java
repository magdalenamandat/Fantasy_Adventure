package Dungeon.Player;

import Dungeon.Behaviours.iDamage;
import Dungeon.Equipment.Weapon;
import Dungeon.Treasure;

import java.util.ArrayList;

public abstract class Character implements iDamage {
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
    public void damage(int damage) {
        this.hp -= damage;
    }
}
