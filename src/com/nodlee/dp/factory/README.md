###工厂模式
工厂模式包含两部分：工厂方法和抽象工厂

1. 工厂方法
定义了一个创建对象的接口，但由子类决定要实例化哪一个。工厂方法让类把实例化推迟到子类。把工厂方法定义为静态方法，俗称静态工厂方法。这样做有一个缺点：不能通过继承来改变创建方法的行为。

2. 抽象工厂模式
提供一个借口，用于创建相关或依赖对象的家族，而不需要明确指定具体类。

####OO原则
依赖抽象，不要依赖具体类

####要点
* 所有的工厂都是用来封装对象的创建  
* 简单工厂属于编程习惯而不是真正的模式  

####优点
1. 帮助我们针对抽象编程，而不是针对具体编程  
2. 抽象工厂创建相关的对象家族，而不需要依赖他们的具体类  
3. 减少应用程序和具体类之间的依赖促进松耦合  
4. 对象工程使用继承，把对象的创建委托给子类，子类实现工厂方法来创建对象  

####依赖倒置原则
要依赖抽象，不要依赖具体类。这里更强调的是：不能让高层组件依赖低层组件，而且不管是高层或低层组件，两者都应该依赖于抽象。

避免违反依赖倒置原则：
1. 变量不可以持有具体类的应用
2. 不要让类派生自具体类
3. 不要覆盖基类中已实现的方法
* 尽量达到这个原则，而不是随时都要遵循这个原则。
