package Dungeon;

import Dungeon.Equipment.EnemyAttack;

public class Enemy {
    String type;
    int hp;
    EnemyAttack attack;

    public Enemy(String type, int hp, EnemyAttack attack){
        this.type = type;
        this.hp = hp;
        this.attack = attack;
    }

    public String getType() {
        return type;
    }

    public int getHp() {
        return hp;
    }

    public EnemyAttack getAttack() {
        return attack;
    }

}
