package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 398
 * title: Random Pick Index
 * href: https://leetcode.com/problems/random-pick-index
 * desc: Given an array of integers with possible duplicates, randomly output the index of a given target number. You can assume that the given target number must exist in the array.\nNote:\nThe array size can be very large. Solution that uses too much extra space will not pass the judge.\nExample:\nint[] nums = new int[] {1,2,3,3,3};\nSolution solution = new Solution(nums);\n\n// pick(3) should return either index 2, 3, or 4 randomly. Each index should have equal probability of returning.\nsolution.pick(3);\n\n// pick(1) should return 0. Since in the array only nums[0] is equal to 1.\nsolution.pick(1);
 * <p>
 * 中文
 * 序号: 398
 * 标题： 随机数索引
 * 链接： https://leetcode-cn.com/problems/random-pick-index
 * 描述： 给定一个可能含有重复元素的整数数组，要求随机输出给定的数字的索引。 您可以假设给定的数字一定存在于数组中。\n注意：\n数组大小可能非常大。 使用太多额外空间的解决方案将不会通过测试。\n示例:\nint[] nums = new int[] {1,2,3,3,3};\nSolution solution = new Solution(nums);\n\n// pick(3) 应该返回索引 2,3 或者 4。每个索引的返回概率应该相等。\nsolution.pick(3);\n\n// pick(1) 应该返回 0。因为只有nums[0]等于1。\nsolution.pick(1);
 * <p>
 * acceptance: 52.4%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class RandomPickIndex {
    public RandomPickIndex(int[] nums) {

    }

    public int pick(int target) {
        return 0;
    }
}

/*
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */
