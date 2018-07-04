package Dungeon;

public class Room {
    Enemy enemy;
    Treasure treasure;

    public Room(Enemy enemy,Treasure treasure){
        this.enemy = enemy;
        this.treasure = treasure;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public Treasure getTreasure() {
        return treasure;
    }
}
