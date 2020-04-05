package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 381
 * title: Insert Delete GetRandom O(1) - Duplicates allowed
 * href: https://leetcode.com/problems/insert-delete-getrandom-o1-duplicates-allowed
 * desc: Design a data structure that supports all following operations in average O(1) time.\nNote: Duplicate elements are allowed.\ninsert(val): Inserts an item val to the collection.\nremove(val): Removes an item val from the collection if present.\ngetRandom: Returns a random element from current collection of elements. The probability of each element being returned is linearly related to the number of same value the collection contains.\nExample:\n// Init an empty collection.\nRandomizedCollection collection = new RandomizedCollection();\n\n// Inserts 1 to the collection. Returns true as the collection did not contain 1.\ncollection.insert(1);\n\n// Inserts another 1 to the collection. Returns false as the collection contained 1. Collection now contains [1,1].\ncollection.insert(1);\n\n// Inserts 2 to the collection, returns true. Collection now contains [1,1,2].\ncollection.insert(2);\n\n// getRandom should return 1 with the probability 2/3, and returns 2 with the probability 1/3.\ncollection.getRandom();\n\n// Removes 1 from the collection, returns true. Collection now contains [1,2].\ncollection.remove(1);\n\n// getRandom should return 1 and 2 both equally likely.\ncollection.getRandom();
 * <p>
 * 中文
 * 序号: 381
 * 标题： O(1) 时间插入、删除和获取随机元素 - 允许重复
 * 链接： https://leetcode-cn.com/problems/insert-delete-getrandom-o1-duplicates-allowed
 * 描述： 设计一个支持在平均 时间复杂度 O(1) 下， 执行以下操作的数据结构。\n注意: 允许出现重复元素。\ninsert(val)：向集合中插入元素 val。\nremove(val)：当 val 存在时，从集合中移除一个 val。\ngetRandom：从现有集合中随机获取一个元素。每个元素被返回的概率应该与其在集合中的数量呈线性相关。\n示例:\n// 初始化一个空的集合。\nRandomizedCollection collection = new RandomizedCollection();\n\n// 向集合中插入 1 。返回 true 表示集合不包含 1 。\ncollection.insert(1);\n\n// 向集合中插入另一个 1 。返回 false 表示集合包含 1 。集合现在包含 [1,1] 。\ncollection.insert(1);\n\n// 向集合中插入 2 ，返回 true 。集合现在包含 [1,1,2] 。\ncollection.insert(2);\n\n// getRandom 应当有 2/3 的概率返回 1 ，1/3 的概率返回 2 。\ncollection.getRandom();\n\n// 从集合中删除 1 ，返回 true 。集合现在包含 [1,2] 。\ncollection.remove(1);\n\n// getRandom 应有相同概率返回 1 和 2 。\ncollection.getRandom();
 * <p>
 * acceptance: 33.1%
 * difficulty: Hard
 * private: False
 */


//TODO init
class RandomizedCollection {
    /*
     * Initialize your data structure here.
     */
    public RandomizedCollection() {
    }

    /*
     * Inserts a value to the collection. Returns true if the collection did not already contain the specified element.
     */
    public boolean insert(int val) {
        return false;
    }

    /*
     * Removes a value from the collection. Returns true if the collection contained the specified element.
     */
    public boolean remove(int val) {
        return false;
    }

    /*
     * Get a random element from the collection.
     */
    public int getRandom() {
        return 0;
    }
}

/*
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
