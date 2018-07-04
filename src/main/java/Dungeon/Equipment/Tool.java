package Dungeon.Equipment;

public class Tool {

    String type;
    int healing;

    public Tool(String type, int healing){
        this.type = type;
        this.healing = healing;
    }

    public String getType() {
        return type;
    }

    public int getHealing() {
        return healing;
    }
}
