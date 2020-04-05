package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 26
 * title: Remove Duplicates from Sorted Array
 * href: https://leetcode.com/problems/remove-duplicates-from-sorted-array
 * desc: Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.\nDo not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.\nExample 1:\nGiven nums = [1,1,2],\n\nYour function should return length = 2, with the first two elements of nums being 1 and 2 respectively.\n\nIt doesn\'t matter what you leave beyond the returned length.\nExample 2:\nGiven nums = [0,0,1,1,1,2,2,3,3,4],\n\nYour function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.\n\nIt doesn\'t matter what values are set beyond the returned length.\nClarification:\nConfused why the returned value is an integer but your answer is an array?\nNote that the input array is passed in by reference, which means modification to the input array will be known to the caller as well.\nInternally you can think of this:\n// nums is passed in by reference. (i.e., without making a copy)\nint len = removeDuplicates(nums);\n\n// any modification to nums in your function would be known by the caller.\n// using the length returned by your function, it prints the first len elements.\nfor (int i = 0; i < len; i++) {\n    print(nums[i]);\n}
 * <p>
 * 中文
 * 序号: 26
 * 标题： 删除排序数组中的重复项
 * 链接： https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
 * 描述： 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。\n不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。\n示例 1:\n给定数组 nums = [1,1,2], \n\n函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。 \n\n你不需要考虑数组中超出新长度后面的元素。\n示例 2:\n给定 nums = [0,0,1,1,1,2,2,3,3,4],\n\n函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。\n\n你不需要考虑数组中超出新长度后面的元素。\n说明:\n为什么返回数值是整数，但输出的答案是数组呢?\n请注意，输入数组是以“引用”方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。\n你可以想象内部操作如下:\n// nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝\nint len = removeDuplicates(nums);\n\n// 在函数里修改输入数组对于调用者是可见的。\n// 根据你的函数返回的长度, 它会打印出数组中该长度范围内的所有元素。\nfor (int i = 0; i < len; i++) {\n    print(nums[i]);\n}
 * <p>
 * acceptance: 42.9%
 * difficulty: Easy
 * private: False
 */


//TODO init
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        return 0;
    }
}