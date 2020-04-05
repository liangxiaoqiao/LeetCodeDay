package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 547
 * title: Friend Circles
 * href: https://leetcode.com/problems/friend-circles
 * desc: There are N students in a class. Some of them are friends, while some are not. Their friendship is transitive in nature. For example, if A is a direct friend of B, and B is a direct friend of C, then A is an indirect friend of C. And we defined a friend circle is a group of students who are direct or indirect friends.\nGiven a N*N matrix M representing the friend relationship between students in the class. If M[i][j] = 1, then the ith and jth students are direct friends with each other, otherwise not. And you have to output the total number of friend circles among all the students.\nExample 1:\nInput: \n[[1,1,0],\n [1,1,0],\n [0,0,1]]\nOutput: 2\nExplanation:The 0th and 1st students are direct friends, so they are in a friend circle. \nThe 2nd student himself is in a friend circle. So return 2.\nExample 2:\nInput: \n[[1,1,0],\n [1,1,1],\n [0,1,1]]\nOutput: 1\nExplanation:The 0th and 1st students are direct friends, the 1st and 2nd students are direct friends, \nso the 0th and 2nd students are indirect friends. All of them are in the same friend circle, so return 1.\nNote:\nN is in range [1,200].\nM[i][i] = 1 for all students.\nIf M[i][j] = 1, then M[j][i] = 1.
 * <p>
 * 中文
 * 序号: 547
 * 标题： 朋友圈
 * 链接： https://leetcode-cn.com/problems/friend-circles
 * 描述： 班上有 N 名学生。其中有些人是朋友，有些则不是。他们的友谊具有是传递性。如果已知 A 是 B 的朋友，B 是 C 的朋友，那么我们可以认为 A 也是 C 的朋友。所谓的朋友圈，是指所有朋友的集合。\n给定一个 N * N 的矩阵 M，表示班级中学生之间的朋友关系。如果M[i][j] = 1，表示已知第 i 个和 j 个学生互为朋友关系，否则为不知道。你必须输出所有学生中的已知的朋友圈总数。\n示例 1:\n输入: \n[[1,1,0],\n [1,1,0],\n [0,0,1]]\n输出: 2 \n说明：已知学生0和学生1互为朋友，他们在一个朋友圈。\n第2个学生自己在一个朋友圈。所以返回2。\n示例 2:\n输入: \n[[1,1,0],\n [1,1,1],\n [0,1,1]]\n输出: 1\n说明：已知学生0和学生1互为朋友，学生1和学生2互为朋友，所以学生0和学生2也是朋友，所以他们三个在一个朋友圈，返回1。\n注意：\nN 在[1,200]的范围内。\n对于所有学生，有M[i][i] = 1。\n如果有M[i][j] = 1，则有M[j][i] = 1。
 * <p>
 * acceptance: 56.2%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class FriendCircles {
    public int findCircleNum(int[][] M) {
        return 0;
    }
}