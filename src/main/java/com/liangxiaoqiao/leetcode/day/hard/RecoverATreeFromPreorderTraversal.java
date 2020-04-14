package com.liangxiaoqiao.leetcode.day.hard;

import com.liangxiaoqiao.leetcode.day.pojo.TreeNode;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
 * English
 * id: 1028
 * title: Recover a Tree From Preorder Traversal
 * href: https://leetcode.com/problems/recover-a-tree-from-preorder-traversal
 * desc: We run a preorder depth first search on the root of a binary tree.
 * At each node in this traversal, we output D dashes (where D is the depth of this node), then we output the value of this node.  (If the depth of a node is D, the depth of its immediate child is D+1.  The depth of the root node is 0.)
 * If a node has only one child, that child is guaranteed to be the left child.
 * Given the output S of this traversal, recover the tree and return its root.
 * Example 1:
 * Input: "1-2--3--4-5--6--7"
 * Output: [1,2,5,3,4,6,7]
 * Example 2:
 * Input: "1-2--3---4-5--6---7"
 * Output: [1,2,5,3,null,6,null,4,null,7]
 * Example 3:
 * Input: "1-401--349---90--88"
 * Output: [1,401,null,349,88,90]
 * Note:
 * The number of nodes in the original tree is between 1 and 1000.
 * Each node will have a value between 1 and 10^9.
 * <p>
 * 中文
 * 序号: 1028
 * 标题： 从先序遍历还原二叉树
 * 链接： https://leetcode-cn.com/problems/recover-a-tree-from-preorder-traversal
 * 描述： 我们从二叉树的根节点 root 开始进行深度优先搜索。
 * 在遍历中的每个节点处，我们输出 D 条短划线（其中 D 是该节点的深度），然后输出该节点的值。（如果节点的深度为 D，则其直接子节点的深度为 D + 1。根节点的深度为 0）。
 * 如果节点只有一个子节点，那么保证该子节点为左子节点。
 * 给出遍历输出 S，还原树并返回其根节点 root。
 * 示例 1：
 * 输入："1-2--3--4-5--6--7"
 * 输出：[1,2,5,3,4,6,7]
 * 示例 2：
 * 输入："1-2--3---4-5--6---7"
 * 输出：[1,2,5,3,null,6,null,4,null,7]
 * 示例 3：
 * 输入："1-401--349---90--88"
 * 输出：[1,401,null,349,88,90]
 * 提示：
 * 原始树中的节点数介于 1 和 1000 之间。
 * 每个节点的值介于 1 和 10 ^ 9 之间。
 * <p>
 * acceptance: 69.5%
 * difficulty: Hard
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
public class RecoverATreeFromPreorderTraversal {
    public TreeNode recoverFromPreorder(String S) {
        TreeNode root = new TreeNode(Integer.parseInt(String.valueOf(S.charAt(0))));
        Map<Integer, List<Integer>> leftMap = new LinkedHashMap<>();
        Map<Integer, List<Integer>> rightMap = new LinkedHashMap<>();
        int count = 0;
        for (int i = 1; i < S.length(); i++) {
            String temp = String.valueOf(S.charAt(i));
            if ("-".equals(temp)) {
                count++;
            } else {
                if (i == 1 || count != 1) {
                    if (leftMap.containsKey(count)) {
                        leftMap.get(count).add(Integer.parseInt(temp));
                    } else {
                        leftMap.put(count, new ArrayList<>());
                    }
                } else {
                    if (rightMap.containsKey(count)) {
                        rightMap.get(count).add(Integer.parseInt(temp));
                    } else {
                        rightMap.put(count, new ArrayList<>());
                    }
                }
            }
        }


        return null;
    }
}

