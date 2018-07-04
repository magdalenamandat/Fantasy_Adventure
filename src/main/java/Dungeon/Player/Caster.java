package Dungeon.Player;

import Dungeon.Behaviours.iCast;
import Dungeon.Behaviours.iDamage;
import Dungeon.Equipment.Familiar;
import Dungeon.Equipment.Spell;

public class Caster extends Character implements iCast{

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

    public void cast(iDamage target) {
        target.damage(spell.getDamage());
    }
}
