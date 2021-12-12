## RabbitMQ

### AMQP
* 定义
> AMQP(Advanced Message Queuing Protocol)高级消息队列协议，是应用层协议的一个开放标准，为面向消息的中间件设计。

* 结构
> 1. Transport Layer：位于最低层，主要传输二进制数据流，提供帧的处理、信道复用、错误检测和数据表示等。
> 2. Session Layer：位于中间层，主要负责将客户端的命令发送给服务器，再将服务端的应答返回给客户端，主要为客户端与服务器之间的通信提供可靠性同步机制和错误处理。
> 3. Module Layer：位于最高层，主要定义了一些供客户端调用的命令，客户端可以利用这些命令实现自己的业务逻辑。

* 生产者流转过程
![producer.png](./producer.png)

* 消费者流转过程
![consumer.png](./consumer.png)
