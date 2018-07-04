package Dungeon;

import Dungeon.Behaviours.iAttack;
import Dungeon.Behaviours.iDamage;
import Dungeon.Equipment.Weapon;

public class Enemy implements iAttack, iDamage {
    String type;
    int hp;
    Weapon weapon;

    public Enemy(String type, int hp, Weapon weapon){
        this.type = type;
        this.hp = hp;
        this.weapon = weapon;
    }

    public String getType() {
        return type;
    }

    public int getHp() {
        return hp;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void attack(iDamage target) {
        target.damage(weapon.getDamage());
    }

    public void damage(int damage){
        this.hp = hp -damage;
    }
}
