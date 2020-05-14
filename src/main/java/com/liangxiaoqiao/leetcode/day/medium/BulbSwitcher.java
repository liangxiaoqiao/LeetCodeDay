package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 319
 * title: Bulb Switcher
 * href: https://leetcode.com/problems/bulb-switcher
 * desc: There are n bulbs that are initially off. You first turn on all the bulbs. Then, you turn off every second bulb. On the third round, you toggle every third bulb (turning on if it\'s off or turning off if it\'s on). For the i-th round, you toggle every i bulb. For the n-th round, you only toggle the last bulb. Find how many bulbs are on after n rounds.\nExample:\nInput: 3\nOutput: 1 \nExplanation: \nAt first, the three bulbs are [off, off, off].\nAfter first round, the three bulbs are [on, on, on].\nAfter second round, the three bulbs are [on, off, on].\nAfter third round, the three bulbs are [on, off, off]. \n\nSo you should return 1, because there is only one bulb is on.
 * <p>
 * 中文
 * 序号: 319
 * 标题： 灯泡开关
 * 链接： https://leetcode-cn.com/problems/bulb-switcher
 * 描述： 初始时有 n 个灯泡关闭。 第 1 轮，你打开所有的灯泡。 第 2 轮，每两个灯泡你关闭一次。 第 3 轮，每三个灯泡切换一次开关（如果关闭则开启，如果开启则关闭）。第 i 轮，每 i 个灯泡切换一次开关。 对于第 n 轮，你只切换最后一个灯泡的开关。 找出 n 轮后有多少个亮着的灯泡。\n示例:\n输入: 3\n输出: 1 \n解释: \n初始时, 灯泡状态 [关闭, 关闭, 关闭].\n第一轮后, 灯泡状态 [开启, 开启, 开启].\n第二轮后, 灯泡状态 [开启, 关闭, 开启].\n第三轮后, 灯泡状态 [开启, 关闭, 关闭]. \n\n你应该返回 1，因为只有一个灯泡还亮着。
 * <p>
 * acceptance: 44.8%
 * difficulty: Medium
 * private: False
 */

public class BulbSwitcher {
    //sqrt
    public int bulbSwitch(int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (calc(i + 1)) {
                count++;
            }
        }
        return count;
    }

    private boolean calc(int position) {
        boolean flag = false;
        int i = 1;
        while (i <= position) {
            if (position % i == 0) {
                flag = !flag;
            }
            i++;
        }
        return flag;
    }
}