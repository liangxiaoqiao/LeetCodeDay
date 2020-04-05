package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 155
 * title: Min Stack
 * href: https://leetcode.com/problems/min-stack
 * desc: Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.\npush(x) -- Push element x onto stack.\npop() -- Removes the element on top of the stack.\ntop() -- Get the top element.\ngetMin() -- Retrieve the minimum element in the stack.\nExample:\nMinStack minStack = new MinStack();\nminStack.push(-2);\nminStack.push(0);\nminStack.push(-3);\nminStack.getMin();   --> Returns -3.\nminStack.pop();\nminStack.top();      --> Returns 0.\nminStack.getMin();   --> Returns -2.
 * <p>
 * 中文
 * 序号: 155
 * 标题： 最小栈
 * 链接： https://leetcode-cn.com/problems/min-stack
 * 描述： 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。\npush(x) -- 将元素 x 推入栈中。\npop() -- 删除栈顶的元素。\ntop() -- 获取栈顶元素。\ngetMin() -- 检索栈中的最小元素。\n示例:\nMinStack minStack = new MinStack();\nminStack.push(-2);\nminStack.push(0);\nminStack.push(-3);\nminStack.getMin();   --> 返回 -3.\nminStack.pop();\nminStack.top();      --> 返回 0.\nminStack.getMin();   --> 返回 -2.
 * <p>
 * acceptance: 40.2%
 * difficulty: Easy
 * private: False
 */


//TODO init
class MinStack {
    /*
     * initialize your data structure here.
     */
    public MinStack() {
    }

    public void push(int x) {
    }

    public void pop() {
    }

    public int top() {
        return 0;
    }

    public int getMin() {
        return 0;
    }
}
/*
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */