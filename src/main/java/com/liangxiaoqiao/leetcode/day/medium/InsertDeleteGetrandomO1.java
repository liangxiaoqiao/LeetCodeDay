package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 380
 * title: Insert Delete GetRandom O(1)
 * href: https://leetcode.com/problems/insert-delete-getrandom-o1
 * desc: Design a data structure that supports all following operations in average O(1) time.\ninsert(val): Inserts an item val to the set if not already present.\nremove(val): Removes an item val from the set if present.\ngetRandom: Returns a random element from current set of elements. Each element must have the same probability of being returned.\nExample:\n// Init an empty set.\nRandomizedSet randomSet = new RandomizedSet();\n\n// Inserts 1 to the set. Returns true as 1 was inserted successfully.\nrandomSet.insert(1);\n\n// Returns false as 2 does not exist in the set.\nrandomSet.remove(2);\n\n// Inserts 2 to the set, returns true. Set now contains [1,2].\nrandomSet.insert(2);\n\n// getRandom should return either 1 or 2 randomly.\nrandomSet.getRandom();\n\n// Removes 1 from the set, returns true. Set now contains [2].\nrandomSet.remove(1);\n\n// 2 was already in the set, so return false.\nrandomSet.insert(2);\n\n// Since 2 is the only number in the set, getRandom always return 2.\nrandomSet.getRandom();
 * <p>
 * 中文
 * 序号: 380
 * 标题： 常数时间插入、删除和获取随机元素
 * 链接： https://leetcode-cn.com/problems/insert-delete-getrandom-o1
 * 描述： 设计一个支持在平均 时间复杂度 O(1) 下，执行以下操作的数据结构。\ninsert(val)：当元素 val 不存在时，向集合中插入该项。\nremove(val)：元素 val 存在时，从集合中移除该项。\ngetRandom：随机返回现有集合中的一项。每个元素应该有相同的概率被返回。\n示例 :\n// 初始化一个空的集合。\nRandomizedSet randomSet = new RandomizedSet();\n\n// 向集合中插入 1 。返回 true 表示 1 被成功地插入。\nrandomSet.insert(1);\n\n// 返回 false ，表示集合中不存在 2 。\nrandomSet.remove(2);\n\n// 向集合中插入 2 。返回 true 。集合现在包含 [1,2] 。\nrandomSet.insert(2);\n\n// getRandom 应随机返回 1 或 2 。\nrandomSet.getRandom();\n\n// 从集合中移除 1 ，返回 true 。集合现在包含 [2] 。\nrandomSet.remove(1);\n\n// 2 已在集合中，所以返回 false 。\nrandomSet.insert(2);\n\n// 由于 2 是集合中唯一的数字，getRandom 总是返回 2 。\nrandomSet.getRandom();
 * <p>
 * acceptance: 44.8%
 * difficulty: Medium
 * private: False
 */


//TODO init
class RandomizedSet {
    /*
     * Initialize your data structure here.
     */
    public RandomizedSet() {
        
    }

    /*
     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
     */
    public boolean insert(int val) {
        return false;
    }

    /*
     * Removes a value from the set. Returns true if the set contained the specified element.
     */
    public boolean remove(int val) {
        return false;
    }

    /*
     * Get a random element from the set.
     */
    public int getRandom() {
        return 0;
    }
}

/*
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
