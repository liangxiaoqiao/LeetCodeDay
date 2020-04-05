package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 857
 * title: Minimum Cost to Hire K Workers
 * href: https://leetcode.com/problems/minimum-cost-to-hire-k-workers
 * desc: There are N workers.  The i-th worker has a quality[i] and a minimum wage expectation wage[i].\nNow we want to hire exactly K workers to form a paid group.  When hiring a group of K workers, we must pay them according to the following rules:\nEvery worker in the paid group should be paid in the ratio of their quality compared to other workers in the paid group.\nEvery worker in the paid group must be paid at least their minimum wage expectation.\nReturn the least amount of money needed to form a paid group satisfying the above conditions.\n  Example 1:\nInput: quality = [10,20,5], wage = [70,50,30], K = 2\nOutput: 105.00000\nExplanation: We pay 70 to 0-th worker and 35 to 2-th worker.\nExample 2:\nInput: quality = [3,1,10,10,1], wage = [4,8,2,2,7], K = 3\nOutput: 30.66667\nExplanation: We pay 4 to 0-th worker, 13.33333 to 2-th and 3-th workers seperately. \n  Note:\n1 <= K <= N <= 10000, where N = quality.length = wage.length\n1 <= quality[i] <= 10000\n1 <= wage[i] <= 10000\nAnswers within 10^-5 of the correct answer will be considered correct.
 * <p>
 * 中文
 * 序号: 857
 * 标题： 雇佣 K 名工人的最低成本
 * 链接： https://leetcode-cn.com/problems/minimum-cost-to-hire-k-workers
 * 描述： 有 N 名工人。 第 i 名工人的工作质量为 quality[i] ，其最低期望工资为 wage[i] 。\n现在我们想雇佣 K 名工人组成一个工资组。在雇佣 一组 K 名工人时，我们必须按照下述规则向他们支付工资：\n对工资组中的每名工人，应当按其工作质量与同组其他工人的工作质量的比例来支付工资。\n工资组中的每名工人至少应当得到他们的最低期望工资。\n返回组成一个满足上述条件的工资组至少需要多少钱。\n  示例 1：\n输入： quality = [10,20,5], wage = [70,50,30], K = 2\n输出： 105.00000\n解释： 我们向 0 号工人支付 70，向 2 号工人支付 35。\n示例 2：\n输入： quality = [3,1,10,10,1], wage = [4,8,2,2,7], K = 3\n输出： 30.66667\n解释： 我们向 0 号工人支付 4，向 2 号和 3 号分别支付 13.33333。\n  提示：\n1 <= K <= N <= 10000，其中 N = quality.length = wage.length\n1 <= quality[i] <= 10000\n1 <= wage[i] <= 10000\n与正确答案误差在 10^-5 之内的答案将被视为正确的。
 * <p>
 * acceptance: 48.8%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class MinimumCostToHireKWorkers {
    public double mincostToHireWorkers(int[] quality, int[] wage, int K) {
        return 0;
    }
}