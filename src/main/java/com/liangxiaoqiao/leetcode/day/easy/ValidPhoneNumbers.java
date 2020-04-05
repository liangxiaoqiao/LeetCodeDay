package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 193
 * title: Valid Phone Numbers
 * href: https://leetcode.com/problems/valid-phone-numbers
 * desc: Given a text file file.txt that contains list of phone numbers (one per line), write a one liner bash script to print all valid phone numbers.\nYou may assume that a valid phone number must appear in one of the following two formats: (xxx) xxx-xxxx or xxx-xxx-xxxx. (x means a digit)\nYou may also assume each line in the text file must not contain leading or trailing white spaces.\nExample:\nAssume that file.txt has the following content:\n987-123-4567\n123 456 7890\n(123) 456-7890\nYour script should output the following valid phone numbers:\n987-123-4567\n(123) 456-7890
 * <p>
 * 中文
 * 序号: 193
 * 标题： 有效电话号码
 * 链接： https://leetcode-cn.com/problems/valid-phone-numbers
 * 描述： 给定一个包含电话号码列表（一行一个电话号码）的文本文件 file.txt，写一个 bash 脚本输出所有有效的电话号码。\n你可以假设一个有效的电话号码必须满足以下两种格式： (xxx) xxx-xxxx 或 xxx-xxx-xxxx。（x 表示一个数字）\n你也可以假设每行前后没有多余的空格字符。\n示例:\n假设 file.txt 内容如下：\n987-123-4567\n123 456 7890\n(123) 456-7890\n你的脚本应当输出下列有效的电话号码：\n987-123-4567\n(123) 456-7890
 * <p>
 * acceptance: 25.4%
 * difficulty: Easy
 * private: False
 */


//TODO init
//# Read from the file file.txt and output all valid phone numbers to stdout.