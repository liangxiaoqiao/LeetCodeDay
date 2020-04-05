package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 714
 * title: Best Time to Buy and Sell Stock with Transaction Fee
 * href: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee
 * desc: Your are given an array of integers prices, for which the i-th element is the price of a given stock on day i; and a non-negative integer fee representing a transaction fee.\nYou may complete as many transactions as you like, but you need to pay the transaction fee for each transaction. You may not buy more than 1 share of a stock at a time (ie. you must sell the stock share before you buy again.)\nReturn the maximum profit you can make.\nExample 1:\nInput: prices = [1, 3, 2, 8, 4, 9], fee = 2\nOutput: 8\nExplanation: The maximum profit can be achieved by:\nBuying at prices[0] = 1\nSelling at prices[3] = 8\nBuying at prices[4] = 4\nSelling at prices[5] = 9\nThe total profit is ((8 - 1) - 2) + ((9 - 4) - 2) = 8.\nNote:\n0 < prices.length <= 50000.\n0 < prices[i] < 50000.\n0 <= fee < 50000.
 * <p>
 * 中文
 * 序号: 714
 * 标题： 买卖股票的最佳时机含手续费
 * 链接： https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee
 * 描述： 给定一个整数数组 prices，其中第 i 个元素代表了第 i 天的股票价格 ；非负整数 fee 代表了交易股票的手续费用。\n你可以无限次地完成交易，但是你每次交易都需要付手续费。如果你已经购买了一个股票，在卖出它之前你就不能再继续购买股票了。\n返回获得利润的最大值。\n示例 1:\n输入: prices = [1, 3, 2, 8, 4, 9], fee = 2\n输出: 8\n解释: 能够达到的最大利润:  \n在此处买入 prices[0] = 1\n在此处卖出 prices[3] = 8\n在此处买入 prices[4] = 4\n在此处卖出 prices[5] = 9\n总利润: ((8 - 1) - 2) + ((9 - 4) - 2) = 8.\n注意:\n0 < prices.length <= 50000.\n0 < prices[i] < 50000.\n0 <= fee < 50000.
 * <p>
 * acceptance: 52.6%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class BestTimeToBuyAndSellStockWithTransactionFee {
    public int maxProfit(int[] prices, int fee) {
        return 0;
    }
}