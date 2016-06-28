package com.silencedut.behavioral_patterns.strategy;

/**
 * Created by SilenceDut on 16/6/20.
 * 把可以复用的行为（算法）抽离出来,比如拥有隐身技能和两条命技能是很多英雄所共有的技能
 * 如果放在父类中使用继承或者接口让子类继承时复写skill,会使一些代码无法复用。
 *
 */
 abstract class Character {
    Skill skill;
    void setSkill(Skill skill) {
        this.skill=skill;
    }

    void showSkill() {
        skill.skill();
    }

    abstract void showName() ;
}
