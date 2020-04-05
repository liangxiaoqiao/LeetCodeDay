package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 553
 * title: Optimal Division
 * href: https://leetcode.com/problems/optimal-division
 * desc: Given a list of positive integers, the adjacent integers will perform the float division. For example, [2,3,4] -> 2 / 3 / 4.\nHowever, you can add any number of parenthesis at any position to change the priority of operations. You should find out how to add parenthesis to get the maximum result, and return the corresponding expression in string format. Your expression should NOT contain redundant parenthesis.\nExample:\nInput: [1000,100,10,2]\nOutput: \"1000/(100/10/2)\"\nExplanation:\n1000/(100/10/2) = 1000/((100/10)/2) = 200\nHowever, the bold parenthesis in \"1000/((100/10)/2)\" are redundant, \nsince they don\'t influence the operation priority. So you should return \"1000/(100/10/2)\". \n\nOther cases:\n1000/(100/10)/2 = 50\n1000/(100/(10/2)) = 50\n1000/100/10/2 = 0.5\n1000/100/(10/2) = 2\nNote:\nThe length of the input array is [1, 10].\nElements in the given array will be in range [2, 1000].\nThere is only one optimal division for each test case.
 * <p>
 * 中文
 * 序号: 553
 * 标题： 最优除法
 * 链接： https://leetcode-cn.com/problems/optimal-division
 * 描述： 给定一组正整数，相邻的整数之间将会进行浮点除法操作。例如， [2,3,4] -> 2 / 3 / 4 。\n但是，你可以在任意位置添加任意数目的括号，来改变算数的优先级。你需要找出怎么添加括号，才能得到最大的结果，并且返回相应的字符串格式的表达式。你的表达式不应该含有冗余的括号。\n示例：\n输入: [1000,100,10,2]\n输出: \"1000/(100/10/2)\"\n解释:\n1000/(100/10/2) = 1000/((100/10)/2) = 200\n但是，以下加粗的括号 \"1000/((100/10)/2)\" 是冗余的，\n因为他们并不影响操作的优先级，所以你需要返回 \"1000/(100/10/2)\"。\n\n其他用例:\n1000/(100/10)/2 = 50\n1000/(100/(10/2)) = 50\n1000/100/10/2 = 0.5\n1000/100/(10/2) = 2\n说明:\n输入数组的长度在 [1, 10] 之间。\n数组中每个元素的大小都在 [2, 1000] 之间。\n每个测试用例只有一个最优除法解。
 * <p>
 * acceptance: 56.0%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class OptimalDivision {
    public String optimalDivision(int[] nums) {
        return null;
    }
}