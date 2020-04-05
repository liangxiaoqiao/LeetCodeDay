package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 879
 * title: Profitable Schemes
 * href: https://leetcode.com/problems/profitable-schemes
 * desc: There are G people in a gang, and a list of various crimes they could commit.\nThe i-th crime generates a profit[i] and requires group[i] gang members to participate.\nIf a gang member participates in one crime, that member can\'t participate in another crime.\nLet\'s call a profitable scheme any subset of these crimes that generates at least P profit, and the total number of gang members participating in that subset of crimes is at most G.\nHow many schemes can be chosen?  Since the answer may be very large, return it modulo 10^9 + 7.\n  Example 1:\nInput: G = 5, P = 3, group = [2,2], profit = [2,3]\nOutput: 2\nExplanation: \nTo make a profit of at least 3, the gang could either commit crimes 0 and 1, or just crime 1.\nIn total, there are 2 schemes.\nExample 2:\nInput: G = 10, P = 5, group = [2,3,5], profit = [6,7,8]\nOutput: 7\nExplanation: \nTo make a profit of at least 5, the gang could commit any crimes, as long as they commit one.\nThere are 7 possible schemes: (0), (1), (2), (0,1), (0,2), (1,2), and (0,1,2).\n  Note:\n1 <= G <= 100\n0 <= P <= 100\n1 <= group[i] <= 100\n0 <= profit[i] <= 100\n1 <= group.length = profit.length <= 100\n
 * <p>
 * 中文
 * 序号: 879
 * 标题： 盈利计划
 * 链接： https://leetcode-cn.com/problems/profitable-schemes
 * 描述： 帮派里有 G 名成员，他们可能犯下各种各样的罪行。\n第 i 种犯罪会产生 profit[i] 的利润，它要求 group[i] 名成员共同参与。\n让我们把这些犯罪的任何子集称为盈利计划，该计划至少产生 P 的利润。\n有多少种方案可以选择？因为答案很大，所以返回它模 10^9 + 7 的值。\n  示例 1：\n输入：G = 5, P = 3, group = [2,2], profit = [2,3]\n输出：2\n解释： \n至少产生 3 的利润，该帮派可以犯下罪 0 和罪 1 ，或仅犯下罪 1 。\n总的来说，有两种方案。\n示例 2:\n输入：G = 10, P = 5, group = [2,3,5], profit = [6,7,8]\n输出：7\n解释：\n至少产生 5 的利润，只要他们犯其中一种罪就行，所以该帮派可以犯下任何罪行 。\n有 7 种可能的计划：(0)，(1)，(2)，(0,1)，(0,2)，(1,2)，以及 (0,1,2) 。\n  提示：\n1 <= G <= 100\n0 <= P <= 100\n1 <= group[i] <= 100\n0 <= profit[i] <= 100\n1 <= group.length = profit.length <= 100\n
 * <p>
 * acceptance: 38.0%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class ProfitableSchemes {
    public int profitableSchemes(int G, int P, int[] group, int[] profit) {
        return 0;
    }
}