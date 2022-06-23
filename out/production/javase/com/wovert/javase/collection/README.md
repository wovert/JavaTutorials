# 集合

- Collection接口(类的对象)
  - List接口(序列) 有序，可重复
    - ArrayList
    - LinkedList
  - Queue接口(队列) 有序，可重复
    - LinkedList
  - Set接口(集) 无序，不可重复
    - HashSet
- Map接口(<Key,Value>) 键值对
  - HashMap

## ArrayLisit

> 底层时由数组实现的
> 动态增长
> 查询效率高，列表尾部插入或删除数据非常有效，线程不安全
> 适合查找和更新元素
> 元素可以为 `null`

## LinkedList

> 底层用双向链表实现的存储。查询效率第，增删效率高，线程不安全

## Vector

> 底层是用数组实现的List，有同步检查，因此 "线程安全、效率低"


## Map

- HashMap: 线程不安全，效率高。允许 key 或 value为 null
- HashTable: 线程安全，效率低。不允许 key 或 value为 null
