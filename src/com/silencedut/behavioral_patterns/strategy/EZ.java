package com.silencedut.behavioral_patterns.strategy;

/**
 * Created by SilenceDut on 16/6/20.
 */

 class EZ extends Character {
     EZ() {
        skill = SkillFlyWeightFactory.getSkill(TwoLifeSkill.class);
     }

    @Override
    void showName() {
        System.out.print("I'm  Ezreal  ");
    }
}
