package Dungeon.Equipment;

public class EnemyAttack {
    int damage;
    String weapon;

    public EnemyAttack(int damage, String weapon){
        this.damage = damage;
        this.weapon = weapon;
    }

    public int getDamage() {
        return damage;
    }

    public String getWeapon() {
        return weapon;
    }
}
