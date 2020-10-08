package com.vardek.sc2bot;

import SC2APIProtocol.Sc2Api;
import com.github.ocraft.s2client.api.test.GameServer;
import com.github.ocraft.s2client.bot.S2Coordinator;
import com.github.ocraft.s2client.protocol.game.BattlenetMap;
import com.github.ocraft.s2client.protocol.game.Difficulty;
import com.github.ocraft.s2client.protocol.game.Race;
import com.vardek.sc2bot.agent.Bot;
import com.vardek.sc2bot.agent.ProtossBot;
import com.vardek.sc2bot.agent.TerranBot;
import com.vardek.sc2bot.maps.OneVSOneMap;
import com.vardek.sc2bot.maps.PillarsOfGold;

public class Application {

    public static void main(String[] args){

        Bot bot = new ProtossBot();

        OneVSOneMap map = new PillarsOfGold();

        S2Coordinator s2Coordinator = S2Coordinator.setup()
                .loadSettings(args)
                .setParticipants(
                        S2Coordinator.createParticipant(bot.getRace(), bot),
                        S2Coordinator.createComputer(Race.ZERG, Difficulty.MEDIUM_HARD))
                .launchStarcraft()
                .startGame(BattlenetMap.of(map.getMapName()));

        while (s2Coordinator.update()) {
        }

        s2Coordinator.quit();
    }

}
