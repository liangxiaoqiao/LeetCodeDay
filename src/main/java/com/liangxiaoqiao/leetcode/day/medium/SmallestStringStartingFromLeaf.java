package com.liangxiaoqiao.leetcode.day.medium;


import com.liangxiaoqiao.leetcode.day.pojo.TreeNode;
    

/*
 * English
 * id: 988
 * title: Smallest String Starting From Leaf
 * href: https://leetcode.com/problems/smallest-string-starting-from-leaf
 * desc: Given the root of a binary tree, each node has a value from 0 to 25 representing the letters \'a\' to \'z\': a value of 0 represents \'a\', a value of 1 represents \'b\', and so on.\nFind the lexicographically smallest string that starts at a leaf of this tree and ends at the root.\n(As a reminder, any shorter prefix of a string is lexicographically smaller: for example, \"ab\" is lexicographically smaller than \"aba\".  A leaf of a node is a node that has no children.)\n  Example 1:\nInput: [0,1,2,3,4,3,4]\nOutput: \"dba\"\nExample 2:\nInput: [25,1,3,1,3,0,2]\nOutput: \"adz\"\nExample 3:\nInput: [2,2,1,null,1,0,null,0]\nOutput: \"abc\"\n  Note:\nThe number of nodes in the given tree will be between 1 and 8500.\nEach node in the tree will have a value between 0 and 25.
 * <p>
 * 中文
 * 序号: 988
 * 标题： 从叶结点开始的最小字符串
 * 链接： https://leetcode-cn.com/problems/smallest-string-starting-from-leaf
 * 描述： 给定一颗根结点为 root 的二叉树，书中的每个结点都有一个从 0 到 25 的值，分别代表字母 'a' 到 'z'：值 0 代表 'a'，值 1 代表 'b'，依此类推。
 * 找出按字典序最小的字符串，该字符串从这棵树的一个叶结点开始，到根结点结束。
 * （小贴士：字符串中任何较短的前缀在字典序上都是较小的：例如，在字典序上 "ab" 比 "aba" 要小。叶结点是指没有子结点的结点。）
 * 示例 1：
 * 输入：[0,1,2,3,4,3,4]
 * 输出："dba"
 * 示例 2：
 * 输入：[25,1,3,1,3,0,2]
 * 输出："adz"
 * 示例 3：
 * 输入：[2,2,1,null,1,0,null,0]
 * 输出："abc"
 * 提示：
 * 给定树的结点数介于 1 和 8500 之间。
 * 树中的每个结点都有一个介于 0 和 25 之间的值。
 * <p>
 * acceptance: 44.9%
 * difficulty: Medium
 * private: False
 */


//TODO init

/*
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SmallestStringStartingFromLeaf {
    public String smallestFromLeaf(TreeNode root) {
        return null;
    }
}