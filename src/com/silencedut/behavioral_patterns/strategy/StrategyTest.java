package com.silencedut.behavioral_patterns.strategy;

/**
 * Created by SilenceDut on 16/6/20.
 */

public class StrategyTest {
    public static void main(String[] args) {
        Character character = new EZ();
        character.showName();
        character.showSkill();
        character = new Monkey();
        character.showName();
        character.showSkill();
        character.setSkill(SkillFlyWeightFactory.getSkill(TwoLifeSkill.class));
        character.showName();
        character.showSkill();
    }
}
