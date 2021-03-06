## 原型模式
### 定义
原型模式（Prototype Pattern）是指原型示例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。 调用者不需要知道任何创建的细节，不调用构造函数。

### 使用场景
* 类初始化消耗资源较多
* new产生的一个对象需要非常繁琐的过程（数据准备、访问权限等）
* 构造函数比较复杂
* 循环体中生产大量的对象

### 缺点
* 必须配备克隆（可拷贝）方法
* 当对已有类进行改造的时候，需要修改代码，违反了开闭原则
* 深拷贝、浅拷贝需要运用得当

### 其他
* 浅拷贝仅拷贝引用
* 深拷贝是拷贝数据的值
