package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 913
 * title: Cat and Mouse
 * href: https://leetcode.com/problems/cat-and-mouse
 * desc: A game on an undirected graph is played by two players, Mouse and Cat, who alternate turns.\nThe graph is given as follows: graph[a] is a list of all nodes b such that ab is an edge of the graph.\nMouse starts at node 1 and goes first, Cat starts at node 2 and goes second, and there is a Hole at node 0.\nDuring each player\'s turn, they must travel along one edge of the graph that meets where they are.  For example, if the Mouse is at node 1, it must travel to any node in graph[1].\nAdditionally, it is not allowed for the Cat to travel to the Hole (node 0.)\nThen, the game can end in 3 ways:\nIf ever the Cat occupies the same node as the Mouse, the Cat wins.\nIf ever the Mouse reaches the Hole, the Mouse wins.\nIf ever a position is repeated (ie. the players are in the same position as a previous turn, and it is the same player\'s turn to move), the game is a draw.\nGiven a graph, and assuming both players play optimally, return 1 if the game is won by Mouse, 2 if the game is won by Cat, and 0 if the game is a draw.\n  Example 1:\nInput: [[2,5],[3],[0,4,5],[1,4,5],[2,3],[0,2,3]]\nOutput: 0\nExplanation:\n4---3---1\n|   |\n2---5\n \\ /\n  0\n  Note:\n3 <= graph.length <= 50\nIt is guaranteed that graph[1] is non-empty.\nIt is guaranteed that graph[2] contains a non-zero element.
 * <p>
 * 中文
 * 序号: 913
 * 标题： 猫和老鼠
 * 链接： https://leetcode-cn.com/problems/cat-and-mouse
 * 描述： 两个玩家分别扮演猫（Cat）和老鼠（Mouse）在无向图上进行游戏，他们轮流行动。\n该图按下述规则给出：graph[a] 是所有结点 b 的列表，使得 ab 是图的一条边。\n老鼠从结点 1 开始并率先出发，猫从结点 2 开始且随后出发，在结点 0 处有一个洞。\n在每个玩家的回合中，他们必须沿着与他们所在位置相吻合的图的一条边移动。例如，如果老鼠位于结点 1，那么它只能移动到 graph[1] 中的（任何）结点去。\n此外，猫无法移动到洞（结点 0）里。\n然后，游戏在出现以下三种情形之一时结束：\n如果猫和老鼠占据相同的结点，猫获胜。\n如果老鼠躲入洞里，老鼠获胜。\n如果某一位置重复出现（即，玩家们的位置和移动顺序都与上一个回合相同），游戏平局。\n给定 graph，并假设两个玩家都以最佳状态参与游戏，如果老鼠获胜，则返回 1；如果猫获胜，则返回 2；如果平局，则返回 0。\n  示例：\n输入：[[2,5],[3],[0,4,5],[1,4,5],[2,3],[0,2,3]]\n输出：0\n解释：\n4---3---1\n|   |\n2---5\n \\ /\n  0\n  提示：\n3 <= graph.length <= 200\n保证 graph[1] 非空。\n保证 graph[2] 包含非零元素。
 * <p>
 * acceptance: 30.0%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class CatAndMouse {
    public int catMouseGame(int[][] graph) {
        return 0;
    }
}