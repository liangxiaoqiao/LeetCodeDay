package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 777
 * title: Swap Adjacent in LR String
 * href: https://leetcode.com/problems/swap-adjacent-in-lr-string
 * desc: In a string composed of \'L\', \'R\', and \'X\' characters, like \"RXXLRXRXL\", a move consists of either replacing one occurrence of \"XL\" with \"LX\", or replacing one occurrence of \"RX\" with \"XR\". Given the starting string start and the ending string end, return True if and only if there exists a sequence of moves to transform one string to the other.\nExample:\nInput: start = \"RXXLRXRXL\", end = \"XRLXXRRLX\"\nOutput: True\nExplanation:\nWe can transform start to end following these steps:\nRXXLRXRXL ->\nXRXLRXRXL ->\nXRLXRXRXL ->\nXRLXXRRXL ->\nXRLXXRRLX\nNote:\n1 <= len(start) = len(end) <= 10000.\nBoth start and end will only consist of characters in {\'L\', \'R\', \'X\'}.
 * <p>
 * 中文
 * 序号: 777
 * 标题： 在LR字符串中交换相邻字符
 * 链接： https://leetcode-cn.com/problems/swap-adjacent-in-lr-string
 * 描述： 在一个由 \'L\' , \'R\' 和 \'X\' 三个字符组成的字符串（例如\"RXXLRXRXL\"）中进行移动操作。一次移动操作指用一个\"LX\"替换一个\"XL\"，或者用一个\"XR\"替换一个\"RX\"。现给定起始字符串start和结束字符串end，请编写代码，当且仅当存在一系列移动操作使得start可以转换成end时， 返回True。\n示例 :\n输入: start = \"RXXLRXRXL\", end = \"XRLXXRRLX\"\n输出: True\n解释:\n我们可以通过以下几步将start转换成end:\nRXXLRXRXL ->\nXRXLRXRXL ->\nXRLXRXRXL ->\nXRLXXRRXL ->\nXRLXXRRLX\n注意:\n1 <= len(start) = len(end) <= 10000。\nstart和end中的字符串仅限于\'L\', \'R\'和\'X\'。
 * <p>
 * acceptance: 34.3%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class SwapAdjacentInLrString {
    public boolean canTransform(String start, String end) {
        return false;
    }
}