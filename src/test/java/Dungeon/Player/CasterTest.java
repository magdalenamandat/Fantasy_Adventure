package Dungeon.Player;

import Dungeon.Enemy;
import Dungeon.Equipment.Familiar;
import Dungeon.Equipment.Spell;
import Dungeon.Equipment.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CasterTest {

    Familiar familiar1;
    Familiar familiar2;
    Spell spell1;
    Spell spell2;
    Caster caster;
    Weapon weapon1;
    Enemy enemy;


    @Before
    public void setUp(){
        familiar1 = new Familiar("Kevin", "Rat");
        familiar2 = new Familiar("Horace", "Horse");
        spell1 = new Spell("Grease", 5);
        spell2 = new Spell("Wish", 500);
        caster = new Caster("Barry", 20, spell1, familiar1);
        weapon1 = new Weapon("Stick", 1);
        enemy = new Enemy("Goblin", 3, weapon1);
    }

    @Test
    public void getFamiliar() {
        assertEquals(familiar1, caster.getFamiliar());
    }

    @Test
    public void getSpell() {
        assertEquals(spell1, caster.getSpell());
    }


    @Test
    public void getName() {
        assertEquals("Barry", caster.getName());
    }

    @Test
    public void getHp() {
        assertEquals(20, caster.getHp());
    }

    @Test
    public void getLoot() {
        assertEquals(0, caster.getLoot().size());
    }

    @Test
    public void setSpell() {
        caster.setSpell(spell2);
        assertEquals(spell2, caster.getSpell());
    }

    @Test
    public void setFamiliar() {
        caster.setFamiliar(familiar2);
        assertEquals(familiar2, caster.getFamiliar());
    }

    @Test
    public void cast() {
        caster.cast(enemy);
        assertEquals(-2, enemy.getHp());
    }

    @Test
    public void damage() {
        enemy.attack(caster);
        assertEquals(19, caster.getHp());
    }
}