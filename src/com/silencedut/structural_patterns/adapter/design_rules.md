#AdapterPattern(适配器模式)
##模式引入由来
- 系统需要使用现有的类，而这些类的接口不符合系统的需要。

- 想要建立一个可以重复使用的类，用于与一些彼此之间没有太大关联的一些类，包括一些可能

在将来引进的类一起工作。

##涉及的设计原则
- 多用组合,少用继承

- 面向接口编程——也就是面向父类编程

##模式定义
将一个接口转换成客户希望的另一个接口，适配器模式使接口不兼容的那些类可以一起工作。

适配器模式既可以作为类结构型模式，也可以作为对象结构型模式。

###UML
Client 需要Target接口的request()，但现有的Adaptee只有specificRequest(e)，

出现不兼容的情况，通过一个Adapter实现一个request()函数将Adaptee的specificRequest()

转换为Client需要的request()

![image](https://github.com/SilenceDut/DesignPatterns/blob/master/pictures/AdapterUML/adapter_uml.png)

##优缺点
适配器模式的优点
- 将目标类和适配者类解耦，通过引入一个适配器类来重用现有的适配者类，而无须修改原有代码。

- 增加了类的透明性和复用性，将具体的实现封装在适配者类中，对于客户端类来说是透明的，

而且提高了适配者的复用性。

- 灵活性和扩展性都非常好，通过使用配置文件，可以很方便地更换适配器，也可以在不修改原

有代码的基础上增加新的适配器类，完全符合“开闭原则”。

- 具体产品就可以了。这样，系统的可扩展性也就变得非常好，完全符合“开闭原则”。

适配器模式的缺点

过多的使用适配器,会让系统非常凌乱,不易把握整体。一个系统如果过多的出现这种情况,应该

考虑是否需要对系统进行重构。

##和装饰者模式的对比
两种模式都是对对象进行组合封装。

但装饰者没有对接口进行改变,但加入新的责任;

适配器模式是是一个借口转换成另一个接口。

##Demo
[**适配器模式Demo**](https://github.com/SilenceDut/DesignPatterns/blob/master/src/com/silencedut/structural_patterns/adapter)
