###模板方法模式
在一个方法中定义一个算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以在不改变算法结构的情况下，重新定义算法中的某些步骤。

_钩子(hook)_
钩子是一种被声明在抽象类中的方法，但只有空得或者默认的实现。钩子的存在，可以让子类有能力对算法的不同点进行挂钩。要不要挂钩，由子类自行决定。

####设计原则
别调用我们，我们会调用你。

####要点
* "模板方法"定义了算法的步骤，把这些步骤的实现延迟到子类
* 为了防止子类改变模板方法中的算法，可以将模板方法声明为final
* 策略模式和模板方法模式都封装算法，一个用组合，一个用继承
* 工厂方法是模板方法一种特殊版本