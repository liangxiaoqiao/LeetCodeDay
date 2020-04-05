package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 194
 * title: Transpose File
 * href: https://leetcode.com/problems/transpose-file
 * desc: Given a text file file.txt, transpose its content.\nYou may assume that each row has the same number of columns and each field is separated by the \' \' character.\nExample:\nIf file.txt has the following content:\nname age\nalice 21\nryan 30\nOutput the following:\nname alice ryan\nage 21 30\n
 * <p>
 * 中文
 * 序号: 194
 * 标题： 转置文件
 * 链接： https://leetcode-cn.com/problems/transpose-file
 * 描述： 给定一个文件 file.txt，转置它的内容。\n你可以假设每行列数相同，并且每个字段由 \' \' 分隔.\n示例:\n假设 file.txt 文件内容如下：\nname age\nalice 21\nryan 30\n应当输出：\nname alice ryan\nage 21 30
 * <p>
 * acceptance: 23.8%
 * difficulty: Medium
 * private: False
 * <p>
 * bash
 */


//TODO init
//# Read from the file file.txt and print its transposed content to stdout.