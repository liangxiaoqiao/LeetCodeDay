package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 769
 * title: Max Chunks To Make Sorted
 * href: https://leetcode.com/problems/max-chunks-to-make-sorted
 * desc: This question is the same as \"Max Chunks to Make Sorted\" except the integers of the given array are not necessarily distinct, the input array could be up to length 2000, and the elements could be up to 10**8.\nGiven an array arr of integers (not necessarily distinct), we split the array into some number of \"chunks\" (partitions), and individually sort each chunk.  After concatenating them, the result equals the sorted array.\nWhat is the most number of chunks we could have made?\nExample 1:\nInput: arr = [5,4,3,2,1]\nOutput: 1\nExplanation:\nSplitting into two or more chunks will not return the required result.\nFor example, splitting into [5, 4], [3, 2, 1] will result in [4, 5, 1, 2, 3], which isn\'t sorted.\nExample 2:\nInput: arr = [2,1,3,4,4]\nOutput: 4\nExplanation:\nWe can split into two chunks, such as [2, 1], [3, 4, 4].\nHowever, splitting into [2, 1], [3], [4], [4] is the highest number of chunks possible.\nNote:\narr will have length in range [1, 2000].\narr[i] will be an integer in range [0, 10**8].\n
 * <p>
 * 中文
 * 序号: 769
 * 标题： 最多能完成排序的块
 * 链接： https://leetcode-cn.com/problems/max-chunks-to-make-sorted
 * 描述： 这个问题和“最多能完成排序的块”相似，但给定数组中的元素可以重复，输入数组最大长度为2000，其中的元素最大为10**8。\narr是一个可能包含重复元素的整数数组，我们将这个数组分割成几个“块”，并将这些块分别进行排序。之后再连接起来，使得连接的结果和按升序排序后的原数组相同。\n我们最多能将数组分成多少块？\n示例 1:\n输入: arr = [5,4,3,2,1]\n输出: 1\n解释:\n将数组分成2块或者更多块，都无法得到所需的结果。\n例如，分成 [5, 4], [3, 2, 1] 的结果是 [4, 5, 1, 2, 3]，这不是有序的数组。 \n示例 2:\n输入: arr = [2,1,3,4,4]\n输出: 4\n解释:\n我们可以把它分成两块，例如 [2, 1], [3, 4, 4]。\n然而，分成 [2, 1], [3], [4], [4] 可以得到最多的块数。 \n注意:\narr的长度在[1, 2000]之间。\narr[i]的大小在[0, 10**8]之间。
 * <p>
 * acceptance: 53.4%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class MaxChunksToMakeSorted {
    public int maxChunksToSorted(int[] arr) {
        return 0;
    }
}