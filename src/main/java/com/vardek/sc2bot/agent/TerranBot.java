package com.vardek.sc2bot.agent;

import com.github.ocraft.s2client.bot.gateway.UnitInPool;
import com.github.ocraft.s2client.protocol.data.Abilities;
import com.github.ocraft.s2client.protocol.data.Units;
import com.github.ocraft.s2client.protocol.game.Race;
import com.github.ocraft.s2client.protocol.unit.Unit;
import com.vardek.sc2bot.strategy.Strategy;

public class TerranBot extends Bot {

    private final Race race = Race.TERRAN;

    private Strategy strategy;

    public TerranBot(){
    }

    public TerranBot(Strategy strategy){
        this.strategy = strategy;
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
            case TERRAN_COMMAND_CENTER:
                actions().unitCommand(unit, Abilities.TRAIN_SCV, false);
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
    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }


}
