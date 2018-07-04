package Dungeon.Player;

import Dungeon.Equipment.Familiar;
import Dungeon.Equipment.Spell;

public class Caster extends Character{
    public Caster(String name, int hp, Spell spell, Familiar familiar) {
        super(name, hp);
        this.spell = spell;
        this.familiar = familiar;
    }
}
