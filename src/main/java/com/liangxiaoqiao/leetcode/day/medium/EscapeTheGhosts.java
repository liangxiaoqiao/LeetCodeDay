package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 789
 * title: Escape The Ghosts
 * href: https://leetcode.com/problems/escape-the-ghosts
 * desc: You are playing a simplified Pacman game. You start at the point (0, 0), and your destination is (target[0], target[1]). There are several ghosts on the map, the i-th ghost starts at (ghosts[i][0], ghosts[i][1]).\nEach turn, you and all ghosts simultaneously *may* move in one of 4 cardinal directions: north, east, west, or south, going from the previous point to a new point 1 unit of distance away.\nYou escape if and only if you can reach the target before any ghost reaches you (for any given moves the ghosts may take.)  If you reach any square (including the target) at the same time as a ghost, it doesn\'t count as an escape.\nReturn True if and only if it is possible to escape.\nExample 1:\nInput: \nghosts = [[1, 0], [0, 3]]\ntarget = [0, 1]\nOutput: true\nExplanation: \nYou can directly reach the destination (0, 1) at time 1, while the ghosts located at (1, 0) or (0, 3) have no way to catch up with you.\nExample 2:\nInput: \nghosts = [[1, 0]]\ntarget = [2, 0]\nOutput: false\nExplanation: \nYou need to reach the destination (2, 0), but the ghost at (1, 0) lies between you and the destination.\nExample 3:\nInput: \nghosts = [[2, 0]]\ntarget = [1, 0]\nOutput: false\nExplanation: \nThe ghost can reach the target at the same time as you.\nNote:\nAll points have coordinates with absolute value <= 10000.\nThe number of ghosts will not exceed 100.
 * <p>
 * 中文
 * 序号: 789
 * 标题： 逃脱阻碍者
 * 链接： https://leetcode-cn.com/problems/escape-the-ghosts
 * 描述： 你在进行一个简化版的吃豆人游戏。你从 (0, 0) 点开始出发，你的目的地是 (target[0], target[1]) 。地图上有一些阻碍者，第 i 个阻碍者从 (ghosts[i][0], ghosts[i][1]) 出发。\n每一回合，你和阻碍者们*可以*同时向东，西，南，北四个方向移动，每次可以移动到距离原位置1个单位的新位置。\n如果你可以在任何阻碍者抓住你之前到达目的地（阻碍者可以采取任意行动方式），则被视为逃脱成功。如果你和阻碍者同时到达了一个位置（包括目的地）都不算是逃脱成功。\n当且仅当你有可能成功逃脱时，输出 True。\n示例 1:\n输入： \nghosts = [[1, 0], [0, 3]]\ntarget = [0, 1]\n输出：true\n解释：\n你可以直接一步到达目的地(0,1)，在(1, 0)或者(0, 3)位置的阻碍者都不可能抓住你。 \n示例 2:\n输入： \nghosts = [[1, 0]]\ntarget = [2, 0]\n输出：false\n解释：\n你需要走到位于(2, 0)的目的地，但是在(1, 0)的阻碍者位于你和目的地之间。 \n示例 3:\n输入： \nghosts = [[2, 0]]\ntarget = [1, 0]\n输出：false\n解释：\n阻碍者可以和你同时达到目的地。 \n说明：\n所有的点的坐标值的绝对值 <= 10000。\n阻碍者的数量不会超过 100。
 * <p>
 * acceptance: 56.3%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class EscapeTheGhosts {
    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        return false;
    }
}