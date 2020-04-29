package com.liangxiaoqiao.leetcode.day.medium;

import com.liangxiaoqiao.leetcode.day.pojo.TreeNode;

import java.util.ArrayList;
import java.util.List;

/*
 * 中文
 * 序号: 1315
 * 标题： 祖父节点值为偶数的节点和
 * 链接： https://leetcode-cn.com/problems/sum-of-nodes-with-even-valued-grandparent/
 * 描述： 给你一棵二叉树，请你返回满足以下条件的所有节点的值之和：

该节点的祖父节点的值为偶数。（一个节点的祖父节点是指该节点的父节点的父节点。）
如果不存在祖父节点值为偶数的节点，那么返回 0 。

 

示例：



输入：root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
输出：18
解释：图中红色节点的祖父节点的值为偶数，蓝色节点为这些红色节点的祖父节点。
 

提示：

树中节点的数目在 1 到 10^4 之间。
每个节点的值在 1 到 100 之间。
 * acceptance:
 * difficulty: Medium
 * private: False
 */


public class SumOfNodes {


    public int sumEvenGrandparent(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        parseRoot(list, root, 1);
        return list.stream().mapToInt(t -> t).sum();
    }

    private void parseRoot(List<Integer> list, TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (level == 1 && root.val % 2 == 0) {
            parseRoot(list, root.left, 2);
            parseRoot(list, root.right, 2);
        } else if (level == 2) {
            parseRoot(list, root.left, 3);
            parseRoot(list, root.right, 3);
            if (root.val % 2 == 0) {
                parseRoot(list, root, 1);
            }
        } else if (level == 3) {
            list.add(root.val);
            if (root.val % 2 == 0) {
                parseRoot(list, root, 1);
            }
        }
    }


    int sum;
    public int sumEvenGrandparent2(TreeNode root) {
        search(root,null,null);
        return sum;
    }

    public void search(TreeNode node ,Boolean gParent,Boolean parent){
        if(node == null){
            return;
        }
        if(gParent != null && gParent){
            sum += node.val;
        }
        boolean cur = (node.val % 2 == 0) ? true:false;
        search(node.left,parent,cur);
        search(node.right,parent,cur);
    }

}
