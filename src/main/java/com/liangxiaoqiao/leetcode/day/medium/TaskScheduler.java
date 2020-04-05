package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 621
 * title: Task Scheduler
 * href: https://leetcode.com/problems/task-scheduler
 * desc: Given a char array representing tasks CPU need to do. It contains capital letters A to Z where different letters represent different tasks. Tasks could be done without original order. Each task could be done in one interval. For each interval, CPU could finish one task or just be idle.\nHowever, there is a non-negative cooling interval n that means between two same tasks, there must be at least n intervals that CPU are doing different tasks or just be idle.\nYou need to return the least number of intervals the CPU will take to finish all the given tasks.\n  Example:\nInput: tasks = [\"A\",\"A\",\"A\",\"B\",\"B\",\"B\"], n = 2\nOutput: 8\nExplanation: A -> B -> idle -> A -> B -> idle -> A -> B.\n  Note:\nThe number of tasks is in the range [1, 10000].\nThe integer n is in the range [0, 100].
 * <p>
 * 中文
 * 序号: 621
 * 标题： 任务调度器
 * 链接： https://leetcode-cn.com/problems/task-scheduler
 * 描述： 给定一个用字符数组表示的 CPU 需要执行的任务列表。其中包含使用大写的 A - Z 字母表示的26 种不同种类的任务。任务可以以任意顺序执行，并且每个任务都可以在 1 个单位时间内执行完。CPU 在任何一个单位时间内都可以执行一个任务，或者在待命状态。\n然而，两个相同种类的任务之间必须有长度为 n 的冷却时间，因此至少有连续 n 个单位时间内 CPU 在执行不同的任务，或者在待命状态。\n你需要计算完成所有任务所需要的最短时间。\n示例 1：\n输入: tasks = [\"A\",\"A\",\"A\",\"B\",\"B\",\"B\"], n = 2\n输出: 8\n执行顺序: A -> B -> (待命) -> A -> B -> (待命) -> A -> B.\n注：\n任务的总个数为 [1, 10000]。\nn 的取值范围为 [0, 100]。
 * <p>
 * acceptance: 47.2%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        return 0;
    }
}