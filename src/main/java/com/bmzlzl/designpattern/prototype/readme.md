# 原型模式

### 应用场景

当代码不应该依赖于需要复制的对象的具体类时，请使用Prototype模式。

### 优点

1. 可以不耦合具体类的情况下克隆对象
2. 避免重复的初始代码
3. 更方便的构建复杂对象

### Spring源码中的应用

- AbstractBeanDefinition
- ArrayList

