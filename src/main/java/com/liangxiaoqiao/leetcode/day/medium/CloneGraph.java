package com.liangxiaoqiao.leetcode.day.medium;

import java.util.ArrayList;
import java.util.List;

/*
 * English
 * id: 133
 * title: Clone Graph
 * href: https://leetcode.com/problems/clone-graph
 * desc: Given a reference of a node in a connected undirected graph, return a deep copy (clone) of the graph. Each node in the graph contains a val (int) and a list (List[Node]) of its neighbors.\n  Example:\nInput:\n{\"$id\":\"1\",\"neighbors\":[{\"$id\":\"2\",\"neighbors\":[{\"$ref\":\"1\"},{\"$id\":\"3\",\"neighbors\":[{\"$ref\":\"2\"},{\"$id\":\"4\",\"neighbors\":[{\"$ref\":\"3\"},{\"$ref\":\"1\"}],\"val\":4}],\"val\":3}],\"val\":2},{\"$ref\":\"4\"}],\"val\":1}\n\nExplanation:\nNode 1\'s value is 1, and it has two neighbors: Node 2 and 4.\nNode 2\'s value is 2, and it has two neighbors: Node 1 and 3.\nNode 3\'s value is 3, and it has two neighbors: Node 2 and 4.\nNode 4\'s value is 4, and it has two neighbors: Node 1 and 3.\n  Note:\nThe number of nodes will be between 1 and 100.\nThe undirected graph is a simple graph, which means no repeated edges and no self-loops in the graph.\nSince the graph is undirected, if node p has node q as neighbor, then node q must have node p as neighbor too.\nYou must return the copy of the given node as a reference to the cloned graph.
 * <p>
 * 中文
 * 序号: 133
 * 标题： 克隆图
 * 链接： https://leetcode-cn.com/problems/clone-graph
 * 描述： 给定无向连通图中一个节点的引用，返回该图的深拷贝（克隆）。图中的每个节点都包含它的值 val（Int） 和其邻居的列表（list[Node]）。
 * 示例：
 * 输入：
 * {"$id":"1","neighbors":[{"$id":"2","neighbors":[{"$ref":"1"},{"$id":"3","neighbors":[{"$ref":"2"},{"$id":"4","neighbors":[{"$ref":"3"},{"$ref":"1"}],"val":4}],"val":3}],"val":2},{"$ref":"4"}],"val":1}
 * <p>
 * 解释：
 * 节点 1 的值是 1，它有两个邻居：节点 2 和 4 。
 * 节点 2 的值是 2，它有两个邻居：节点 1 和 3 。
 * 节点 3 的值是 3，它有两个邻居：节点 2 和 4 。
 * 节点 4 的值是 4，它有两个邻居：节点 1 和 3 。
 * 提示：
 * 节点数介于 1 到 100 之间。
 * 无向图是一个简单图，这意味着图中没有重复的边，也没有自环。
 * 由于图是无向的，如果节点 p 是节点 q 的邻居，那么节点 q 也必须是节点 p 的邻居。
 * 必须将给定节点的拷贝作为对克隆图的引用返回。
 * <p>
 * acceptance: 30.5%
 * difficulty: Medium
 * private: False
 */


//TODO init
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/
public class CloneGraph {
    public Node cloneGraph(Node node) {
        return null;
    }


    private class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
}

