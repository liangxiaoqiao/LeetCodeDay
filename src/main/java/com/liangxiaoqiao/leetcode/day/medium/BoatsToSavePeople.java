package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 881
 * title: Boats to Save People
 * href: https://leetcode.com/problems/boats-to-save-people
 * desc: The i-th person has weight people[i], and each boat can carry a maximum weight of limit.\nEach boat carries at most 2 people at the same time, provided the sum of the weight of those people is at most limit.\nReturn the minimum number of boats to carry every given person.  (It is guaranteed each person can be carried by a boat.)\n  Example 1:\nInput: people = [1,2], limit = 3\nOutput: 1\nExplanation: 1 boat (1, 2)\nExample 2:\nInput: people = [3,2,2,1], limit = 3\nOutput: 3\nExplanation: 3 boats (1, 2), (2) and (3)\nExample 3:\nInput: people = [3,5,3,4], limit = 5\nOutput: 4\nExplanation: 4 boats (3), (3), (4), (5)\nNote:\n1 <= people.length <= 50000\n1 <= people[i] <= limit <= 30000
 * <p>
 * 中文
 * 序号: 881
 * 标题： 救生艇
 * 链接： https://leetcode-cn.com/problems/boats-to-save-people
 * 描述： 第 i 个人的体重为 people[i]，每艘船可以承载的最大重量为 limit。

每艘船最多可同时载两人，但条件是这些人的重量之和最多为 limit。

返回载到每一个人所需的最小船数。(保证每个人都能被船载)。

 

示例 1：

输入：people = [1,2], limit = 3
输出：1
解释：1 艘船载 (1, 2)
示例 2：

输入：people = [3,2,2,1], limit = 3
输出：3
解释：3 艘船分别载 (1, 2), (2) 和 (3)
示例 3：

输入：people = [3,5,3,4], limit = 5
输出：4
解释：4 艘船分别载 (3), (3), (4), (5)
提示：

1 <= people.length <= 50000
1 <= people[i] <= limit <= 30000

 * acceptance: 45.2%
 * difficulty: Medium
 * private: False
 */


import java.util.Arrays;

public class BoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int start = 0;
        int end = people.length - 1;
        if (people[0] >= limit) {
            return people.length;
        }
        int count = 0;
        int sum = 0;
        while (start <= end) {
            int left = people[start];
            if (left >= limit) {
                count += (end - start + 1);
                break;
            }
            int right = people[end];
            if (sum == 0) {
                if (start == end) {
                    count++;
                    break;
                }
                if (left + right > limit) {
                    end--;
                    count++;
                } else if (left + right == limit) {
                    start++;
                    end--;
                    count++;
                } else {
                    sum = left + right;
                    end--;
                    start++;
                    if (start > end) {
                        count++;
                    }
                }
            } else {
                if (start == end) {
                    if (sum + left > limit) {
                        count += 2;
                    } else {
                        count++;
                    }
                    break;
                }
                if (sum + left > limit) {
                    count++;
                    sum = 0;
                } else if (sum + left == limit) {
                    start++;
                    count++;
                    sum = 0;
                } else if (sum + left + right == limit) {
                    start++;
                    end--;
                    count++;
                    sum = 0;
                } else if (sum + left + right > limit) {
                    start++;
                    count++;
                    sum = 0;
                } else {
                    sum = sum + left;
                    start++;
                }

                if (start > end) {
                    count++;
                }
            }

        }

        return count == 0 ? 1 : count;
    }
}