package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 710
 * title: Random Pick with Blacklist
 * href: https://leetcode.com/problems/random-pick-with-blacklist
 * desc: Given a blacklist B containing unique integers from [0, N), write a function to return a uniform random integer from [0, N) which is NOT in B.\nOptimize it such that it minimizes the call to system’s Math.random().\nNote:\n1 <= N <= 1000000000\n0 <= B.length < min(100000, N)\n[0, N) does NOT include N. See interval notation.\nExample 1:\nInput: \n[\"Solution\",\"pick\",\"pick\",\"pick\"]\n[[1,[]],[],[],[]]\nOutput: [null,0,0,0]\nExample 2:\nInput: \n[\"Solution\",\"pick\",\"pick\",\"pick\"]\n[[2,[]],[],[],[]]\nOutput: [null,1,1,1]\nExample 3:\nInput: \n[\"Solution\",\"pick\",\"pick\",\"pick\"]\n[[3,[1]],[],[],[]]\nOutput: [null,0,0,2]\nExample 4:\nInput: \n[\"Solution\",\"pick\",\"pick\",\"pick\"]\n[[4,[2]],[],[],[]]\nOutput: [null,1,3,1]\nExplanation of Input Syntax:\nThe input is two lists: the subroutines called and their arguments. Solution\'s constructor has two arguments, N and the blacklist B. pick has no arguments. Arguments are always wrapped with a list, even if there aren\'t any.
 * <p>
 * 中文
 * 序号: 710
 * 标题： 黑名单中的随机数
 * 链接： https://leetcode-cn.com/problems/random-pick-with-blacklist
 * 描述： 给定一个包含 [0，n ) 中独特的整数的黑名单 B，写一个函数从 [ 0，n ) 中返回一个不在 B 中的随机整数。\n对它进行优化使其尽量少调用系统方法 Math.random() 。\n提示:\n1 <= N <= 1000000000\n0 <= B.length < min(100000, N)\n[0, N) 不包含 N，详细参见 interval notation 。\n示例 1:\n输入: \n[\"Solution\",\"pick\",\"pick\",\"pick\"]\n[[1,[]],[],[],[]]\n输出: [null,0,0,0]\n示例 2:\n输入: \n[\"Solution\",\"pick\",\"pick\",\"pick\"]\n[[2,[]],[],[],[]]\n输出: [null,1,1,1]\n示例 3:\n输入: \n[\"Solution\",\"pick\",\"pick\",\"pick\"]\n[[3,[1]],[],[],[]]\nOutput: [null,0,0,2]\n示例 4:\n输入: \n[\"Solution\",\"pick\",\"pick\",\"pick\"]\n[[4,[2]],[],[],[]]\n输出: [null,1,3,1]\n输入语法说明：\n输入是两个列表：调用成员函数名和调用的参数。Solution的构造函数有两个参数，N 和黑名单 B。pick 没有参数，输入参数是一个列表，即使参数为空，也会输入一个 [] 空列表。
 * <p>
 * acceptance: 32.4%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class RandomPickWithBlacklist {
    public RandomPickWithBlacklist(int N, int[] blacklist) {
        
    }

    public int pick() {
        return 0;
    }
}

/*
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(N, blacklist);
 * int param_1 = obj.pick();
 */
