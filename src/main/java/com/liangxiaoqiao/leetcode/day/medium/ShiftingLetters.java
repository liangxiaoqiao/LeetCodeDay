package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 848
 * title: Shifting Letters
 * href: https://leetcode.com/problems/shifting-letters
 * desc: We have a string S of lowercase letters, and an integer array shifts.\nCall the shift of a letter, the next letter in the alphabet, (wrapping around so that \'z\' becomes \'a\'). \nFor example, shift(\'a\') = \'b\', shift(\'t\') = \'u\', and shift(\'z\') = \'a\'.\nNow for each shifts[i] = x, we want to shift the first i+1 letters of S, x times.\nReturn the final string after all such shifts to S are applied.\nExample 1:\nInput: S = \"abc\", shifts = [3,5,9]\nOutput: \"rpl\"\nExplanation: \nWe start with \"abc\".\nAfter shifting the first 1 letters of S by 3, we have \"dbc\".\nAfter shifting the first 2 letters of S by 5, we have \"igc\".\nAfter shifting the first 3 letters of S by 9, we have \"rpl\", the answer.\nNote:\n1 <= S.length = shifts.length <= 20000\n0 <= shifts[i] <= 10 ^ 9
 * <p>
 * 中文
 * 序号: 848
 * 标题： 字母移位
 * 链接： https://leetcode-cn.com/problems/shifting-letters
 * 描述： 有一个由小写字母组成的字符串 S，和一个整数数组 shifts。\n我们将字母表中的下一个字母称为原字母的 移位（由于字母表是环绕的， \'z\' 将会变成 \'a\'）。\n例如·，shift(\'a\') = \'b\'， shift(\'t\') = \'u\',， 以及 shift(\'z\') = \'a\'。\n对于每个 shifts[i] = x ， 我们会将 S 中的前 i+1 个字母移位 x 次。\n返回将所有这些移位都应用到 S 后最终得到的字符串。\n示例：\n输入：S = \"abc\", shifts = [3,5,9]\n输出：\"rpl\"\n解释： \n我们以 \"abc\" 开始。\n将 S 中的第 1 个字母移位 3 次后，我们得到 \"dbc\"。\n再将 S 中的前 2 个字母移位 5 次后，我们得到 \"igc\"。\n最后将 S 中的这 3 个字母移位 9 次后，我们得到答案 \"rpl\"。\n提示：\n1 <= S.length = shifts.length <= 20000\n0 <= shifts[i] <= 10 ^ 9
 * <p>
 * acceptance: 43.0%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class ShiftingLetters {
    public String shiftingLetters(String S, int[] shifts) {
        return null;
    }
}