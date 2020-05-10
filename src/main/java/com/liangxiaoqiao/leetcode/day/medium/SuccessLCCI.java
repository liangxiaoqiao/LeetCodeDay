package com.liangxiaoqiao.leetcode.day.medium;

import com.liangxiaoqiao.leetcode.day.pojo.TreeNode;

/*
 * 序号: 面试题04.06
 * 标题： 后继者
 * 链接： https://leetcode-cn.com/problems/successor-lcci/
设计一个算法，找出二叉搜索树中指定节点的“下一个”节点（也即中序后继）。

如果指定节点没有对应的“下一个”节点，则返回null。

示例 1:

输入: root = [2,1,3], p = 1

  2
 / \
1   3

输出: 2
示例 2:

输入: root = [5,3,6,2,4,null,null,1], p = 6

      5
     / \
    3   6
   / \
  2   4
 /
1

输出: null

 */
public class SuccessLCCI {

    private boolean done = false;
    private TreeNode dest = null;

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if (root.val == p.val) {
            return root.right;
        }

        if (root.val < p.val) {
            midVisit(root.right, p.val);
        } else {
            midVisit(root, p.val);
        }
        return dest;
    }

    private void midVisit(TreeNode root, int result) {
        if (root == null) {
            return;
        }

        if (root.left != null) {
            midVisit(root.left, result);
        }
        if (done && dest == null) {
            dest = root;
            return;
        }
        if (root.val == result) {
            done = true;
        }

        if (root.right != null) {
            midVisit(root.right, result);
        }
    }


}
