package com.silencedut.behavioral_patterns.StrategyPattern;

/**
 * Created by SilenceDut on 16/6/20.
 */

 class EZ extends Character {
     EZ() {
        skill = new TwoLifeSkill();
    }

    @Override
    void showName() {
        System.out.print("I'm  Ezreal  ");
    }
}
