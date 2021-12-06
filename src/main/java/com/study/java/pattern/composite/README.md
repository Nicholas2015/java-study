## 组合模式

### 定义
组合模式（Composite Pattern）也成为整体-部分（Part-Whole）模式，它的宗旨是通过将单个对象（叶子节点）和组合对象（树枝节点）用相同的接口进行表示。

作用：是客户端对单个对象和组合对象保持一致的方式处理。

属于结构型模式

### 场景

### 优点
* 清楚的定义分层次的复杂对象，表示对象的额全部和部分层次
* 让客户端忽略了层次的差异，方便对整个层次结构进行控制
* 简化客户端代码
* 符合开闭原则

### 缺点
* 限制类型时比较复杂
* 设设计变得更加抽象