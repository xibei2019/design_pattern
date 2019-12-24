# 适配器模式

### 应用场景

1. 当希望使用某些现有类，单其接口与你的其他代码不兼容时，请使用适配器模式。
2. 当希望重用几个现有的子类，这些子类缺少一些不能添加到超类中的公共功能时，请使用该模式。

### 优点

- 符合单一职责原则
- 符合开闭原则

### 缺点：



### 源码中的应用

- java.util.Arrays#asList()
- java.util.Collections#list()
- org.springframework.context.event.GenericApplicationListenerAdpter

