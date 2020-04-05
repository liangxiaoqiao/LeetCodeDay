package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 331
 * title: Verify Preorder Serialization of a Binary Tree
 * href: https://leetcode.com/problems/verify-preorder-serialization-of-a-binary-tree
 * desc: One way to serialize a binary tree is to use pre-order traversal. When we encounter a non-null node, we record the node\'s value. If it is a null node, we record using a sentinel value such as #.\n     _9_\n    /   \\\n   3     2\n  / \\   / \\\n 4   1  #  6\n/ \\ / \\   / \\\n# # # #   # #\nFor example, the above binary tree can be serialized to the string \"9,3,4,#,#,1,#,#,2,#,6,#,#\", where # represents a null node.\nGiven a string of comma separated values, verify whether it is a correct preorder traversal serialization of a binary tree. Find an algorithm without reconstructing the tree.\nEach comma separated value in the string must be either an integer or a character \'#\' representing null pointer.\nYou may assume that the input format is always valid, for example it could never contain two consecutive commas such as \"1,,3\".\nExample 1:\nInput: \"9,3,4,#,#,1,#,#,2,#,6,#,#\"\nOutput: true\nExample 2:\nInput: \"1,#\"\nOutput: false\nExample 3:\nInput: \"9,#,#,1\"\nOutput: false
 * <p>
 * 中文
 * 序号: 331
 * 标题： 验证二叉树的前序序列化
 * 链接： https://leetcode-cn.com/problems/verify-preorder-serialization-of-a-binary-tree
 * 描述： 序列化二叉树的一种方法是使用前序遍历。当我们遇到一个非空节点时，我们可以记录下这个节点的值。如果它是一个空节点，我们可以使用一个标记值记录，例如 #。\n     _9_\n    /   \\\n   3     2\n  / \\   / \\\n 4   1  #  6\n/ \\ / \\   / \\\n# # # #   # #\n例如，上面的二叉树可以被序列化为字符串 \"9,3,4,#,#,1,#,#,2,#,6,#,#\"，其中 # 代表一个空节点。\n给定一串以逗号分隔的序列，验证它是否是正确的二叉树的前序序列化。编写一个在不重构树的条件下的可行算法。\n每个以逗号分隔的字符或为一个整数或为一个表示 null 指针的 \'#\' 。\n你可以认为输入格式总是有效的，例如它永远不会包含两个连续的逗号，比如 \"1,,3\" 。\n示例 1:\n输入: \"9,3,4,#,#,1,#,#,2,#,6,#,#\"\n输出: true\n示例 2:\n输入: \"1,#\"\n输出: false\n示例 3:\n输入: \"9,#,#,1\"\n输出: false
 * <p>
 * acceptance: 39.5%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class VerifyPreorderSerializationOfABinaryTree {
    public boolean isValidSerialization(String preorder) {
        return false;
    }
}