package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 895
 * title: None
 * href: None
 * desc: None
 * <p>
 * 中文
 * 序号: 895
 * 标题： 最大频率栈
 * 链接： https://leetcode-cn.com/problems/maximum-frequency-stack
 * 描述： 实现 FreqStack，模拟类似栈的数据结构的操作的一个类。\nFreqStack 有两个函数：\npush(int x)，将整数 x 推入栈中。\npop()，它移除并返回栈中出现最频繁的元素。\n如果最频繁的元素不只一个，则移除并返回最接近栈顶的元素。\n  示例：\n输入：\n[\"FreqStack\",\"push\",\"push\",\"push\",\"push\",\"push\",\"push\",\"pop\",\"pop\",\"pop\",\"pop\"],\n[[],[5],[7],[5],[7],[4],[5],[],[],[],[]]\n输出：[null,null,null,null,null,null,null,5,7,5,4]\n解释：\n执行六次 .push 操作后，栈自底向上为 [5,7,5,7,4,5]。然后：\n\npop() -> 返回 5，因为 5 是出现频率最高的。\n栈变成 [5,7,5,7,4]。\n\npop() -> 返回 7，因为 5 和 7 都是频率最高的，但 7 最接近栈顶。\n栈变成 [5,7,5,4]。\n\npop() -> 返回 5 。\n栈变成 [5,7,4]。\n\npop() -> 返回 4 。\n栈变成 [5,7]。\n  提示：\n对 FreqStack.push(int x) 的调用中 0 <= x <= 10^9。\n如果栈的元素数目为零，则保证不会调用  FreqStack.pop()。\n单个测试样例中，对 FreqStack.push 的总调用次数不会超过 10000。\n单个测试样例中，对 FreqStack.pop 的总调用次数不会超过 10000。\n所有测试样例中，对 FreqStack.push 和 FreqStack.pop 的总调用次数不会超过 150000。\n
 * <p>
 * acceptance: 45.2%
 * difficulty: Hard
 * private: False
 */


//TODO init
class MaximumFrequencyStack {
    public MaximumFrequencyStack() {
    }

    public void push(int x) {
    }

    public int pop() {
        return 0;
    }
}

/*
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 */
