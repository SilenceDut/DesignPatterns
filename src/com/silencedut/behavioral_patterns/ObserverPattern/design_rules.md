#ObserverPattern(观察者模式)
##模式引入由来
-  建立一种对象与对象之间的依赖关系，一个对象发生改变时将自动通知其他对象，其他对象将相应做出反应
-  观察者之间没有相互联系,可以根据需要增加和删除观察者，使得系统更易于扩展。

##涉及的设计原则
为了交互对象间的松耦合设计而努力。

##模式原则
观察者模式——定义了对象间的一对多依赖,这样一来,当一个对象改变状态时,他所有的通知都会收到通知并自动更新。

![image](https://github.com/SilenceDut/DesignPatterns/blob/master/pictures/ObserverUML/observer_uml.png)

##优缺点
策略模式的优点

- 观察者模式可以实现表示层和数据逻辑层的分离，并定义了稳定的消息更新传递机制，抽象了更新接口，使得可以有各种各样不同的表示层作为具体观察者角色。
- 观察者模式在观察目标和观察者之间建立一个抽象的耦合。
- 观察者模式符合“开闭原则”的要求。

策略模式的缺点

- 如果一个观察目标对象有很多直接和间接的观察者的话，将所有的观察者都通知到会花费很多时间。
- 如果在观察者和观察目标之间有循环依赖的话，观察目标会触发它们之间进行循环调用，可能导致系统崩溃。

##使用场景
- 一个抽象模型有两个方面，其中一个方面依赖于另一个方面。将这些方面封装在独立的对象中使它们可以各自独立地改变和复用。
- 一个对象的改变将导致其他一个或多个对象也发生改变，而不知道具体有多少对象将发生改变，可以降低对象之间的耦合度。
- 一个对象必须通知其他对象，而并不知道这些对象是谁。

[**模式Demo**](https://github.com/SilenceDut/DesignPatterns/blob/master/src/com/silencedut/behavioral_patterns/ObserverPattern)

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
因此可以看出,可以通过实现TypeEvaluator实现evaluate方法或者实现TimeEvaluator实现getInterpolation()来"篡改"时间发生的比例来改变传入到evaluate的fraction值,实现自定义动画