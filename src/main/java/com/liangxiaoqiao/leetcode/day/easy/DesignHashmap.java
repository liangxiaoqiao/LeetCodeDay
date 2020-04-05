package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 706
 * title: Design HashMap
 * href: https://leetcode.com/problems/design-hashmap
 * desc: Design a HashMap without using any built-in hash table libraries.\nTo be specific, your design should include these functions:\nput(key, value) : Insert a (key, value) pair into the HashMap. If the value already exists in the HashMap, update the value.\nget(key): Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.\nremove(key) : Remove the mapping for the value key if this map contains the mapping for the key.\n\nExample:\nMyHashMap hashMap = new MyHashMap();\nhashMap.put(1, 1);          \nhashMap.put(2, 2);         \nhashMap.get(1);            // returns 1\nhashMap.get(3);            // returns -1 (not found)\nhashMap.put(2, 1);          // update the existing value\nhashMap.get(2);            // returns 1 \nhashMap.remove(2);          // remove the mapping for 2\nhashMap.get(2);            // returns -1 (not found) \n\nNote:\nAll keys and values will be in the range of [0, 1000000].\nThe number of operations will be in the range of [1, 10000].\nPlease do not use the built-in HashMap library.
 * <p>
 * 中文
 * 序号: 706
 * 标题： 设计哈希映射
 * 链接： https://leetcode-cn.com/problems/design-hashmap
 * 描述： 不使用任何内建的哈希表库设计一个哈希映射\n具体地说，你的设计应该包含以下的功能\nput(key, value)：向哈希映射中插入(键,值)的数值对。如果键对应的值已经存在，更新这个值。\nget(key)：返回给定的键所对应的值，如果映射中不包含这个键，返回-1。\nremove(key)：如果映射中存在这个键，删除这个数值对。\n\n示例：\nMyHashMap hashMap = new MyHashMap();\nhashMap.put(1, 1);          \nhashMap.put(2, 2);         \nhashMap.get(1);            // 返回 1\nhashMap.get(3);            // 返回 -1 (未找到)\nhashMap.put(2, 1);         // 更新已有的值\nhashMap.get(2);            // 返回 1 \nhashMap.remove(2);         // 删除键为2的数据\nhashMap.get(2);            // 返回 -1 (未找到) \n\n注意：\n所有的值都在 [1, 1000000]的范围内。\n操作的总数目在[1, 10000]范围内。\n不要使用内建的哈希库。
 * <p>
 * acceptance: 58.2%
 * difficulty: Easy
 * private: False
 */


//TODO init
class DesignHashmap {
    /*
     * Initialize your data structure here.
     */
    public DesignHashmap() {

    }

    /*
     * value will always be non-negative.
     */
    public void put(int key, int value) {
    }

    /*
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {
        return 0;
    }

    /*
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {
    }
}

/*
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
