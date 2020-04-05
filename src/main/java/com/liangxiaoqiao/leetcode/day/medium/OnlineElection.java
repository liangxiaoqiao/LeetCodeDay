package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 911
 * title: Online Election
 * href: https://leetcode.com/problems/online-election
 * desc: In an election, the i-th vote was cast for persons[i] at time times[i].\nNow, we would like to implement the following query function: TopVotedCandidate.q(int t) will return the number of the person that was leading the election at time t.  \nVotes cast at time t will count towards our query.  In the case of a tie, the most recent vote (among tied candidates) wins.\n  Example 1:\nInput: [\"TopVotedCandidate\",\"q\",\"q\",\"q\",\"q\",\"q\",\"q\"], [[[0,1,1,0,0,1,0],[0,5,10,15,20,25,30]],[3],[12],[25],[15],[24],[8]]\nOutput: [null,0,1,1,0,0,1]\nExplanation: \nAt time 3, the votes are [0], and 0 is leading.\nAt time 12, the votes are [0,1,1], and 1 is leading.\nAt time 25, the votes are [0,1,1,0,0,1], and 1 is leading (as ties go to the most recent vote.)\nThis continues for 3 more queries at time 15, 24, and 8.\n  Note:\n1 <= persons.length = times.length <= 5000\n0 <= persons[i] <= persons.length\ntimes is a strictly increasing array with all elements in [0, 10^9].\nTopVotedCandidate.q is called at most 10000 times per test case.\nTopVotedCandidate.q(int t) is always called with t >= times[0].
 * <p>
 * 中文
 * 序号: 911
 * 标题： 在线选举
 * 链接： https://leetcode-cn.com/problems/online-election
 * 描述： 在选举中，第 i 张票是在时间为 times[i] 时投给 persons[i] 的。\n现在，我们想要实现下面的查询函数： TopVotedCandidate.q(int t) 将返回在 t 时刻主导选举的候选人的编号。\n在 t 时刻投出的选票也将被计入我们的查询之中。在平局的情况下，最近获得投票的候选人将会获胜。\n示例：\n输入：[\"TopVotedCandidate\",\"q\",\"q\",\"q\",\"q\",\"q\",\"q\"], [[[0,1,1,0,0,1,0],[0,5,10,15,20,25,30]],[3],[12],[25],[15],[24],[8]]\n输出：[null,0,1,1,0,0,1]\n解释：\n时间为 3，票数分布情况是 [0]，编号为 0 的候选人领先。\n时间为 12，票数分布情况是 [0,1,1]，编号为 1 的候选人领先。\n时间为 25，票数分布情况是 [0,1,1,0,0,1]，编号为 1 的候选人领先（因为最近的投票结果是平局）。\n在时间 15、24 和 8 处继续执行 3 个查询。\n  提示：\n1 <= persons.length = times.length <= 5000\n0 <= persons[i] <= persons.length\ntimes 是严格递增的数组，所有元素都在 [0, 10^9] 范围中。\n每个测试用例最多调用 10000 次 TopVotedCandidate.q。\nTopVotedCandidate.q(int t) 被调用时总是满足 t >= times[0]。
 * <p>
 * acceptance: 48.9%
 * difficulty: Medium
 * private: False
 */


//TODO init
class TopVotedCandidate {
    public TopVotedCandidate(int[] persons, int[] times) {
        
    }

    public int q(int t) {
        return 0;
    }
}

/*
 * Your TopVotedCandidate object will be instantiated and called as such:
 * TopVotedCandidate obj = new TopVotedCandidate(persons, times);
 * int param_1 = obj.q(t);
 */
