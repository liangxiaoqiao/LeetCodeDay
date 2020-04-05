package com.liangxiaoqiao.leetcode.day.easy;

    
    import com.liangxiaoqiao.leetcode.day.pojo.TreeNode;
        

/*
 * English
 * id: 606
 * title: Construct String from Binary Tree
 * href: https://leetcode.com/problems/construct-string-from-binary-tree
 * desc: You need to construct a string consists of parenthesis and integers from a binary tree with the preorder traversing way.
 * The null node needs to be represented by empty parenthesis pair "()". And you need to omit all the empty parenthesis pairs that don't affect the one-to-one mapping relationship between the string and the original binary tree.
 * Example 1:
 * Input: Binary tree: [1,2,3,4]
 * 1
 * /   \
 * 2     3
 * /
 * 4
 * <p>
 * Output: "1(2(4))(3)"
 * Explanation: Originallay it needs to be "1(2(4)())(3()())",
 * but you need to omit all the unnecessary empty parenthesis pairs.
 * And it will be "1(2(4))(3)".
 * Example 2:
 * Input: Binary tree: [1,2,3,null,4]
 * 1
 * /   \
 * 2     3
 * \
 * 4
 * <p>
 * Output: "1(2()(4))(3)"
 * Explanation: Almost the same as the first example,
 * except we can't omit the first parenthesis pair to break the one-to-one mapping relationship between the input and the output.
 * <p>
 * 中文
 * 序号: 606
 * 标题： 根据二叉树创建字符串
 * 链接： https://leetcode-cn.com/problems/construct-string-from-binary-tree
 * 描述： 你需要采用前序遍历的方式，将一个二叉树转换成一个由括号和整数组成的字符串。\n空节点则用一对空括号 \"()\" 表示。而且你需要省略所有不影响字符串与原始二叉树之间的一对一映射关系的空括号对。\n示例 1:\n输入: 二叉树: [1,2,3,4]\n       1\n     /   \\\n    2     3\n   /    \n  4     \n\n输出: \"1(2(4))(3)\"\n\n解释: 原本将是“1(2(4)())(3())”，\n在你省略所有不必要的空括号对之后，\n它将是“1(2(4))(3)”。\n示例 2:\n输入: 二叉树: [1,2,3,null,4]\n       1\n     /   \\\n    2     3\n     \\  \n      4 \n\n输出: \"1(2()(4))(3)\"\n\n解释: 和第一个示例相似，\n除了我们不能省略第一个对括号来中断输入和输出之间的一对一映射关系。
 * <p>
 * acceptance: 52.7%
 * difficulty: Easy
 * private: False
 */


//TODO init

/*
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class ConstructStringFromBinaryTree {
    public String tree2str(TreeNode t) {
        return null;
    }


}