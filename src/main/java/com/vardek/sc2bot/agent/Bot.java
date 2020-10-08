package com.vardek.sc2bot.agent;

import com.github.ocraft.s2client.bot.S2Agent;
import com.github.ocraft.s2client.protocol.game.Race;

public abstract class Bot extends S2Agent {


    public abstract Race getRace() ;

}
