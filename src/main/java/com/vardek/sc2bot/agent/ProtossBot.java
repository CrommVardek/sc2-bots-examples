package com.vardek.sc2bot.agent;

import com.github.ocraft.s2client.bot.gateway.UnitInPool;
import com.github.ocraft.s2client.protocol.data.Abilities;
import com.github.ocraft.s2client.protocol.data.Units;
import com.github.ocraft.s2client.protocol.game.Race;
import com.github.ocraft.s2client.protocol.unit.Unit;
import com.vardek.sc2bot.strategy.Strategy;

public class ProtossBot extends Bot {

    private final Race race = Race.PROTOSS;

    private Strategy strategy;

    public ProtossBot(){
    }

    @Override
    public void onGameStart() {

    }

    @Override
    public void onStep(){

    }

    @Override
    public void onUnitIdle(UnitInPool unitInPool) {
        Unit unit = unitInPool.unit();
        switch ((Units) unit.getType()) {
            case PROTOSS_NEXUS:
                actions().unitCommand(unit, Abilities.TRAIN_DRONE, true);
                break;
            default:
                break;
        }
    }

    @Override
    public Race getRace() {
        return race;
    }

    @Override
    public void setStrategy(Strategy strategy) {
        //todo
    }


}
