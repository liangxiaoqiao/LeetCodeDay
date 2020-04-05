package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 403
 * title: Frog Jump
 * href: https://leetcode.com/problems/frog-jump
 * desc: A frog is crossing a river. The river is divided into x units and at each unit there may or may not exist a stone. The frog can jump on a stone, but it must not jump into the water.\nGiven a list of stones\' positions (in units) in sorted ascending order, determine if the frog is able to cross the river by landing on the last stone. Initially, the frog is on the first stone and assume the first jump must be 1 unit.\nIf the frog\'s last jump was k units, then its next jump must be either k - 1, k, or k + 1 units. Note that the frog can only jump in the forward direction.\nNote:\nThe number of stones is ≥ 2 and is < 1,100.\nEach stone\'s position will be a non-negative integer < 231.\nThe first stone\'s position is always 0.\nExample 1:\n[0,1,3,5,6,8,12,17]\n\nThere are a total of 8 stones.\nThe first stone at the 0th unit, second stone at the 1st unit,\nthird stone at the 3rd unit, and so on...\nThe last stone at the 17th unit.\n\nReturn true. The frog can jump to the last stone by jumping \n1 unit to the 2nd stone, then 2 units to the 3rd stone, then \n2 units to the 4th stone, then 3 units to the 6th stone, \n4 units to the 7th stone, and 5 units to the 8th stone.\nExample 2:\n[0,1,2,3,4,8,9,11]\n\nReturn false. There is no way to jump to the last stone as \nthe gap between the 5th and 6th stone is too large.
 * <p>
 * 中文
 * 序号: 403
 * 标题： 青蛙过河
 * 链接： https://leetcode-cn.com/problems/frog-jump
 * 描述： 一只青蛙想要过河。 假定河流被等分为 x 个单元格，并且在每一个单元格内都有可能放有一石子（也有可能没有）。 青蛙可以跳上石头，但是不可以跳入水中。\n给定石子的位置列表（用单元格序号升序表示）， 请判定青蛙能否成功过河（即能否在最后一步跳至最后一个石子上）。 开始时， 青蛙默认已站在第一个石子上，并可以假定它第一步只能跳跃一个单位（即只能从单元格1跳至单元格2）。\n如果青蛙上一步跳跃了 k 个单位，那么它接下来的跳跃距离只能选择为 k - 1、k 或 k + 1个单位。 另请注意，青蛙只能向前方（终点的方向）跳跃。\n请注意：\n石子的数量 ≥ 2 且 < 1100；\n每一个石子的位置序号都是一个非负整数，且其 < 231；\n第一个石子的位置永远是0。\n示例 1:\n[0,1,3,5,6,8,12,17]\n\n总共有8个石子。\n第一个石子处于序号为0的单元格的位置, 第二个石子处于序号为1的单元格的位置,\n第三个石子在序号为3的单元格的位置， 以此定义整个数组...\n最后一个石子处于序号为17的单元格的位置。\n\n返回 true。即青蛙可以成功过河，按照如下方案跳跃： \n跳1个单位到第2块石子, 然后跳2个单位到第3块石子, 接着 \n跳2个单位到第4块石子, 然后跳3个单位到第6块石子, \n跳4个单位到第7块石子, 最后，跳5个单位到第8个石子（即最后一块石子）。\n示例 2:\n[0,1,2,3,4,8,9,11]\n\n返回 false。青蛙没有办法过河。 \n这是因为第5和第6个石子之间的间距太大，没有可选的方案供青蛙跳跃过去。
 * <p>
 * acceptance: 37.8%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class FrogJump {
    public boolean canCross(int[] stones) {
        return false;
    }
}