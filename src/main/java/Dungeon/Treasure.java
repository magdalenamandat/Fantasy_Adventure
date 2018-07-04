package Dungeon;

public class Treasure {
    int value;
    String type;

    public Treasure(int value, String type){
        this.value = value;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getValue() {
        return value;
    }
}
