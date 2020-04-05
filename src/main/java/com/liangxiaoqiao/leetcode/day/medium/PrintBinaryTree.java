package com.liangxiaoqiao.leetcode.day.medium;


import com.liangxiaoqiao.leetcode.day.pojo.TreeNode;

import java.util.List;
    
/*
 * English
 * id: 655
 * title: Print Binary Tree
 * href: https://leetcode.com/problems/print-binary-tree
 * desc: Print a binary tree in an m*n 2D string array following these rules:\nThe row number m should be equal to the height of the given binary tree.\nThe column number n should always be an odd number.\nThe root node\'s value (in string format) should be put in the exactly middle of the first row it can be put. The column and the row where the root node belongs will separate the rest space into two parts (left-bottom part and right-bottom part). You should print the left subtree in the left-bottom part and print the right subtree in the right-bottom part. The left-bottom part and the right-bottom part should have the same size. Even if one subtree is none while the other is not, you don\'t need to print anything for the none subtree but still need to leave the space as large as that for the other subtree. However, if two subtrees are none, then you don\'t need to leave space for both of them.\nEach unused space should contain an empty string \"\".\nPrint the subtrees following the same rules.\nExample 1:\nInput:\n     1\n    /\n   2\nOutput:\n[[\"\", \"1\", \"\"],\n [\"2\", \"\", \"\"]]\nExample 2:\nInput:\n     1\n    / \\\n   2   3\n    \\\n     4\nOutput:\n[[\"\", \"\", \"\", \"1\", \"\", \"\", \"\"],\n [\"\", \"2\", \"\", \"\", \"\", \"3\", \"\"],\n [\"\", \"\", \"4\", \"\", \"\", \"\", \"\"]]\nExample 3:\nInput:\n      1\n     / \\\n    2   5\n   / \n  3 \n / \n4 \nOutput:\n\n[[\"\",  \"\",  \"\", \"\",  \"\", \"\", \"\", \"1\", \"\",  \"\",  \"\",  \"\",  \"\", \"\", \"\"]\n [\"\",  \"\",  \"\", \"2\", \"\", \"\", \"\", \"\",  \"\",  \"\",  \"\",  \"5\", \"\", \"\", \"\"]\n [\"\",  \"3\", \"\", \"\",  \"\", \"\", \"\", \"\",  \"\",  \"\",  \"\",  \"\",  \"\", \"\", \"\"]\n [\"4\", \"\",  \"\", \"\",  \"\", \"\", \"\", \"\",  \"\",  \"\",  \"\",  \"\",  \"\", \"\", \"\"]]\nNote: The height of binary tree is in the range of [1, 10].
 * <p>
 * 中文
 * 序号: 655
 * 标题： 输出二叉树
 * 链接： https://leetcode-cn.com/problems/print-binary-tree
 * 描述： 在一个 m*n 的二维字符串数组中输出二叉树，并遵守以下规则：\n行数 m 应当等于给定二叉树的高度。\n列数 n 应当总是奇数。\n根节点的值（以字符串格式给出）应当放在可放置的第一行正中间。根节点所在的行与列会将剩余空间划分为两部分（左下部分和右下部分）。你应该将左子树输出在左下部分，右子树输出在右下部分。左下和右下部分应当有相同的大小。即使一个子树为空而另一个非空，你不需要为空的子树输出任何东西，但仍需要为另一个子树留出足够的空间。然而，如果两个子树都为空则不需要为它们留出任何空间。\n每个未使用的空间应包含一个空的字符串\"\"。\n使用相同的规则输出子树。\n示例 1:\n输入:\n     1\n    /\n   2\n输出:\n[[\"\", \"1\", \"\"],\n [\"2\", \"\", \"\"]]\n示例 2:\n输入:\n     1\n    / \\\n   2   3\n    \\\n     4\n输出:\n[[\"\", \"\", \"\", \"1\", \"\", \"\", \"\"],\n [\"\", \"2\", \"\", \"\", \"\", \"3\", \"\"],\n [\"\", \"\", \"4\", \"\", \"\", \"\", \"\"]]\n示例 3:\n输入:\n      1\n     / \\\n    2   5\n   / \n  3 \n / \n4 \n输出:\n[[\"\",  \"\",  \"\", \"\",  \"\", \"\", \"\", \"1\", \"\",  \"\",  \"\",  \"\",  \"\", \"\", \"\"]\n [\"\",  \"\",  \"\", \"2\", \"\", \"\", \"\", \"\",  \"\",  \"\",  \"\",  \"5\", \"\", \"\", \"\"]\n [\"\",  \"3\", \"\", \"\",  \"\", \"\", \"\", \"\",  \"\",  \"\",  \"\",  \"\",  \"\", \"\", \"\"]\n [\"4\", \"\",  \"\", \"\",  \"\", \"\", \"\", \"\",  \"\",  \"\",  \"\",  \"\",  \"\", \"\", \"\"]]\n注意: 二叉树的高度在范围 [1, 10] 中。
 * <p>
 * acceptance: 53.2%
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
public class PrintBinaryTree {
    public List<List<String>> printTree(TreeNode root) {
        return null;
    }
}

