package Dungeon.Player;

import Dungeon.Equipment.Tool;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClericTest {

    Tool tool1;
    Tool tool2;
    Cleric cleric;

    @Before
    public void setUp(){
        tool1 = new Tool("potion", 10);
        tool2 = new Tool("herbs", 50);
        cleric = new Cleric("Garry", 20, tool1);
    }

    @Test
    public void getTool() {
        assertEquals(tool1, cleric.getTool());
    }

    @Test
    public void setTool(){
        cleric.setTool(tool2);
        assertEquals(tool2, cleric.getTool());
    }
}