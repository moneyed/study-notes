# 零基础小白

### Redis安装配置
yum -y install gcc-c++

注：如果之前没有安装gcc和c++,之后安装了，会出现zmalloc.h:50:31: 致命错误：jemalloc/jemalloc.h：没有那个文件或目录。解决方法：删除之前的压缩包，重新解压缩一遍，然后再执行make && make install,即可成功

daemonize yes           redis会在后台运行
protected-mode yes
想办法让Redis运行在protected-mode为no的模式。
如果protected-mode为yes，那么我们可以在Redis服务上设置bind，也就是我们的一台机器有几个ip，指定我们的服务绑定监听本机的哪个ip。
如果protected-mode为yes，除了设置bind外，亦可通过设置密码的形式，也即是设置参数requirepass，从而达到可以从其他机器访问的目标。


### Redis 10大数据类型




### Redis持久化
Redis 默认用的是RDB,不是AOF

RDB---手动触发，自动触发，sava,bgsave
redis使用fork创建子进程就行rdb或aof重写操作时，fork子进程的过程会阻塞主进程，阻塞时间取决于主进程的内存大小–这里你是否觉得有疑问：fork子进程的时候主进程和子进程是采用共享内存的方式进行内存共享的啊，fork阻塞的时间长短怎么会和主进程的内存大小相关呢？
原因是因为主进程fork子进程的时候，子进程需要创建内存页表，一般是几十M左右，主进程的内存越大，内存页表页就越多，所以fork子进程就会越慢。


修复RDB文件：
    cd /user/local/bin
    redis-check-rdb /myredis/dumfiles/dump6379.db

哪些情况会触发RDB快照:
    配置文件中默认的快照配置
    手动fulush/flushdb命令也会产生dump.rdb文件，但里面是空白的
    执行shutdown且没有设置开启AOF持久化
    主从复制时，主节点自动触发

开启ROF:
    在配置文件中，1380中，将appendonly no设置成yes
    保存路径：在redis6中，AOF和RDB共用一个目录。
 


### Redis事务




### Redis管道




### 发布订阅



### 复制(replica)


### Redis哨兵(sentinel)



### Redis集群(cluster)



### SpringBoot集成Redis












# 大厂高阶篇