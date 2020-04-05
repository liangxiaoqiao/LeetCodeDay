package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 495
 * title: Teemo Attacking
 * href: https://leetcode.com/problems/teemo-attacking
 * desc: In LOL world, there is a hero called Teemo and his attacking can make his enemy Ashe be in poisoned condition. Now, given the Teemo\'s attacking ascending time series towards Ashe and the poisoning time duration per Teemo\'s attacking, you need to output the total time that Ashe is in poisoned condition.\nYou may assume that Teemo attacks at the very beginning of a specific time point, and makes Ashe be in poisoned condition immediately.\nExample 1:\nInput: [1,4], 2\nOutput: 4\nExplanation: At time point 1, Teemo starts attacking Ashe and makes Ashe be poisoned immediately. \nThis poisoned status will last 2 seconds until the end of time point 2. \nAnd at time point 4, Teemo attacks Ashe again, and causes Ashe to be in poisoned status for another 2 seconds. \nSo you finally need to output 4.\n  Example 2:\nInput: [1,2], 2\nOutput: 3\nExplanation: At time point 1, Teemo starts attacking Ashe and makes Ashe be poisoned. \nThis poisoned status will last 2 seconds until the end of time point 2. \nHowever, at the beginning of time point 2, Teemo attacks Ashe again who is already in poisoned status. \nSince the poisoned status won\'t add up together, though the second poisoning attack will still work at time point 2, it will stop at the end of time point 3. \nSo you finally need to output 3.\n  Note:\nYou may assume the length of given time series array won\'t exceed 10000.\nYou may assume the numbers in the Teemo\'s attacking time series and his poisoning time duration per attacking are non-negative integers, which won\'t exceed 10,000,000.\n
 * <p>
 * 中文
 * 序号: 495
 * 标题： 提莫攻击
 * 链接： https://leetcode-cn.com/problems/teemo-attacking
 * 描述： 在《英雄联盟》的世界中，有一个叫 “提莫” 的英雄，他的攻击可以让敌方英雄艾希（编者注：寒冰射手）进入中毒状态。现在，给出提莫对艾希的攻击时间序列和提莫攻击的中毒持续时间，你需要输出艾希的中毒状态总时长。\n你可以认为提莫在给定的时间点进行攻击，并立即使艾希处于中毒状态。\n示例1:\n输入: [1,4], 2\n输出: 4\n原因: 在第 1 秒开始时，提莫开始对艾希进行攻击并使其立即中毒。中毒状态会维持 2 秒钟，直到第 2 秒钟结束。\n在第 4 秒开始时，提莫再次攻击艾希，使得艾希获得另外 2 秒的中毒时间。\n所以最终输出 4 秒。\n示例2:\n输入: [1,2], 2\n输出: 3\n原因: 在第 1 秒开始时，提莫开始对艾希进行攻击并使其立即中毒。中毒状态会维持 2 秒钟，直到第 2 秒钟结束。\n但是在第 2 秒开始时，提莫再次攻击了已经处于中毒状态的艾希。\n由于中毒状态不可叠加，提莫在第 2 秒开始时的这次攻击会在第 3 秒钟结束。\n所以最终输出 3。\n注意：\n你可以假定时间序列数组的总长度不超过 10000。\n你可以假定提莫攻击时间序列中的数字和提莫攻击的中毒持续时间都是非负整数，并且不超过 10,000,000。
 * <p>
 * acceptance: 53.0%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        return 0;
    }
}