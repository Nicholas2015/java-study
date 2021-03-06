## 委派模式

### 定义
委派模式（Delegate Pattern）又叫委托模式。它的基本作用就是负责任务的调度和任务分配，将任务的分配和执行分离开来。可以看作是一种特殊情况下的讲台代理的全权代理。

不属于GOF23种设计模式之一。

属于行为型模式。

### 场景
* 委派对象本身不知道如何处理一个任务或请求，把请求交给其它对象来处理。
* 实现程序的解耦。 

### 优点
通过任务委派能够将一个大型的任务进行细化，然后统一管理这些子任务的完成情况实现任务的跟进，能够加快任务执行的效率。

### 缺点
任务委派方式需要根据任务的复杂程度进行不同的改变，在任务比较复杂的情况下可能需要进行多重委派，容易造成混乱。


### 委派模式和代理模式区别
* 委派模式是行为型模式，代理模式是结构型模式。
* 委派模式注重任务的派遣，注重结果；代理模式注重代码的增强，注重过程。
* 委派模式是一种特殊的代理模式，相当于全权代理。

### 委派模式和门面模式的区别
* 委派模式是全权代理，单一代理；
* 门面模式是一个代理但不是全权代理，门面模式是一种结构性模式，是多重代理。