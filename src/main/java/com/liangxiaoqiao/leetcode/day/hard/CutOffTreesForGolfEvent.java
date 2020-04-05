package com.liangxiaoqiao.leetcode.day.hard;


import java.util.List;
    

/*
 * English
 * id: 675
 * title: Cut Off Trees for Golf Event
 * href: https://leetcode.com/problems/cut-off-trees-for-golf-event
 * desc: You are asked to cut off trees in a forest for a golf event. The forest is represented as a non-negative 2D map, in this map:\n0 represents the obstacle can\'t be reached.\n1 represents the ground can be walked through.\nThe place with number bigger than 1 represents a tree can be walked through, and this positive number represents the tree\'s height.\n  You are asked to cut off all the trees in this forest in the order of tree\'s height - always cut off the tree with lowest height first. And after cutting, the original place has the tree will become a grass (value 1).\nYou will start from the point (0, 0) and you should output the minimum steps you need to walk to cut off all the trees. If you can\'t cut off all the trees, output -1 in that situation.\nYou are guaranteed that no two trees have the same height and there is at least one tree needs to be cut off.\nExample 1:\nInput: \n[\n [1,2,3],\n [0,0,4],\n [7,6,5]\n]\nOutput: 6\n  Example 2:\nInput: \n[\n [1,2,3],\n [0,0,0],\n [7,6,5]\n]\nOutput: -1\n  Example 3:\nInput: \n[\n [2,3,4],\n [0,0,5],\n [8,7,6]\n]\nOutput: 6\nExplanation: You started from the point (0,0) and you can cut off the tree in (0,0) directly without walking.\n  Hint: size of the given matrix will not exceed 50x50.
 * <p>
 * 中文
 * 序号: 675
 * 标题： 为高尔夫比赛砍树
 * 链接： https://leetcode-cn.com/problems/cut-off-trees-for-golf-event
 * 描述： 你被请来给一个要举办高尔夫比赛的树林砍树. 树林由一个非负的二维数组表示， 在这个数组中：\n0 表示障碍，无法触碰到.\n1 表示可以行走的地面.\n比1大的数 表示一颗允许走过的树的高度.\n你被要求按照树的高度从低向高砍掉所有的树，每砍过一颗树，树的高度变为1。\n你将从（0，0）点开始工作，你应该返回你砍完所有树需要走的最小步数。 如果你无法砍完所有的树，返回 -1 。\n可以保证的是，没有两棵树的高度是相同的，并且至少有一颗树需要你砍。\n示例 1:\n输入: \n[\n [1,2,3],\n [0,0,4],\n [7,6,5]\n]\n输出: 6\n  示例 2:\n输入: \n[\n [1,2,3],\n [0,0,0],\n [7,6,5]\n]\n输出: -1\n  示例 3:\n输入: \n[\n [2,3,4],\n [0,0,5],\n [8,7,6]\n]\n输出: 6\n\n解释: (0,0) 位置的树，你可以直接砍去，不用算步数\n  提示: 矩阵大小不会超过 50x50 。
 * <p>
 * acceptance: 33.2%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class CutOffTreesForGolfEvent {
    public int cutOffTree(List<List<Integer>> forest) {
        return 0;
    }
}