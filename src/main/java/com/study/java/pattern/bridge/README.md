## 桥接模式

### 定义
桥接模式（Bridge Pattern）也称桥梁模式、接口（Interface）模式或者柄体（Handle and Body）模式，是将抽象部分与它的具体实现部分分离，使它们都可以独立地变化。

通过组合的方式建立两个类之间的关系，而不是继承。属于结构型模式。

### 场景
* 在抽象和具体实现之间需要增加更多的灵活性的场景
* 一个类存在两个或多个独立变化的维度，而这两个或多个维度都需要独立进行拓展
* 不希望使用继承，或因为多层继承导致系统类的个数剧增

### 优点
* 分离抽象部分及具体实现部分
* 提高了系统的拓展性
* 符合开闭原则
* 符合合成复用原则

### 缺点
* 增加了系统的理解和设计难度
* 需要正确地识别系统中两个独立变化的维度

### 其它
* 桥接模式和组合模式
  * 桥接模式是一种特殊的组合模式
  * 组合模式里面存在一条主线，桥接模式注重的不是一条线，而是一种形式
* 桥接模式和适配器模式
  * 适配器模式解决的是兼容，存在强依赖
  * 桥接模式解决的是一种连接，约定好，不存在强制关联