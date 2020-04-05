package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 893
 * title: None
 * href: None
 * desc: None
 * <p>
 * 中文
 * 序号: 893
 * 标题： 特殊等价字符串组
 * 链接： https://leetcode-cn.com/problems/groups-of-special-equivalent-strings
 * 描述： 你将得到一个字符串数组 A。\n如果经过任意次数的移动，S == T，那么两个字符串 S 和 T 是特殊等价的。\n  一次移动包括选择两个索引 i 和 j，且 i％2 == j％2，并且交换 S[j] 和 S [i]。\n现在规定，A 中的特殊等价字符串组是 A 的非空子集 S，这样不在 S 中的任何字符串与 S 中的任何字符串都不是特殊等价的。\n  返回 A 中特殊等价字符串组的数量。\n  示例 1：\n输入：[\"a\",\"b\",\"c\",\"a\",\"c\",\"c\"]\n输出：3\n解释：3 组 [\"a\",\"a\"]，[\"b\"]，[\"c\",\"c\",\"c\"]\n示例 2：\n输入：[\"aa\",\"bb\",\"ab\",\"ba\"]\n输出：4\n解释：4 组 [\"aa\"]，[\"bb\"]，[\"ab\"]，[\"ba\"]\n示例 3：\n输入：[\"abc\",\"acb\",\"bac\",\"bca\",\"cab\",\"cba\"]\n输出：3\n解释：3 组 [\"abc\",\"cba\"]，[\"acb\",\"bca\"]，[\"bac\",\"cab\"]\n示例 4：\n输入：[\"abcd\",\"cdab\",\"adcb\",\"cbad\"]\n输出：1\n解释：1 组 [\"abcd\",\"cdab\",\"adcb\",\"cbad\"]\n  提示：\n1 <= A.length <= 1000\n1 <= A[i].length <= 20\n所有 A[i] 都具有相同的长度。\n所有 A[i] 都只由小写字母组成。
 * <p>
 * acceptance: 65.1%
 * difficulty: Easy
 * private: False
 */


//TODO init
public class GroupsOfSpecialEquivalentStrings {
    public int numSpecialEquivGroups(String[] A) {
        return 0;
    }
}