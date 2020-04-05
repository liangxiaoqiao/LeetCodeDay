package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 851
 * title: Loud and Rich
 * href: https://leetcode.com/problems/loud-and-rich
 * desc: In a group of N people (labelled 0, 1, 2, ..., N-1), each person has different amounts of money, and different levels of quietness.\nFor convenience, we\'ll call the person with label x, simply \"person x\".\nWe\'ll say that richer[i] = [x, y] if person x definitely has more money than person y.  Note that richer may only be a subset of valid observations.\nAlso, we\'ll say quiet[x] = q if person x has quietness q.\nNow, return answer, where answer[x] = y if y is the least quiet person (that is, the person y with the smallest value of quiet[y]), among all people who definitely have equal to or more money than person x.\n  Example 1:\nInput: richer = [[1,0],[2,1],[3,1],[3,7],[4,3],[5,3],[6,3]], quiet = [3,2,5,4,6,1,7,0]\nOutput: [5,5,2,5,4,5,6,7]\nExplanation: \nanswer[0] = 5.\nPerson 5 has more money than 3, which has more money than 1, which has more money than 0.\nThe only person who is quieter (has lower quiet[x]) is person 7, but\nit isn\'t clear if they have more money than person 0.\n\nanswer[7] = 7.\nAmong all people that definitely have equal to or more money than person 7\n(which could be persons 3, 4, 5, 6, or 7), the person who is the quietest (has lower quiet[x])\nis person 7.\n\nThe other answers can be filled out with similar reasoning.\nNote:\n1 <= quiet.length = N <= 500\n0 <= quiet[i] < N, all quiet[i] are different.\n0 <= richer.length <= N * (N-1) / 2\n0 <= richer[i][j] < N\nricher[i][0] != richer[i][1]\nricher[i]\'s are all different.\nThe observations in richer are all logically consistent.
 * <p>
 * 中文
 * 序号: 851
 * 标题： 喧闹和富有
 * 链接： https://leetcode-cn.com/problems/loud-and-rich
 * 描述： 在一组 N 个人（编号为 0, 1, 2, ..., N-1）中，每个人都有不同数目的钱，以及不同程度的安静（quietness）。\n为了方便起见，我们将编号为 x 的人简称为 \"person x \"。\n如果能够肯定 person x 比 person y 更有钱的话，我们会说 richer[i] = [x, y] 。注意 richer 可能只是有效观察的一个子集。\n另外，如果 person x 的安静程度为 q ，我们会说 quiet[x] = q 。\n现在，返回答案 answer ，其中 answer[x] = y 的前提是，在所有拥有的钱不少于 person x 的人中，person y 是最安静的人（也就是安静值 quiet[y] 最小的人）。\n示例：\n输入：richer = [[1,0],[2,1],[3,1],[3,7],[4,3],[5,3],[6,3]], quiet = [3,2,5,4,6,1,7,0]\n输出：[5,5,2,5,4,5,6,7]\n解释： \nanswer[0] = 5，\nperson 5 比 person 3 有更多的钱，person 3 比 person 1 有更多的钱，person 1 比 person 0 有更多的钱。\n唯一较为安静（有较低的安静值 quiet[x]）的人是 person 7，\n但是目前还不清楚他是否比 person 0 更有钱。\n\nanswer[7] = 7，\n在所有拥有的钱肯定不少于 person 7 的人中(这可能包括 person 3，4，5，6 以及 7)，\n最安静(有较低安静值 quiet[x])的人是 person 7。\n\n其他的答案也可以用类似的推理来解释。\n提示：\n1 <= quiet.length = N <= 500\n0 <= quiet[i] < N，所有 quiet[i] 都不相同。\n0 <= richer.length <= N * (N-1) / 2\n0 <= richer[i][j] < N\nricher[i][0] != richer[i][1]\nricher[i] 都是不同的。\n对 richer 的观察在逻辑上是一致的。
 * <p>
 * acceptance: 49.8%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class LoudAndRich {
    public int[] loudAndRich(int[][] richer, int[] quiet) {
        return null;
    }
}