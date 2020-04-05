package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 1042
 * title: Flower Planting With No Adjacent
 * href: https://leetcode.com/problems/flower-planting-with-no-adjacent
 * desc: You have N gardens, labelled 1 to N.  In each garden, you want to plant one of 4 types of flowers.
 * paths[i] = [x, y] describes the existence of a bidirectional path from garden x to garden y.
 * Also, there is no garden that has more than 3 paths coming into or leaving it.
 * Your task is to choose a flower type for each garden such that, for any two gardens connected by a path, they have different types of flowers.
 * Return any such a choice as an array answer, where answer[i] is the type of flower planted in the (i+1)-th garden.  The flower types are denoted 1, 2, 3, or 4.  It is guaranteed an answer exists.
 * Example 1:
 * Input: N = 3, paths = [[1,2],[2,3],[3,1]]
 * Output: [1,2,3]
 * Example 2:
 * Input: N = 4, paths = [[1,2],[3,4]]
 * Output: [1,2,1,2]
 * Example 3:
 * Input: N = 4, paths = [[1,2],[2,3],[3,4],[4,1],[1,3],[2,4]]
 * Output: [1,2,3,4]
 * Note:
 * 1 <= N <= 10000
 * 0 <= paths.size <= 20000
 * No garden has 4 or more paths coming into or leaving it.
 * It is guaranteed an answer exists.
 * <p>
 * 中文
 * 序号: 1042
 * 标题： 不邻接植花
 * 链接： https://leetcode-cn.com/problems/flower-planting-with-no-adjacent
 * 描述： 有 N 个花园，按从 1 到 N 标记。在每个花园中，你打算种下四种花之一。
 * paths[i] = [x, y] 描述了花园 x 到花园 y 的双向路径。
 * 另外，没有花园有 3 条以上的路径可以进入或者离开。
 * 你需要为每个花园选择一种花，使得通过路径相连的任何两个花园中的花的种类互不相同。
 * 以数组形式返回选择的方案作为答案 answer，其中 answer[i] 为在第 (i+1) 个花园中种植的花的种类。花的种类用  1, 2, 3, 4 表示。保证存在答案。
 * 示例 1：
 * 输入：N = 3, paths = [[1,2],[2,3],[3,1]]
 * 输出：[1,2,3]
 * 示例 2：
 * 输入：N = 4, paths = [[1,2],[3,4]]
 * 输出：[1,2,1,2]
 * 示例 3：
 * 输入：N = 4, paths = [[1,2],[2,3],[3,4],[4,1],[1,3],[2,4]]
 * 输出：[1,2,3,4]
 * 提示：
 * 1 <= N <= 10000
 * 0 <= paths.size <= 20000
 * 不存在花园有 4 条或者更多路径可以进入或离开。
 * 保证存在答案。
 * <p>
 * acceptance: 47.9%
 * difficulty: Easy
 * private: False
 * <p>
 * <p>
 * Note: The returned array must be malloced, assume caller calls free().
 * <p>
 * Note: The returned array must be malloced, assume caller calls free().
 */


//TODO init

/*
 * Note: The returned array must be malloced, assume caller calls free().
 */
public class FlowerPlantingWithNoAdjacent {

    public int[] gardenNoAdj(int N, int[][] paths) {
        return null;
    }
}