package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 519
 * title: Random Flip Matrix
 * href: https://leetcode.com/problems/random-flip-matrix
 * desc: You are given the number of rows n_rows and number of columns n_cols of a 2D binary matrix where all values are initially 0. Write a function flip which chooses a 0 value uniformly at random, changes it to 1, and then returns the position [row.id, col.id] of that value. Also, write a function reset which sets all values back to 0. Try to minimize the number of calls to system\'s Math.random() and optimize the time and space complexity.\nNote:\n1 <= n_rows, n_cols <= 10000\n0 <= row.id < n_rows and 0 <= col.id < n_cols\nflip will not be called when the matrix has no 0 values left.\nthe total number of calls to flip and reset will not exceed 1000.\nExample 1:\nInput: \n[\"Solution\",\"flip\",\"flip\",\"flip\",\"flip\"]\n[[2,3],[],[],[],[]]\nOutput: [null,[0,1],[1,2],[1,0],[1,1]]\nExample 2:\nInput: \n[\"Solution\",\"flip\",\"flip\",\"reset\",\"flip\"]\n[[1,2],[],[],[],[]]\nOutput: [null,[0,0],[0,1],null,[0,0]]\nExplanation of Input Syntax:\nThe input is two lists: the subroutines called and their arguments. Solution\'s constructor has two arguments, n_rows and n_cols. flip and reset have no arguments. Arguments are always wrapped with a list, even if there aren\'t any.
 * <p>
 * 中文
 * 序号: 519
 * 标题： 随机翻转矩阵
 * 链接： https://leetcode-cn.com/problems/random-flip-matrix
 * 描述： 题中给出一个 n 行 n 列的二维矩阵 (n_rows,n_cols)，且所有值被初始化为 0。要求编写一个 flip 函数，均匀随机的将矩阵中的 0 变为 1，并返回该值的位置下标 [row_id,col_id]；同样编写一个 reset 函数，将所有的值都重新置为 0。尽量最少调用随机函数 Math.random()，并且优化时间和空间复杂度。\n注意:\n1.1 <= n_rows, n_cols <= 10000\n2. 0 <= row.id < n_rows 并且 0 <= col.id < n_cols\n3.当矩阵中没有值为 0 时，不可以调用 flip 函数\n4.调用 flip 和 reset 函数的次数加起来不会超过 1000 次\n示例 1：\n输入: \n[\"Solution\",\"flip\",\"flip\",\"flip\",\"flip\"]\n[[2,3],[],[],[],[]]\n输出: [null,[0,1],[1,2],[1,0],[1,1]]\n示例 2：\n输入: \n[\"Solution\",\"flip\",\"flip\",\"reset\",\"flip\"]\n[[1,2],[],[],[],[]]\n输出: [null,[0,0],[0,1],null,[0,0]]\n输入语法解释：\n输入包含两个列表：被调用的子程序和他们的参数。Solution 的构造函数有两个参数，分别为 n_rows 和 n_cols。flip 和 reset 没有参数，参数总会以列表形式给出，哪怕该列表为空
 * <p>
 * acceptance: 35.1%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class RandomFlipMatrix {
    public RandomFlipMatrix(int n_rows, int n_cols) {

    }

    public int[] flip() {
        return null;
    }

    public void reset() {
    }
}

/*
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(n_rows, n_cols);
 * int[] param_1 = obj.flip();
 * obj.reset();
 */
