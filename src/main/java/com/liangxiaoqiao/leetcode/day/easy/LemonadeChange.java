package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 860
 * title: Lemonade Change
 * href: https://leetcode.com/problems/lemonade-change
 * desc: At a lemonade stand, each lemonade costs $5. \nCustomers are standing in a queue to buy from you, and order one at a time (in the order specified by bills).\nEach customer will only buy one lemonade and pay with either a $5, $10, or $20 bill.  You must provide the correct change to each customer, so that the net transaction is that the customer pays $5.\nNote that you don\'t have any change in hand at first.\nReturn true if and only if you can provide every customer with correct change.\n  Example 1:\nInput: [5,5,5,10,20]\nOutput: true\nExplanation: \nFrom the first 3 customers, we collect three $5 bills in order.\nFrom the fourth customer, we collect a $10 bill and give back a $5.\nFrom the fifth customer, we give a $10 bill and a $5 bill.\nSince all customers got correct change, we output true.\nExample 2:\nInput: [5,5,10]\nOutput: true\nExample 3:\nInput: [10,10]\nOutput: false\nExample 4:\nInput: [5,5,10,10,20]\nOutput: false\nExplanation: \nFrom the first two customers in order, we collect two $5 bills.\nFor the next two customers in order, we collect a $10 bill and give back a $5 bill.\nFor the last customer, we can\'t give change of $15 back because we only have two $10 bills.\nSince not every customer received correct change, the answer is false.\n  Note:\n0 <= bills.length <= 10000\nbills[i] will be either 5, 10, or 20.
 * <p>
 * 中文
 * 序号: 860
 * 标题： 柠檬水找零
 * 链接： https://leetcode-cn.com/problems/lemonade-change
 * 描述： 在柠檬水摊上，每一杯柠檬水的售价为 5 美元。\n顾客排队购买你的产品，（按账单 bills 支付的顺序）一次购买一杯。\n每位顾客只买一杯柠檬水，然后向你付 5 美元、10 美元或 20 美元。你必须给每个顾客正确找零，也就是说净交易是每位顾客向你支付 5 美元。\n注意，一开始你手头没有任何零钱。\n如果你能给每位顾客正确找零，返回 true ，否则返回 false 。\n示例 1：\n输入：[5,5,5,10,20]\n输出：true\n解释：\n前 3 位顾客那里，我们按顺序收取 3 张 5 美元的钞票。\n第 4 位顾客那里，我们收取一张 10 美元的钞票，并返还 5 美元。\n第 5 位顾客那里，我们找还一张 10 美元的钞票和一张 5 美元的钞票。\n由于所有客户都得到了正确的找零，所以我们输出 true。\n示例 2：\n输入：[5,5,10]\n输出：true\n示例 3：\n输入：[10,10]\n输出：false\n示例 4：\n输入：[5,5,10,10,20]\n输出：false\n解释：\n前 2 位顾客那里，我们按顺序收取 2 张 5 美元的钞票。\n对于接下来的 2 位顾客，我们收取一张 10 美元的钞票，然后返还 5 美元。\n对于最后一位顾客，我们无法退回 15 美元，因为我们现在只有两张 10 美元的钞票。\n由于不是每位顾客都得到了正确的找零，所以答案是 false。\n  提示：\n0 <= bills.length <= 10000\nbills[i] 不是 5 就是 10 或是 20
 * <p>
 * acceptance: 51.0%
 * difficulty: Easy
 * private: False
 */


//TODO init
public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        return false;
    }
}