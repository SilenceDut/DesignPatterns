package com.silencedut.behavioral_patterns.StrategyPattern;

/**
 * Created by SilenceDut on 16/6/20.
 */

 class Monkey extends Character {
     Monkey() {
        skill =SkillFlyWeightFactory.getSkill(HideSkill.class);
    }

    @Override
    void showName() {
        System.out.print("I'm  Monkey  ");
    }
}
