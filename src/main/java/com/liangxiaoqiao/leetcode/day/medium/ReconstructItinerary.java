package com.liangxiaoqiao.leetcode.day.medium;


import java.util.List;
    
/*
 * English
 * id: 332
 * title: Reconstruct Itinerary
 * href: https://leetcode.com/problems/reconstruct-itinerary
 * desc: Given a list of airline tickets represented by pairs of departure and arrival airports [from, to], reconstruct the itinerary in order. All of the tickets belong to a man who departs from JFK. Thus, the itinerary must begin with JFK.\nNote:\nIf there are multiple valid itineraries, you should return the itinerary that has the smallest lexical order when read as a single string. For example, the itinerary [\"JFK\", \"LGA\"] has a smaller lexical order than [\"JFK\", \"LGB\"].\nAll airports are represented by three capital letters (IATA code).\nYou may assume all tickets form at least one valid itinerary.\nExample 1:\nInput: [[\"MUC\", \"LHR\"], [\"JFK\", \"MUC\"], [\"SFO\", \"SJC\"], [\"LHR\", \"SFO\"]]\nOutput: [\"JFK\", \"MUC\", \"LHR\", \"SFO\", \"SJC\"]\nExample 2:\nInput: [[\"JFK\",\"SFO\"],[\"JFK\",\"ATL\"],[\"SFO\",\"ATL\"],[\"ATL\",\"JFK\"],[\"ATL\",\"SFO\"]]\nOutput: [\"JFK\",\"ATL\",\"JFK\",\"SFO\",\"ATL\",\"SFO\"]\nExplanation: Another possible reconstruction is [\"JFK\",\"SFO\",\"ATL\",\"JFK\",\"ATL\",\"SFO\"].\n             But it is larger in lexical order.
 * <p>
 * 中文
 * 序号: 332
 * 标题： 重新安排行程
 * 链接： https://leetcode-cn.com/problems/reconstruct-itinerary
 * 描述： 给定一个机票的字符串二维数组 [from, to]，子数组中的两个成员分别表示飞机出发和降落的机场地点，对该行程进行重新规划排序。所有这些机票都属于一个从JFK（肯尼迪国际机场）出发的先生，所以该行程必须从 JFK 出发。\n说明:\n如果存在多种有效的行程，你可以按字符自然排序返回最小的行程组合。例如，行程 [\"JFK\", \"LGA\"] 与 [\"JFK\", \"LGB\"] 相比就更小，排序更靠前\n所有的机场都用三个大写字母表示（机场代码）。\n假定所有机票至少存在一种合理的行程。\n示例 1:\n输入: [[\"MUC\", \"LHR\"], [\"JFK\", \"MUC\"], [\"SFO\", \"SJC\"], [\"LHR\", \"SFO\"]]\n输出: [\"JFK\", \"MUC\", \"LHR\", \"SFO\", \"SJC\"]\n示例 2:\n输入: [[\"JFK\",\"SFO\"],[\"JFK\",\"ATL\"],[\"SFO\",\"ATL\"],[\"ATL\",\"JFK\"],[\"ATL\",\"SFO\"]]\n输出: [\"JFK\",\"ATL\",\"JFK\",\"SFO\",\"ATL\",\"SFO\"]\n解释: 另一种有效的行程是 [\"JFK\",\"SFO\",\"ATL\",\"JFK\",\"ATL\",\"SFO\"]。但是它自然排序更大更靠后。
 * <p>
 * acceptance: 33.6%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class ReconstructItinerary {
    public List<String> findItinerary(String[][] tickets) {
        return null;
    }
}

