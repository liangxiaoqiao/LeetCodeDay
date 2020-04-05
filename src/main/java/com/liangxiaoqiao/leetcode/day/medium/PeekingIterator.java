package com.liangxiaoqiao.leetcode.day.medium;


import java.util.Iterator;
    

/*
 * English
 * id: 284
 * title: Peeking Iterator
 * href: https://leetcode.com/problems/peeking-iterator
 * desc: Given an Iterator class interface with methods: next() and hasNext(), design and implement a PeekingIterator that support the peek() operation -- it essentially peek() at the element that will be returned by the next call to next().
 * Example:
 * Assume that the iterator is initialized to the beginning of the list: [1,2,3].
 * <p>
 * Call next() gets you 1, the first element in the list.
 * Now you call peek() and it returns 2, the next element. Calling next() after that still return 2.
 * You call next() the final time and it returns 3, the last element.
 * Calling hasNext() after that should return false.
 * Follow up: How would you extend your design to be generic and work with all types, not just integer?
 * <p>
 * 中文
 * 序号: 284
 * 标题： 顶端迭代器
 * 链接： https://leetcode-cn.com/problems/peeking-iterator
 * 描述： 给定一个迭代器类的接口，接口包含两个方法： next() 和 hasNext()。设计并实现一个支持 peek() 操作的顶端迭代器 -- 其本质就是把原本应由 next() 方法返回的元素 peek() 出来。\n示例:\n假设迭代器被初始化为列表 [1,2,3]。\n\n调用 next() 返回 1，得到列表中的第一个元素。\n现在调用 peek() 返回 2，下一个元素。在此之后调用 next() 仍然返回 2。\n最后一次调用 next() 返回 3，末尾元素。在此之后调用 hasNext() 应该返回 false。\n进阶：你将如何拓展你的设计？使之变得通用化，从而适应所有的类型，而不只是整数型？
 * <p>
 * acceptance: 42.8%
 * difficulty: Medium
 * private: False
 */


//TODO init
// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {
    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return null;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }
}
