package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 514
 * title: Freedom Trail
 * href: https://leetcode.com/problems/freedom-trail
 * desc: In the video game Fallout 4, the quest \"Road to Freedom\" requires players to reach a metal dial called the \"Freedom Trail Ring\", and use the dial to spell a specific keyword in order to open the door.\nGiven a string ring, which represents the code engraved on the outer ring and another string key, which represents the keyword needs to be spelled. You need to find the minimum number of steps in order to spell all the characters in the keyword.\nInitially, the first character of the ring is aligned at 12:00 direction. You need to spell all the characters in the string key one by one by rotating the ring clockwise or anticlockwise to make each character of the string key aligned at 12:00 direction and then by pressing the center button.\nAt the stage of rotating the ring to spell the key character key[i]:\nYou can rotate the ring clockwise or anticlockwise one place, which counts as 1 step. The final purpose of the rotation is to align one of the string ring\'s characters at the 12:00 direction, where this character must equal to the character key[i].\nIf the character key[i] has been aligned at the 12:00 direction, you need to press the center button to spell, which also counts as 1 step. After the pressing, you could begin to spell the next character in the key (next stage), otherwise, you\'ve finished all the spelling.\nExample:\n  Input: ring = \"godding\", key = \"gd\"\nOutput: 4\nExplanation:\nFor the first key character \'g\', since it is already in place, we just need 1 step to spell this character. \nFor the second key character \'d\', we need to rotate the ring \"godding\" anticlockwise by two steps to make it become \"ddinggo\".\nAlso, we need 1 more step for spelling.\nSo the final output is 4.\nNote:\nLength of both ring and key will be in range 1 to 100.\nThere are only lowercase letters in both strings and might be some duplcate characters in both strings.\nIt\'s guaranteed that string key could always be spelled by rotating the string ring.
 * <p>
 * 中文
 * 序号: 514
 * 标题： 自由之路
 * 链接： https://leetcode-cn.com/problems/freedom-trail
 * 描述： 视频游戏“辐射4”中，任务“通向自由”要求玩家到达名为“Freedom Trail Ring”的金属表盘，并使用表盘拼写特定关键词才能开门。\n给定一个字符串 ring，表示刻在外环上的编码；给定另一个字符串 key，表示需要拼写的关键词。您需要算出能够拼写关键词中所有字符的最少步数。\n最初，ring 的第一个字符与12:00方向对齐。您需要顺时针或逆时针旋转 ring 以使 key 的一个字符在 12:00 方向对齐，然后按下中心按钮，以此逐个拼写完 key 中的所有字符。\n旋转 ring 拼出 key 字符 key[i] 的阶段中：\n您可以将 ring 顺时针或逆时针旋转一个位置，计为1步。旋转的最终目的是将字符串 ring 的一个字符与 12:00 方向对齐，并且这个字符必须等于字符 key[i] 。\n如果字符 key[i] 已经对齐到12:00方向，您需要按下中心按钮进行拼写，这也将算作 1 步。按完之后，您可以开始拼写 key 的下一个字符（下一阶段）, 直至完成所有拼写。\n示例：\n    输入: ring = \"godding\", key = \"gd\"\n输出: 4\n解释:\n 对于 key 的第一个字符 \'g\'，已经在正确的位置, 我们只需要1步来拼写这个字符。 \n 对于 key 的第二个字符 \'d\'，我们需要逆时针旋转 ring \"godding\" 2步使它变成 \"ddinggo\"。\n 当然, 我们还需要1步进行拼写。\n 因此最终的输出是 4。\n提示：\nring 和 key 的字符串长度取值范围均为 1 至 100；\n两个字符串中都只有小写字符，并且均可能存在重复字符；\n字符串 key 一定可以由字符串 ring 旋转拼出。
 * <p>
 * acceptance: 41.6%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class FreedomTrail {
    public int findRotateSteps(String ring, String key) {
        return 0;
    }
}