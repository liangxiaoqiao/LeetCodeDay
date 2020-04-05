package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 997
 * title: Find the Town Judge
 * href: https://leetcode.com/problems/find-the-town-judge
 * desc: In a town, there are N people labelled from 1 to N.  There is a rumor that one of these people is secretly the town judge.\nIf the town judge exists, then:\nThe town judge trusts nobody.\nEverybody (except for the town judge) trusts the town judge.\nThere is exactly one person that satisfies properties 1 and 2.\nYou are given trust, an array of pairs trust[i] = [a, b] representing that the person labelled a trusts the person labelled b.\nIf the town judge exists and can be identified, return the label of the town judge.  Otherwise, return -1.\n  Example 1:\nInput: N = 2, trust = [[1,2]]\nOutput: 2\nExample 2:\nInput: N = 3, trust = [[1,3],[2,3]]\nOutput: 3\nExample 3:\nInput: N = 3, trust = [[1,3],[2,3],[3,1]]\nOutput: -1\nExample 4:\nInput: N = 3, trust = [[1,2],[2,3]]\nOutput: -1\nExample 5:\nInput: N = 4, trust = [[1,3],[1,4],[2,3],[2,4],[4,3]]\nOutput: 3\n  Note:\n1 <= N <= 1000\ntrust.length <= 10000\ntrust[i] are all different\ntrust[i][0] != trust[i][1]\n1 <= trust[i][0], trust[i][1] <= N
 * <p>
 * 中文
 * 序号: 997
 * 标题： 找到小镇的法官
 * 链接： https://leetcode-cn.com/problems/find-the-town-judge
 * 描述： None
 * <p>
 * acceptance: 49.5%
 * difficulty: Easy
 * private: False
 */


//TODO init
public class FindTheTownJudge {
    public int findJudge(int N, int[][] trust) {
        return 0;
    }
}