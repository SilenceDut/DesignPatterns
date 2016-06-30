#StrategyPattern(策略模式)
##模式引入由来
-  继承可以使代码复用,但继承导致对局部（比如父类）进行修改时,影响层面不只是局部,

当涉及维护时,为了复用而使用继承结局并不完美

-  接口会导致代码的复用性降低

##涉及的设计原则

1. 找出应用中可能需要变化之处,把它们独立出来,不要和那些不需要变的代码混在一起。
改变时好让其他部分不受影响。

2. 针对接口编程,而不是针对实现编程。针对接口编程,实际上是针对父类编程。

3. 多用组合,少用继承。

##模式定义
策略模式——定义算法族,分别封装起来,让他们之间可以互相替换,此模式让使用算法的变化独立于使用算法的客户。

![image](https://github.com/SilenceDut/DesignPatterns/blob/master/pictures/StrategyUML/strategy_uml.png)

##优缺点
策略模式的优点

- 策略模式提供了对“开闭原则”的完美支持，用户可以在不修改原有系统的基础上选择算法

或行为，也可以灵活地增加新的算法或行为。

- 策略模式提供了管理相关的算法族的办法。

- 策略模式提供了可以替换继承关系的办法。

- 使用策略模式可以避免使用多重条件转移语句。

策略模式的缺点

- 客户端必须知道所有的策略类，并自行决定使用哪一个策略类。
- 策略模式将造成产生很多策略类，可以通过使用[**享元模式(对象复用)**](https://github.com/SilenceDut/DesignPatterns/blob/master/src/com/silencedut/behavioral_patterns/strategy/SkillFlyWeightFactory.java) 在一定程度上减少对象的数量。

##使用场景
- 同一类型问题多重处理方式,仅仅是具体行为差别时

- 一个系统需要动态地在几种算法中选择一种。

- 如果一个对象有很多的行为，如果不用恰当的模式，这些行为就只好使用多重的条件选择语句来实现。

- 不希望客户端知道复杂的、与算法相关的数据结构，在具体策略类中封装算法和相关的数据结构，

提高算法的保密性与安全性。

##Demo
[**模式Demo**](https://github.com/SilenceDut/DesignPatterns/blob/master/src/com/silencedut/behavioral_patterns/strategy)

##Android中的源码解析

![image](https://github.com/SilenceDut/DesignPatterns/blob/master/pictures/StrategyUML/Strategy_ValueAnimator.png)

PropertyValueHolder主要是在ObjectAnimator里通过属性的get和set方法直接改变属性值。

通过一系列调用,ValueAnimator的**start()**方法会调用**animateValue(float fraction)**方法,传入的fraction为实际的时间消耗比例。
```java 
//ValueAnimator
    void animateValue(float fraction) {
        fraction = mInterpolator.getInterpolation(fraction);//改变时间消耗比例;
        mCurrentFraction = fraction;
        int numValues = mValues.length;
        for (int i = 0; i < numValues; ++i) {
            mValues[i].calculateValue(fraction);//通过时间消耗比率算出当前的值,实际上是调用当前TypeEvaluator的evaluate()计算出相应的值
        }
        if (mUpdateListeners != null) {
            int numListeners = mUpdateListeners.size();
            for (int i = 0; i < numListeners; ++i) {
                mUpdateListeners.get(i).onAnimationUpdate(this);
            }
        }
    }
    
 //ObjectAnimator  继承自ValueAnimator
    void animateValue(float fraction) {
        final Object target = getTarget();
        if (mTarget != null && target == null) {
            // We lost the target reference, cancel and clean up.
            cancel();
            return;
        }
        super.animateValue(fraction);//调用ValueAnimator的animateValue()方法
        int numValues = mValues.length;
        for (int i = 0; i < numValues; ++i) {
            mValues[i].setAnimatedValue(target);  //此处调用对象的set改变属性的值
        }
    }
```
因此可以看出,可以通过实现TypeEvaluator实现evaluate方法或者实现TimeEvaluator实

现getInterpolation()来"篡改"时间发生的比例来改变传入到evaluate的fraction值,实现自定义动画