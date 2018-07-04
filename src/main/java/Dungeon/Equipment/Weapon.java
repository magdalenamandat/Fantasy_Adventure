package Dungeon.Equipment;

public class Weapon {
    String type;
    int damage;

    public Weapon(String type, int damage){
        this.damage = damage;
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public String getType() {
        return type;
    }
}
