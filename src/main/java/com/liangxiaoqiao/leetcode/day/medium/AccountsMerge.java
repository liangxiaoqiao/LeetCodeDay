package com.liangxiaoqiao.leetcode.day.medium;


import java.util.List;
    
/*
 * English
 * id: 721
 * title: Accounts Merge
 * href: https://leetcode.com/problems/accounts-merge
 * desc: Given a list accounts, each element accounts[i] is a list of strings, where the first element accounts[i][0] is a name, and the rest of the elements are emails representing emails of the account.\nNow, we would like to merge these accounts. Two accounts definitely belong to the same person if there is some email that is common to both accounts. Note that even if two accounts have the same name, they may belong to different people as people could have the same name. A person can have any number of accounts initially, but all of their accounts definitely have the same name.\nAfter merging the accounts, return the accounts in the following format: the first element of each account is the name, and the rest of the elements are emails in sorted order. The accounts themselves can be returned in any order.\nExample 1:\nInput: \naccounts = [[\"John\", \"johnsmith@mail.com\", \"john00@mail.com\"], [\"John\", \"johnnybravo@mail.com\"], [\"John\", \"johnsmith@mail.com\", \"john_newyork@mail.com\"], [\"Mary\", \"mary@mail.com\"]]\nOutput: [[\"John\", \'john00@mail.com\', \'john_newyork@mail.com\', \'johnsmith@mail.com\'],  [\"John\", \"johnnybravo@mail.com\"], [\"Mary\", \"mary@mail.com\"]]\nExplanation: \nThe first and third John\'s are the same person as they have the common email \"johnsmith@mail.com\".\nThe second John and Mary are different people as none of their email addresses are used by other accounts.\nWe could return these lists in any order, for example the answer [[\'Mary\', \'mary@mail.com\'], [\'John\', \'johnnybravo@mail.com\'], \n[\'John\', \'john00@mail.com\', \'john_newyork@mail.com\', \'johnsmith@mail.com\']] would still be accepted.\nNote:\nThe length of accounts will be in the range [1, 1000].\nThe length of accounts[i] will be in the range [1, 10].\nThe length of accounts[i][j] will be in the range [1, 30].
 * <p>
 * 中文
 * 序号: 721
 * 标题： 账户合并
 * 链接： https://leetcode-cn.com/problems/accounts-merge
 * 描述： 给定一个列表 accounts，每个元素 accounts[i] 是一个字符串列表，其中第一个元素 accounts[i][0] 是 名称 (name)，其余元素是 emails 表示该帐户的邮箱地址。\n现在，我们想合并这些帐户。如果两个帐户都有一些共同的邮件地址，则两个帐户必定属于同一个人。请注意，即使两个帐户具有相同的名称，它们也可能属于不同的人，因为人们可能具有相同的名称。一个人最初可以拥有任意数量的帐户，但其所有帐户都具有相同的名称。\n合并帐户后，按以下格式返回帐户：每个帐户的第一个元素是名称，其余元素是按顺序排列的邮箱地址。accounts 本身可以以任意顺序返回。\n例子 1:\nInput: \naccounts = [[\"John\", \"johnsmith@mail.com\", \"john00@mail.com\"], [\"John\", \"johnnybravo@mail.com\"], [\"John\", \"johnsmith@mail.com\", \"john_newyork@mail.com\"], [\"Mary\", \"mary@mail.com\"]]\nOutput: [[\"John\", \'john00@mail.com\', \'john_newyork@mail.com\', \'johnsmith@mail.com\'],  [\"John\", \"johnnybravo@mail.com\"], [\"Mary\", \"mary@mail.com\"]]\nExplanation: \n  第一个和第三个 John 是同一个人，因为他们有共同的电子邮件 \"johnsmith@mail.com\"。 \n  第二个 John 和 Mary 是不同的人，因为他们的电子邮件地址没有被其他帐户使用。\n  我们可以以任何顺序返回这些列表，例如答案[[\'Mary\'，\'mary@mail.com\']，[\'John\'，\'johnnybravo@mail.com\']，\n  [\'John\'，\'john00@mail.com\'，\'john_newyork@mail.com\'，\'johnsmith@mail.com\']]仍然会被接受。\n注意：\naccounts的长度将在[1，1000]的范围内。\naccounts[i]的长度将在[1，10]的范围内。\naccounts[i][j]的长度将在[1，30]的范围内。
 * <p>
 * acceptance: 44.6%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class AccountsMerge {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        return null;
    }
}

