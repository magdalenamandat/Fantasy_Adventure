package Dungeon.Player;

import Dungeon.Equipment.Familiar;
import Dungeon.Equipment.Spell;

public class Caster extends Character{

    Spell spell;
    Familiar familiar;

    public Caster(String name, int hp, Spell spell, Familiar familiar) {
        super(name, hp);
        this.spell = spell;
        this.familiar = familiar;
    }

    public Familiar getFamiliar() {
        return familiar;
    }

    public Spell getSpell() {
        return spell;
    }

    public void setFamiliar(Familiar familiar) {
        this.familiar = familiar;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }
}
