package com.silencedut.behavioral_patterns.StrategyPattern;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by SilenceDut on 16/6/20.
 * 享元模式(Flyweight Pattern)：运用共享技术有效地支持大量细粒度对象的复用。
 * 系统只使用少量的对象，而这些对象都很相似，状态变化很小，可以实现对象的多次复用。
 * 由于享元模式要求能够共享的对象必须是细粒度对象，因此它又称为轻量级模式，它是一种对象结构型模式。
 */

public class SkillFlyWeightFactory {
    public static Map<String,Skill> sSkillMap = new ConcurrentHashMap<>();
}
