###命令模式
将“请求”封装成对象，以便使用不同的请求、队列或者日志来参数化对象。命令模式也支持可撤销的操作。

####优点
使用命令对象将请求者从执行者中解耦

####用途
* 队列请求
* 日志请求

####要点
1. 命令可以支持撤销，做法是实现一个undo方法来回到execute()被执行前的状态
2. 命令也可以用来实现日志和事务系统
3. 在被解耦的两者之间是通过命令对象进行沟通的。命令对象封装了接受者和一个或一组动作
4. 调用者可以接受命令当做参数，甚至在运行时动态的进行

