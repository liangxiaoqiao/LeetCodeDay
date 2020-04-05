package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 705
 * title: Design HashSet
 * href: https://leetcode.com/problems/design-hashset
 * desc: Design a HashSet without using any built-in hash table libraries.\nTo be specific, your design should include these functions:\nadd(value): Insert a value into the HashSet. \ncontains(value) : Return whether the value exists in the HashSet or not.\nremove(value): Remove a value in the HashSet. If the value does not exist in the HashSet, do nothing.\n\nExample:\nMyHashSet hashSet = new MyHashSet();\nhashSet.add(1);         \nhashSet.add(2);         \nhashSet.contains(1);    // returns true\nhashSet.contains(3);    // returns false (not found)\nhashSet.add(2);          \nhashSet.contains(2);    // returns true\nhashSet.remove(2);          \nhashSet.contains(2);    // returns false (already removed)\n\nNote:\nAll values will be in the range of [0, 1000000].\nThe number of operations will be in the range of [1, 10000].\nPlease do not use the built-in HashSet library.
 * <p>
 * 中文
 * 序号: 705
 * 标题： 设计哈希集合
 * 链接： https://leetcode-cn.com/problems/design-hashset
 * 描述： 不使用任何内建的哈希表库设计一个哈希集合\n具体地说，你的设计应该包含以下的功能\nadd(value)：向哈希集合中插入一个值。\ncontains(value) ：返回哈希集合中是否存在这个值。\nremove(value)：将给定值从哈希集合中删除。如果哈希集合中没有这个值，什么也不做。\n\n示例:\nMyHashSet hashSet = new MyHashSet();\nhashSet.add(1);         \nhashSet.add(2);         \nhashSet.contains(1);    // 返回 true\nhashSet.contains(3);    // 返回 false (未找到)\nhashSet.add(2);          \nhashSet.contains(2);    // 返回 true\nhashSet.remove(2);          \nhashSet.contains(2);    // 返回  false (已经被删除)\n\n注意：\n所有的值都在 [1, 1000000]的范围内。\n操作的总数目在[1, 10000]范围内。\n不要使用内建的哈希集合库。
 * <p>
 * acceptance: 57.4%
 * difficulty: Easy
 * private: False
 */


//TODO init
class DesignHashset {
    /*
     * Initialize your data structure here.
     */
    public DesignHashset() {
    }

    public void add(int key) {
    }

    public void remove(int key) {
    }

    /*
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        return false;
    }
}

/*
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
