package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 826
 * title: Most Profit Assigning Work
 * href: https://leetcode.com/problems/most-profit-assigning-work
 * desc: We have jobs: difficulty[i] is the difficulty of the ith job, and profit[i] is the profit of the ith job. \nNow we have some workers. worker[i] is the ability of the ith worker, which means that this worker can only complete a job with difficulty at most worker[i]. \nEvery worker can be assigned at most one job, but one job can be completed multiple times.\nFor example, if 3 people attempt the same job that pays $1, then the total profit will be $3.  If a worker cannot complete any job, his profit is $0.\nWhat is the most profit we can make?\nExample 1:\nInput: difficulty = [2,4,6,8,10], profit = [10,20,30,40,50], worker = [4,5,6,7]\nOutput: 100 \nExplanation: Workers are assigned jobs of difficulty [4,4,6,6] and they get profit of [20,20,30,30] seperately.\nNotes:\n1 <= difficulty.length = profit.length <= 10000\n1 <= worker.length <= 10000\ndifficulty[i], profit[i], worker[i]  are in range [1, 10^5]
 * <p>
 * 中文
 * 序号: 826
 * 标题： 安排工作以达到最大收益
 * 链接： https://leetcode-cn.com/problems/most-profit-assigning-work
 * 描述： 有一些工作：difficulty[i] 表示第i个工作的难度，profit[i]表示第i个工作的收益。\n现在我们有一些工人。worker[i]是第i个工人的能力，即该工人只能完成难度小于等于worker[i]的工作。\n每一个工人都最多只能安排一个工作，但是一个工作可以完成多次。\n举个例子，如果3个工人都尝试完成一份报酬为1的同样工作，那么总收益为 $3。如果一个工人不能完成任何工作，他的收益为 $0 。\n我们能得到的最大收益是多少？\n示例：\n输入: difficulty = [2,4,6,8,10], profit = [10,20,30,40,50], worker = [4,5,6,7]\n输出: 100 \n解释: 工人被分配的工作难度是 [4,4,6,6] ，分别获得 [20,20,30,30] 的收益。\n提示:\n1 <= difficulty.length = profit.length <= 10000\n1 <= worker.length <= 10000\ndifficulty[i], profit[i], worker[i]  的范围是 [1, 10^5]
 * <p>
 * acceptance: 37.4%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class MostProfitAssigningWork {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        return 0;
    }
}