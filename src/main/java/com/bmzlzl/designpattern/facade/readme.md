# 门面模式

### 应用场景

门面模式要求一个子系统的外部与其内部的通信必须通过一个统一的门面(Facade)对象进行。门面模式提供一个高层次的接口，使得子系统更易于使用。

就如同医院的接待员一样，门面模式的门面类将客户端与子系统的内部复杂性分隔开，使得客户端只需要与门面对象打交道，而不需要与子系统内部的很多对象打交道。

### 优点

1、子系统可以有选择的暴露方法

门面模式还有一个附带的好处，就是能够有选择性地暴露方法。一个模块中定义的方法可以分成两部分，一部分是给子系统外部使用的，一部分是子系统内部模块之间相互调用时使用的。有了Facade类，那么用于子系统内部模块之间相互调用的方法就不用暴露给子系统外部了。

2、一个门面模式可以有很多个门面类

在门面模式中，通常只需要一个门面类。如果一个系统有好几个子系统的话，每一个子系统都有一个门面类，整个系统可以有数个门面类。

3、不能为子系统增加新行为

门面模式的用意是为子系统提供一个集中化和简化的沟通管道，而不能向子系统加入新的行为。就比如包工头的作用只是调度其他人工作的，但是自己不工作。

4、松耦合、而且使用简单。

用户与子系统解耦，屏蔽子系统；可以提高子系统的独立性；并且客户类不需要知道子系统的内部构造。

### 缺点：

不规范的编程方式
没有面向抽象编程，而是通过增加中介层，转换服务提供方的服务接口；

### 与代理模式的区别

这个模式乍一看还真的很像代理模式，其实还是有很大的区别的。

比如说他们都引入了中介，起到了代理的功能。但是代理模式只代理一个类，而且代理类与原类实现相同的抽象。门面类就不一样了，他代理的是一系列类，与子系统可以有不同的抽象。

### 源码中的应用

- RequestFacade
- log4j

- Netty bootstrap

- activiti ProcessEngine
