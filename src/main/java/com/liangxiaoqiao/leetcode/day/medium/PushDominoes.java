package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 838
 * title: Push Dominoes
 * href: https://leetcode.com/problems/push-dominoes
 * desc: There are N dominoes in a line, and we place each domino vertically upright.\nIn the beginning, we simultaneously push some of the dominoes either to the left or to the right.\nAfter each second, each domino that is falling to the left pushes the adjacent domino on the left.\nSimilarly, the dominoes falling to the right push their adjacent dominoes standing on the right.\nWhen a vertical domino has dominoes falling on it from both sides, it stays still due to the balance of the forces.\nFor the purposes of this question, we will consider that a falling domino expends no additional force to a falling or already fallen domino.\nGiven a string \"S\" representing the initial state. S[i] = \'L\', if the i-th domino has been pushed to the left; S[i] = \'R\', if the i-th domino has been pushed to the right; S[i] = \'.\', if the i-th domino has not been pushed.\nReturn a string representing the final state. \nExample 1:\nInput: \".L.R...LR..L..\"\nOutput: \"LL.RR.LLRRLL..\"\nExample 2:\nInput: \"RR.L\"\nOutput: \"RR.L\"\nExplanation: The first domino expends no additional force on the second domino.\nNote:\n0 <= N <= 10^5\nString dominoes contains only \'L\', \'R\' and \'.\'
 * <p>
 * 中文
 * 序号: 838
 * 标题： 推多米诺
 * 链接： https://leetcode-cn.com/problems/push-dominoes
 * 描述： 一行中有 N 张多米诺骨牌，我们将每张多米诺骨牌垂直竖立。\n在开始时，我们同时把一些多米诺骨牌向左或向右推。\n每过一秒，倒向左边的多米诺骨牌会推动其左侧相邻的多米诺骨牌。\n同样地，倒向右边的多米诺骨牌也会推动竖立在其右侧的相邻多米诺骨牌。\n如果同时有多米诺骨牌落在一张垂直竖立的多米诺骨牌的两边，由于受力平衡， 该骨牌仍然保持不变。\n就这个问题而言，我们会认为正在下降的多米诺骨牌不会对其它正在下降或已经下降的多米诺骨牌施加额外的力。\n给定表示初始状态的字符串 \"S\" 。如果第 i 张多米诺骨牌被推向左边，则 S[i] = \'L\'；如果第 i 张多米诺骨牌被推向右边，则 S[i] = \'R\'；如果第 i 张多米诺骨牌没有被推动，则 S[i] = \'.\'。\n返回表示最终状态的字符串。\n示例 1：\n输入：\".L.R...LR..L..\"\n输出：\"LL.RR.LLRRLL..\"\n示例 2：\n输入：\"RR.L\"\n输出：\"RR.L\"\n说明：第一张多米诺骨牌没有给第二张施加额外的力。\n提示：\n0 <= N <= 10^5\n表示多米诺骨牌状态的字符串只含有 \'L\'，\'R\'; 以及 \'.\';
 * <p>
 * acceptance: 46.4%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class PushDominoes {
    public String pushDominoes(String dominoes) {
        return null;
    }
}