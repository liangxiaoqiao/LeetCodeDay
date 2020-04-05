package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 165
 * title: Compare Version Numbers
 * href: https://leetcode.com/problems/compare-version-numbers
 * desc: Compare two version numbers version1 and version2.\nIf version1 > version2 return 1; if version1 < version2 return -1;otherwise return 0.\nYou may assume that the version strings are non-empty and contain only digits and the . character.\nThe . character does not represent a decimal point and is used to separate number sequences.\nFor instance, 2.5 is not \"two and a half\" or \"half way to version three\", it is the fifth second-level revision of the second first-level revision.\nYou may assume the default revision number for each level of a version number to be 0. For example, version number 3.4 has a revision number of 3 and 4 for its first and second level revision number. Its third and fourth level revision number are both 0.\n  Example 1:\nInput: version1 = \"0.1\", version2 = \"1.1\"\nOutput: -1\nExample 2:\nInput: version1 = \"1.0.1\", version2 = \"1\"\nOutput: 1\nExample 3:\nInput: version1 = \"7.5.2.4\", version2 = \"7.5.3\"\nOutput: -1\nExample 4:\nInput: version1 = \"1.01\", version2 = \"1.001\"\nOutput: 0\nExplanation: Ignoring leading zeroes, both “01” and “001\" represent the same number “1”\nExample 5:\nInput: version1 = \"1.0\", version2 = \"1.0.0\"\nOutput: 0\nExplanation: The first version number does not have a third level revision number, which means its third level revision number is default to \"0\"\n  Note:\nVersion strings are composed of numeric strings separated by dots . and this numeric strings may have leading zeroes.\nVersion strings do not start or end with dots, and they will not be two consecutive dots.
 * <p>
 * 中文
 * 序号: 165
 * 标题： 比较版本号
 * 链接： https://leetcode-cn.com/problems/compare-version-numbers
 * 描述： 比较两个版本号 version1 和 version2。\n如果 version1 > version2 返回 1，如果 version1 < version2 返回 -1， 除此之外返回 0。\n你可以假设版本字符串非空，并且只包含数字和 . 字符。\n . 字符不代表小数点，而是用于分隔数字序列。\n例如，2.5 不是“两个半”，也不是“差一半到三”，而是第二版中的第五个小版本。\n你可以假设版本号的每一级的默认修订版号为 0。例如，版本号 3.4 的第一级（大版本）和第二级（小版本）修订号分别为 3 和 4。其第三级和第四级修订号均为 0。\n  示例 1:\n输入: version1 = \"0.1\", version2 = \"1.1\"\n输出: -1\n示例 2:\n输入: version1 = \"1.0.1\", version2 = \"1\"\n输出: 1\n示例 3:\n输入: version1 = \"7.5.2.4\", version2 = \"7.5.3\"\n输出: -1\n示例 4：\n输入：version1 = \"1.01\", version2 = \"1.001\"\n输出：0\n解释：忽略前导零，“01” 和 “001” 表示相同的数字 “1”。\n示例 5：\n输入：version1 = \"1.0\", version2 = \"1.0.0\"\n输出：0\n解释：version1 没有第三级修订号，这意味着它的第三级修订号默认为 “0”。\n  提示：\n版本字符串由以点 （.） 分隔的数字字符串组成。这个数字字符串可能有前导零。\n版本字符串不以点开始或结束，并且其中不会有两个连续的点。
 * <p>
 * acceptance: 25.5%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        return 0;
    }
}