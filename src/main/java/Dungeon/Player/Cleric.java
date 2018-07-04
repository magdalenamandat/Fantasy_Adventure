package Dungeon.Player;

import Dungeon.Equipment.Tool;

public class Cleric extends Character {

    Tool tool;

    public Cleric(String name, int hp, Tool tool) {
        super(name, hp);
        this.tool = tool;
    }

    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }
}
