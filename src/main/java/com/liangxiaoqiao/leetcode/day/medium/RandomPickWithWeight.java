package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 528
 * title: Random Pick with Weight
 * href: https://leetcode.com/problems/random-pick-with-weight
 * desc: Given an array w of positive integers, where w[i] describes the weight of index i, write a function pickIndex which randomly picks an index in proportion to its weight.\nNote:\n1 <= w.length <= 10000\n1 <= w[i] <= 10^5\npickIndex will be called at most 10000 times.\nExample 1:\nInput: \n[\"Solution\",\"pickIndex\"]\n[[[1]],[]]\nOutput: [null,0]\nExample 2:\nInput: \n[\"Solution\",\"pickIndex\",\"pickIndex\",\"pickIndex\",\"pickIndex\",\"pickIndex\"]\n[[[1,3]],[],[],[],[],[]]\nOutput: [null,0,1,1,1,0]\nExplanation of Input Syntax:\nThe input is two lists: the subroutines called and their arguments. Solution\'s constructor has one argument, the array w. pickIndex has no arguments. Arguments are always wrapped with a list, even if there aren\'t any.
 * <p>
 * 中文
 * 序号: 528
 * 标题： 按权重随机选择
 * 链接： https://leetcode-cn.com/problems/random-pick-with-weight
 * 描述： 给定一个正整数数组 w ，其中 w[i] 代表位置 i 的权重，请写一个函数 pickIndex ，它可以随机地获取位置 i，选取位置 i 的概率与 w[i] 成正比。\n说明:\n1 <= w.length <= 10000\n1 <= w[i] <= 10^5\npickIndex 将被调用不超过 10000 次\n示例1:\n输入: \n[\"Solution\",\"pickIndex\"]\n[[[1]],[]]\n输出: [null,0]\n示例2:\n输入: \n[\"Solution\",\"pickIndex\",\"pickIndex\",\"pickIndex\",\"pickIndex\",\"pickIndex\"]\n[[[1,3]],[],[],[],[],[]]\n输出: [null,0,1,1,1,0]\n输入语法说明：\n输入是两个列表：调用成员函数名和调用的参数。Solution 的构造函数有一个参数，即数组 w。pickIndex 没有参数。输入参数是一个列表，即使参数为空，也会输入一个 [] 空列表。
 * <p>
 * acceptance: 43.3%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class RandomPickWithWeight {
    public RandomPickWithWeight(int[] w) {
    }

    public int pickIndex() {
        return 0;
    }
}

/*
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */
