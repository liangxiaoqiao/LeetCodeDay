package com.liangxiaoqiao.leetcode.day.medium;


import java.util.List;
    

/*
 * English
 * id: 841
 * title: Keys and Rooms
 * href: https://leetcode.com/problems/keys-and-rooms
 * desc: There are N rooms and you start in room 0.  Each room has a distinct number in 0, 1, 2, ..., N-1, and each room may have some keys to access the next room. \nFormally, each room i has a list of keys rooms[i], and each key rooms[i][j] is an integer in [0, 1, ..., N-1] where N = rooms.length.  A key rooms[i][j] = v opens the room with number v.\nInitially, all the rooms start locked (except for room 0). \nYou can walk back and forth between rooms freely.\nReturn true if and only if you can enter every room.\nExample 1:\nInput: [[1],[2],[3],[]]\nOutput: true\nExplanation:  \nWe start in room 0, and pick up key 1.\nWe then go to room 1, and pick up key 2.\nWe then go to room 2, and pick up key 3.\nWe then go to room 3.  Since we were able to go to every room, we return true.\nExample 2:\nInput: [[1,3],[3,0,1],[2],[0]]\nOutput: false\nExplanation: We can\'t enter the room with number 2.\nNote:\n1 <= rooms.length <= 1000\n0 <= rooms[i].length <= 1000\nThe number of keys in all rooms combined is at most 3000.
 * <p>
 * 中文
 * 序号: 841
 * 标题： 钥匙和房间
 * 链接： https://leetcode-cn.com/problems/keys-and-rooms
 * 描述： 有 N 个房间，开始时你位于 0 号房间。每个房间有不同的号码：0，1，2，...，N-1，并且房间里可能有一些钥匙能使你进入下一个房间。\n在形式上，对于每个房间 i 都有一个钥匙列表 rooms[i]，每个钥匙 rooms[i][j] 由 [0,1，...，N-1] 中的一个整数表示，其中 N = rooms.length。 钥匙 rooms[i][j] = v 可以打开编号为 v 的房间。\n最初，除 0 号房间外的其余所有房间都被锁住。\n你可以自由地在房间之间来回走动。\n如果能进入每个房间返回 true，否则返回 false。\n示例 1：\n输入: [[1],[2],[3],[]]\n输出: true\n解释:  \n我们从 0 号房间开始，拿到钥匙 1。\n之后我们去 1 号房间，拿到钥匙 2。\n然后我们去 2 号房间，拿到钥匙 3。\n最后我们去了 3 号房间。\n由于我们能够进入每个房间，我们返回 true。\n示例 2：\n输入：[[1,3],[3,0,1],[2],[0]]\n输出：false\n解释：我们不能进入 2 号房间。\n提示：\n1 <= rooms.length <= 1000\n0 <= rooms[i].length <= 1000\n所有房间中的钥匙数量总计不超过 3000。
 * <p>
 * acceptance: 62.2%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        return false;
    }
}