package com.liangxiaoqiao.leetcode.day.util;

import com.liangxiaoqiao.leetcode.day.pojo.ListNode;
import com.liangxiaoqiao.leetcode.day.pojo.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class TreeUtils {

    public static Object[] treeToArray(TreeNode root) {
        List<Object> result = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode firstObj;
        while (!queue.isEmpty()) {
            firstObj = queue.poll();
            if (firstObj == null) {
                result.add(null);
                continue;
            } else {
                result.add(firstObj.val);
            }
            TreeNode left = firstObj.left;
            TreeNode right = firstObj.right;
            queue.offer(left);
            queue.offer(right);
        }

        int lastIndex = result.size() - 1;
        for (int i = result.size() - 1; i >= 0; i--) {
            if (result.get(i) != null) {
                lastIndex = i + 1;
                break;
            }
        }
        return result.subList(0, lastIndex).toArray();
    }

    public static Object[] treeToArray(ListNode root) {
        ListNode start = root;
        List<Object> result = new ArrayList<>();
        while (start != null) {
            result.add(start.val);
            start = start.next;
        }
        return result.toArray();
    }

    public static boolean sameArray(Object[] expect, Object[] result) {
        if (expect == null && result == null) {
            return true;
        } else if (expect == null) {
            return false;
        } else if (result == null) {
            return false;
        }
        if (expect.length != result.length) {
            return false;
        }
        for (int i = 0; i < expect.length; i++) {
            if (expect[i] == null && result[i] == null) {
                return true;
            } else if (expect[i] != null && result[i] != null) {
                if (expect[i].getClass() != result[i].getClass()) {
                    return false;
                } else if (!expect[i].equals(result[i])) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static TreeNode arrayToTree(Object[] array) {
        Object[] nodes = Stream.of(array).map(t -> {
            if (t != null) {
                return new TreeNode(Integer.parseInt(String.valueOf(t)));
            }
            return null;
        }).toArray();

        for (int i = 0; i < nodes.length; i++) {
            if (nodes[i] instanceof TreeNode) {
                int leftIndex = 2 * i + 1;
                int rightIndex = 2 * i + 2;
                if (leftIndex < nodes.length) {
                    Object left = nodes[leftIndex];
                    ((TreeNode) nodes[i]).left = left instanceof TreeNode ? (TreeNode) left : null;
                }
                if (rightIndex < nodes.length) {
                    Object right = nodes[rightIndex];
                    ((TreeNode) nodes[i]).right = right instanceof TreeNode ? (TreeNode) right : null;
                }
            }
        }

        return nodes.length < 1 ? null : (TreeNode) nodes[0];
    }
}
