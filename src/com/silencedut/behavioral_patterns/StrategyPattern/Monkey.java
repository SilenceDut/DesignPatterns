package com.silencedut.behavioral_patterns.StrategyPattern;

/**
 * Created by SilenceDut on 16/6/20.
 */

 class Monkey extends Character {
     Monkey() {
        skill =new  HideSkill();
    }

    @Override
    void showName() {
        System.out.print("I'm  Monkey  ");
    }
}
