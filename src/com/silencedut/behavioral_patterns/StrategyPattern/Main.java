package com.silencedut.behavioral_patterns.StrategyPattern;

public class Main {

    public static void main(String[] args) {
	    Character character = new EZ();
        character.showName();
        character.showSkill();
        character = new Monkey();
        character.showName();
        character.showSkill();
        character.setSkill(new TwoLifeSkill());
        character.showName();
        character.showSkill();

    }
}
