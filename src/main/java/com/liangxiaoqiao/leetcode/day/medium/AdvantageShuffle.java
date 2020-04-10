package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 870
 * title: Advantage Shuffle
 * href: https://leetcode.com/problems/advantage-shuffle
 * desc: Given two arrays A and B of equal size, the advantage of A with respect to B is the number of indices i for which A[i] > B[i].
 * Return any permutation of A that maximizes its advantage with respect to B.
 * Example 1:
 * Input: A = [2,7,11,15], B = [1,10,4,11]
 * Output: [2,11,7,15]
 * Example 2:
 * Input: A = [12,24,8,32], B = [13,25,32,11]
 * Output: [24,32,8,12]
 * Note:
 * 1 <= A.length = B.length <= 10000
 * 0 <= A[i] <= 10^9
 * 0 <= B[i] <= 10^9
 * <p>
 * 中文
 * 序号: 870
 * 标题： 优势洗牌
 * 链接： https://leetcode-cn.com/problems/advantage-shuffle
 * 描述：给定两个大小相等的数组 A 和 B，A 相对于 B 的优势可以用满足 A[i] > B[i] 的索引 i 的数目来描述。
返回 A 的任意排列，使其相对于 B 的优势最大化。

示例 1：

输入：A = [2,7,11,15], B = [1,10,4,11]
输出：[2,11,7,15]
示例 2：

输入：A = [12,24,8,32], B = [13,25,32,11]
输出：[24,32,8,12]
 

提示：

1 <= A.length = B.length <= 10000
0 <= A[i] <= 10^9
0 <= B[i] <= 10^9
 * acceptance: 44.1%
 * difficulty: Medium
 * private: False
 */


import java.util.*;

public class AdvantageShuffle {

    public int[] advantageCount(int[] A, int[] B) {
        Arrays.sort(A);
        Set<Integer> usedIndex = new HashSet<>();
        List<Integer> notFindBIndex = new ArrayList<>();
        int[] result = new int[A.length];
        for (int i = 0; i < B.length; i++) {
            int rightNum = B[i];
            int index = findIndex(A, rightNum, usedIndex);
            if (index != -1) {
                result[i] = A[index];
            } else {
                notFindBIndex.add(i);
            }
        }
        int start = 0;
        for (int i = 0; i < A.length; i++) {
            if (!usedIndex.contains(i)) {
                int indexB = notFindBIndex.get(start);
                result[indexB] = A[i];
                start++;
            }
        }
        return result;
    }

    //TODO should be more simple
    private int findIndex(int[] a, int rightNum, Set<Integer> usedIndex) {
        for (int i = 0; i < a.length; i++) {
            if (!usedIndex.contains(i) && a[i] > rightNum) {
                usedIndex.add(i);
                return i;
            }
        }
        return -1;
    }


}