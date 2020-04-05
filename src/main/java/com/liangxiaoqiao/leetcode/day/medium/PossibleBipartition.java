package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 886
 * title: None
 * href: None
 * desc: None
 * <p>
 * 中文
 * 序号: 886
 * 标题： 可能的二分法
 * 链接： https://leetcode-cn.com/problems/possible-bipartition
 * 描述： 给定一组 N 人（编号为 1, 2, ..., N）， 我们想把每个人分进任意大小的两组。\n每个人都可能不喜欢其他人，那么他们不应该属于同一组。\n形式上，如果 dislikes[i] = [a, b]，表示不允许将编号为 a 和 b 的人归入同一组。\n当可以用这种方法将每个人分进两组时，返回 true；否则返回 false。\n  示例 1：\n输入：N = 4, dislikes = [[1,2],[1,3],[2,4]]\n输出：true\n解释：group1 [1,4], group2 [2,3]\n示例 2：\n输入：N = 3, dislikes = [[1,2],[1,3],[2,3]]\n输出：false\n示例 3：\n输入：N = 5, dislikes = [[1,2],[2,3],[3,4],[4,5],[1,5]]\n输出：false\n  提示：\n1 <= N <= 2000\n0 <= dislikes.length <= 10000\n1 <= dislikes[i][j] <= N\ndislikes[i][0] < dislikes[i][1]\n对于 dislikes[i] == dislikes[j] 不存在 i != j
 * <p>
 * acceptance: 34.4%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class PossibleBipartition {
    public boolean possibleBipartition(int N, int[][] dislikes) {
        return false;
    }
}