package com.asteria.network.packet.impl;

import com.asteria.game.character.player.Player;
import com.asteria.network.DataBuffer;
import com.asteria.network.packet.PacketDecoder;

/**
 * The packet sent from the client when the player clicks on the 'Click this to
 * continue' link to forward a dialogue.
 * 
 * @author lare96 <http://www.rune-server.org/members/lare96/>
 */
public final class AdvanceDialoguePacket extends PacketDecoder {

    @Override
    public void decode(Player player, int opcode, int size, DataBuffer buf) {
        if (player.getViewingOrb() != null)
            return;
        player.getDialogueChain().advance();
    }
}
