package com.liangxiaoqiao.leetcode.day.hard;


/*
 * English
 * id: 920
 * title: Number of Music Playlists
 * href: https://leetcode.com/problems/number-of-music-playlists
 * desc: Your music player contains N different songs and she wants to listen to L (not necessarily different) songs during your trip.  You create a playlist so that:\nEvery song is played at least once\nA song can only be played again only if K other songs have been played\nReturn the number of possible playlists.  As the answer can be very large, return it modulo 10^9 + 7.\n  Example 1:\nInput: N = 3, L = 3, K = 1\nOutput: 6\nExplanation: There are 6 possible playlists. [1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1].\nExample 2:\nInput: N = 2, L = 3, K = 0\nOutput: 6\nExplanation: There are 6 possible playlists. [1, 1, 2], [1, 2, 1], [2, 1, 1], [2, 2, 1], [2, 1, 2], [1, 2, 2]\nExample 3:\nInput: N = 2, L = 3, K = 1\nOutput: 2\nExplanation: There are 2 possible playlists. [1, 2, 1], [2, 1, 2]\n  Note:\n0 <= K < N <= L <= 100
 * <p>
 * 中文
 * 序号: 920
 * 标题： 播放列表的数量
 * 链接： https://leetcode-cn.com/problems/number-of-music-playlists
 * 描述： 你的音乐播放器里有 N 首不同的歌，在旅途中，你的旅伴想要听 L 首歌（不一定不同，即，允许歌曲重复）。请你为她按如下规则创建一个播放列表：\n每首歌至少播放一次。\n一首歌只有在其他 K 首歌播放完之后才能再次播放。\n返回可以满足要求的播放列表的数量。由于答案可能非常大，请返回它模 10^9 + 7 的结果。\n  示例 1：\n输入：N = 3, L = 3, K = 1\n输出：6\n解释：有 6 种可能的播放列表。[1, 2, 3]，[1, 3, 2]，[2, 1, 3]，[2, 3, 1]，[3, 1, 2]，[3, 2, 1].\n示例 2：\n输入：N = 2, L = 3, K = 0\n输出：6\n解释：有 6 种可能的播放列表。[1, 1, 2]，[1, 2, 1]，[2, 1, 1]，[2, 2, 1]，[2, 1, 2]，[1, 2, 2]\n示例 3：\n输入：N = 2, L = 3, K = 1\n输出：2\n解释：有 2 种可能的播放列表。[1, 2, 1]，[2, 1, 2]\n  提示：\n0 <= K < N <= L <= 100
 * <p>
 * acceptance: 45.0%
 * difficulty: Hard
 * private: False
 */


//TODO init
public class NumberOfMusicPlaylists {
    public int numMusicPlaylists(int N, int L, int K) {
        return 0;
    }
}