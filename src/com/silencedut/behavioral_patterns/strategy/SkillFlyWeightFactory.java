package com.silencedut.behavioral_patterns.strategy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by SilenceDut on 16/6/20.
 * 享元模式(Flyweight Pattern)：运用共享技术有效地支持大量细粒度对象的复用。
 * 系统只使用少量的对象，而这些对象都很相似，状态变化很小，可以实现对象的多次复用。
 * 由于享元模式要求能够共享的对象必须是细粒度对象，因此它又称为轻量级模式，它是一种对象结构型模式。
 *
 * 关于ConcurrentHashMap（http://www.infoq.com/cn/articles/ConcurrentHashMap）
 * HashMap 线程不安全
 * HashTable 使用synchronized来保证线程安全，但在线程竞争激烈的情况下HashTable的效率非常低下。
 *   ConcurrentHashMap 运用锁分段技术,并且get不加锁,读取效率很高
     HashTable容器在竞争激烈的并发环境下表现出效率低下的原因是所有访问HashTable的线程都必须竞争同一把锁，
     那假如容器里有多把锁，每一把锁用于锁容器其中一部分数据，那么当多线程访问容器里不同数据段的数据时，
     线程间就不会存在锁竞争，从而可以有效的提高并发访问效率，这就是ConcurrentHashMap所使用的锁分段技术，
     首先将数据分成一段一段的存储，然后给每一段数据配一把锁，当一个线程占用锁访问其中一个段数据的时候，
     其他段的数据也能被其他线程访问。
 */

 class SkillFlyWeightFactory {
    private static Map<String,Skill> sSkillMap = new ConcurrentHashMap<>();

     static <T extends Skill> T getSkill(Class<T> skillClass ) {
        if(skillClass==null) {
            return null;
        }
        String skillName = skillClass.getSimpleName();
        if(sSkillMap.containsKey(skillName)) {
            return (T) sSkillMap.get(skillName);
        }else {
            T skill = null;
            try {
                skill = skillClass.newInstance();
                sSkillMap.put(skillName,skill);
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
            return skill;
        }

    }
}
