package Dungeon;

public class Room {
    Enemy enemy;
    Treasure treasure;
    Boolean completed;

    public Room(Enemy enemy,Treasure treasure){
        this.enemy = enemy;
        this.treasure = treasure;
        completed = false;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public Treasure getTreasure() {
        return treasure;
    }
//
//    public String completeRoom(){
//
//        {treasure.loot();
//        return "Room complete!";}
//    }
}
