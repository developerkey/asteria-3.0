package com.asteria.game.character.combat.magic;

import com.asteria.game.character.CharacterNode;

/**
 * The {@link CombatSpell} extension with support for normal spells that have no
 * effects whatsoever.
 * 
 * @author lare96 <http://www.rune-server.org/members/lare96/>
 */
public abstract class CombatNormalSpell extends CombatSpell {

    @Override
    public void executeOnHit(CharacterNode cast, CharacterNode castOn, boolean accurate, int damage) {

    }
}