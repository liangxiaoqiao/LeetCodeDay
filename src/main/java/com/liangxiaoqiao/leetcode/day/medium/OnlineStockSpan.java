package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 901
 * title: Online Stock Span
 * href: https://leetcode.com/problems/online-stock-span
 * desc: Write a class StockSpanner which collects daily price quotes for some stock, and returns the span of that stock\'s price for the current day.\nThe span of the stock\'s price today is defined as the maximum number of consecutive days (starting from today and going backwards) for which the price of the stock was less than or equal to today\'s price.\nFor example, if the price of a stock over the next 7 days were [100, 80, 60, 70, 60, 75, 85], then the stock spans would be [1, 1, 1, 2, 1, 4, 6].\n  Example 1:\nInput: [\"StockSpanner\",\"next\",\"next\",\"next\",\"next\",\"next\",\"next\",\"next\"], [[],[100],[80],[60],[70],[60],[75],[85]]\nOutput: [null,1,1,1,2,1,4,6]\nExplanation: \nFirst, S = StockSpanner() is initialized.  Then:\nS.next(100) is called and returns 1,\nS.next(80) is called and returns 1,\nS.next(60) is called and returns 1,\nS.next(70) is called and returns 2,\nS.next(60) is called and returns 1,\nS.next(75) is called and returns 4,\nS.next(85) is called and returns 6.\n\nNote that (for example) S.next(75) returned 4, because the last 4 prices\n(including today\'s price of 75) were less than or equal to today\'s price.\n  Note:\nCalls to StockSpanner.next(int price) will have 1 <= price <= 10^5.\nThere will be at most 10000 calls to StockSpanner.next per test case.\nThere will be at most 150000 calls to StockSpanner.next across all test cases.\nThe total time limit for this problem has been reduced by 75% for C++, and 50% for all other languages.
 * <p>
 * 中文
 * 序号: 901
 * 标题： 股票价格跨度
 * 链接： https://leetcode-cn.com/problems/online-stock-span
 * 描述： 编写一个 StockSpanner 类，它收集某些股票的每日报价，并返回该股票当日价格的跨度。\n今天股票价格的跨度被定义为股票价格小于或等于今天价格的最大连续日数（从今天开始往回数，包括今天）。\n例如，如果未来7天股票的价格是 [100, 80, 60, 70, 60, 75, 85]，那么股票跨度将是 [1, 1, 1, 2, 1, 4, 6]。\n  示例：\n输入：[\"StockSpanner\",\"next\",\"next\",\"next\",\"next\",\"next\",\"next\",\"next\"], [[],[100],[80],[60],[70],[60],[75],[85]]\n输出：[null,1,1,1,2,1,4,6]\n解释：\n首先，初始化 S = StockSpanner()，然后：\nS.next(100) 被调用并返回 1，\nS.next(80) 被调用并返回 1，\nS.next(60) 被调用并返回 1，\nS.next(70) 被调用并返回 2，\nS.next(60) 被调用并返回 1，\nS.next(75) 被调用并返回 4，\nS.next(85) 被调用并返回 6。\n\n注意 (例如) S.next(75) 返回 4，因为截至今天的最后 4 个价格\n(包括今天的价格 75) 小于或等于今天的价格。\n  提示：\n调用 StockSpanner.next(int price) 时，将有 1 <= price <= 10^5。\n每个测试用例最多可以调用  10000 次 StockSpanner.next。\n在所有测试用例中，最多调用 150000 次 StockSpanner.next。\n此问题的总时间限制减少了 50%。
 * <p>
 * acceptance: 52.5%
 * difficulty: Medium
 * private: False
 */


//TODO init
class OnlineStockSpan {
    public OnlineStockSpan() {
    }

    public int next(int price) {
        return 0;
    }
}

/*
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
