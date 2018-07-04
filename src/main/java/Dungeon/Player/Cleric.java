package Dungeon.Player;

import Dungeon.Behaviours.iCast;
import Dungeon.Behaviours.iDamage;
import Dungeon.Equipment.Tool;

public class Cleric extends Character implements iCast{

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

    public void cast(iDamage target) {
        target.damage((0-tool.getHealing()));
    }
}
