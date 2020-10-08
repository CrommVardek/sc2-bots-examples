package com.vardek.sc2bot.strategy;

import java.util.List;

public interface MultipleStrategy extends Strategy {

    List<Strategy> getStrategies();

}
