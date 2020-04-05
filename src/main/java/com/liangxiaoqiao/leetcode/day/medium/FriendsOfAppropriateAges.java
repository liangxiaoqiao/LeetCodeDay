package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 825
 * title: Friends Of Appropriate Ages
 * href: https://leetcode.com/problems/friends-of-appropriate-ages
 * desc: Some people will make friend requests. The list of their ages is given and ages[i] is the age of the ith person. \nPerson A will NOT friend request person B (B != A) if any of the following conditions are true:\nage[B] <= 0.5 * age[A] + 7\nage[B] > age[A]\nage[B] > 100 && age[A] < 100\nOtherwise, A will friend request B.\nNote that if A requests B, B does not necessarily request A.  Also, people will not friend request themselves.\nHow many total friend requests are made?\nExample 1:\nInput: [16,16]\nOutput: 2\nExplanation: 2 people friend request each other.\nExample 2:\nInput: [16,17,18]\nOutput: 2\nExplanation: Friend requests are made 17 -> 16, 18 -> 17.\nExample 3:\nInput: [20,30,100,110,120]\nOutput: \nExplanation: Friend requests are made 110 -> 100, 120 -> 110, 120 -> 100.\n  Notes:\n1 <= ages.length <= 20000.\n1 <= ages[i] <= 120.
 * <p>
 * 中文
 * 序号: 825
 * 标题： 适龄的朋友
 * 链接： https://leetcode-cn.com/problems/friends-of-appropriate-ages
 * 描述： 人们会互相发送好友请求，现在给定一个包含有他们年龄的数组，ages[i] 表示第 i 个人的年龄。\n当满足以下条件时，A 不能给 B（A、B不为同一人）发送好友请求：\nage[B] <= 0.5 * age[A] + 7\nage[B] > age[A]\nage[B] > 100 && age[A] < 100\n否则，A 可以给 B 发送好友请求。\n注意如果 A 向 B 发出了请求，不等于 B 接受了 A 的请求。而且，人们不会给自己发送好友请求。 \n求总共会发出多少份好友请求?\n示例 1:\n输入: [16,16]\n输出: 2\n解释: 二人可以互发好友申请。\n示例 2:\n输入: [16,17,18]\n输出: 2\n解释: 好友请求可产生于 17 -> 16, 18 -> 17.\n示例 3:\n输入: [20,30,100,110,120]\n输出: 3\n解释: 好友请求可产生于 110 -> 100, 120 -> 110, 120 -> 100.\n说明:\n1 <= ages.length <= 20000.\n1 <= ages[i] <= 120.
 * <p>
 * acceptance: 40.6%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class FriendsOfAppropriateAges {
    public int numFriendRequests(int[] ages) {
        return 0;
    }
}