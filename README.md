# DesignPatterns
##OO基础
- 抽象
- 封装
- 多态
- 继承

##面向对象的六大原则
- 单一职责原则:一个类中应该是一组相关性很高的函数、数据的封装。
- 开闭原则 : 软件中的对象（类、模块、函数等）应该对扩展开放,对修改关闭。
- 里氏替换原则 : 所有引用基类的地方必须能透明地使用其子类对象
- 依赖倒置原则 : 模块间的依赖通过抽象产生,实现类之间不发生直接的依赖关系,其依赖关系是通过接口或抽象类产生的。
- 接口隔离原则 : 客户端不应该依赖它不需要的接口,类之间的依赖关系应建立在最小的接口上。
- 最少知识原则 : 一个对象应该对其他对象有最少的了解。

上述原则是一种理想化的情况,实际开发中应朝着这个方向去做。以上原则会在接下来的模式中实践

##具体模式
### 行为型模式
- 封装可以互换的行为,并使用委托来决定要使用哪一个——[**StrategyPattern(策略模式)**](https://github.com/SilenceDut/DesignPatterns/blob/master/src/com/silencedut/behavioral_patterns/StrategyPattern/design_rules.md) 
- 让对象能够在改变时被通知——[**ObserverPattern(观察者模式)**](https://github.com/SilenceDut/DesignPatterns/blob/master/src/com/silencedut/behavioral_patterns/ObserverPattern/design_rules.md)