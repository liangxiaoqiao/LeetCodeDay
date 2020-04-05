package com.liangxiaoqiao.leetcode.day.medium;

    
    import com.liangxiaoqiao.leetcode.day.pojo.TreeNode;
        

/*
 * English
 * id: 173
 * title: Binary Search Tree Iterator
 * href: https://leetcode.com/problems/binary-search-tree-iterator
 * desc: Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.\nCalling next() will return the next smallest number in the BST.\n  Example:\nBSTIterator iterator = new BSTIterator(root);\niterator.next();    // return 3\niterator.next();    // return 7\niterator.hasNext(); // return true\niterator.next();    // return 9\niterator.hasNext(); // return true\niterator.next();    // return 15\niterator.hasNext(); // return true\niterator.next();    // return 20\niterator.hasNext(); // return false\n  Note:\nnext() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.\nYou may assume that next() call will always be valid, that is, there will be at least a next smallest number in the BST when next() is called.
 * <p>
 * 中文
 * 序号: 173
 * 标题： 二叉搜索树迭代器
 * 链接： https://leetcode-cn.com/problems/binary-search-tree-iterator
 * 描述： 实现一个二叉搜索树迭代器。你将使用二叉搜索树的根节点初始化迭代器。
 * 调用 next() 将返回二叉搜索树中的下一个最小的数。
 * 示例：
 * BSTIterator iterator = new BSTIterator(root);
 * iterator.next();    // 返回 3
 * iterator.next();    // 返回 7
 * iterator.hasNext(); // 返回 true
 * iterator.next();    // 返回 9
 * iterator.hasNext(); // 返回 true
 * iterator.next();    // 返回 15
 * iterator.hasNext(); // 返回 true
 * iterator.next();    // 返回 20
 * iterator.hasNext(); // 返回 false
 * 提示：
 * next() 和 hasNext() 操作的时间复杂度是 O(1)，并使用 O(h) 内存，其中 h 是树的高度。
 * 你可以假设 next() 调用总是有效的，也就是说，当调用 next() 时，BST 中至少存在一个下一个最小的数。
 * <p>
 * acceptance: 52.3%
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
public class BinarySearchTreeIterator {
    public BinarySearchTreeIterator(TreeNode root) {
    }

    /*
     * @return the next smallest number
     */
    public int next() {
        return 0;
    }

    /*
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return false;
    }


}

/*
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
