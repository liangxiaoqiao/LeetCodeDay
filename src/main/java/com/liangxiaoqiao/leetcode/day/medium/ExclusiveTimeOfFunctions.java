package com.liangxiaoqiao.leetcode.day.medium;


import java.util.List;
    

/*
 * English
 * id: 636
 * title: Exclusive Time of Functions
 * href: https://leetcode.com/problems/exclusive-time-of-functions
 * desc: Given the running logs of n functions that are executed in a nonpreemptive single threaded CPU, find the exclusive time of these functions.\nEach function has a unique id, start from 0 to n-1. A function may be called recursively or by another function.\nA log is a string has this format : function_id:start_or_end:timestamp. For example, \"0:start:0\" means function 0 starts from the very beginning of time 0. \"0:end:0\" means function 0 ends to the very end of time 0.\nExclusive time of a function is defined as the time spent within this function, the time spent by calling other functions should not be considered as this function\'s exclusive time. You should return the exclusive time of each function sorted by their function id.\nExample 1:\nInput:\nn = 2\nlogs = \n[\"0:start:0\",\n \"1:start:2\",\n \"1:end:5\",\n \"0:end:6\"]\nOutput:[3, 4]\nExplanation:\nFunction 0 starts at time 0, then it executes 2 units of time and reaches the end of time 1. \nNow function 0 calls function 1, function 1 starts at time 2, executes 4 units of time and end at time 5.\nFunction 0 is running again at time 6, and also end at the time 6, thus executes 1 unit of time. \nSo function 0 totally execute 2 + 1 = 3 units of time, and function 1 totally execute 4 units of time.\nNote:\nInput logs will be sorted by timestamp, NOT log id.\nYour output should be sorted by function id, which means the 0th element of your output corresponds to the exclusive time of function 0.\nTwo functions won\'t start or end at the same time.\nFunctions could be called recursively, and will always end.\n1 <= n <= 100
 * <p>
 * 中文
 * 序号: 636
 * 标题： 函数的独占时间
 * 链接： https://leetcode-cn.com/problems/exclusive-time-of-functions
 * 描述： 给出一个非抢占单线程CPU的 n 个函数运行日志，找到函数的独占时间。\n每个函数都有一个唯一的 Id，从 0 到 n-1，函数可能会递归调用或者被其他函数调用。\n日志是具有以下格式的字符串：function_id：start_or_end：timestamp。例如：\"0:start:0\" 表示函数 0 从 0 时刻开始运行。\"0:end:0\" 表示函数 0 在 0 时刻结束。\n函数的独占时间定义是在该方法中花费的时间，调用其他函数花费的时间不算该函数的独占时间。你需要根据函数的 Id 有序地返回每个函数的独占时间。\n示例 1:\n输入:\nn = 2\nlogs = \n[\"0:start:0\",\n \"1:start:2\",\n \"1:end:5\",\n \"0:end:6\"]\n输出:[3, 4]\n说明：\n函数 0 在时刻 0 开始，在执行了  2个时间单位结束于时刻 1。\n现在函数 0 调用函数 1，函数 1 在时刻 2 开始，执行 4 个时间单位后结束于时刻 5。\n函数 0 再次在时刻 6 开始执行，并在时刻 6 结束运行，从而执行了 1 个时间单位。\n所以函数 0 总共的执行了 2 +1 =3 个时间单位，函数 1 总共执行了 4 个时间单位。\n说明：\n输入的日志会根据时间戳排序，而不是根据日志Id排序。\n你的输出会根据函数Id排序，也就意味着你的输出数组中序号为 0 的元素相当于函数 0 的执行时间。\n两个函数不会在同时开始或结束。\n函数允许被递归调用，直到运行结束。\n1 <= n <= 100
 * <p>
 * acceptance: 50.3%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class ExclusiveTimeOfFunctions {
    public int[] exclusiveTime(int n, List<String> logs) {
        return null;
    }
}