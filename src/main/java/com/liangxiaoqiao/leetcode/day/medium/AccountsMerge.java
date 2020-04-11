package com.liangxiaoqiao.leetcode.day.medium;


import java.util.*;
import java.util.stream.Collectors;
    
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
 * 描述： 给定一个列表 accounts，每个元素 accounts[i] 是一个字符串列表，其中第一个元素 accounts[i][0] 是 名称 (name)，其余元素是 emails 表示该帐户的邮箱地址。

现在，我们想合并这些帐户。如果两个帐户都有一些共同的邮件地址，则两个帐户必定属于同一个人。请注意，即使两个帐户具有相同的名称，它们也可能属于不同的人，因为人们可能具有相同的名称。一个人最初可以拥有任意数量的帐户，但其所有帐户都具有相同的名称。

合并帐户后，按以下格式返回帐户：每个帐户的第一个元素是名称，其余元素是按顺序排列的邮箱地址。accounts 本身可以以任意顺序返回。

例子 1:

Input:
accounts = [["John", "johnsmith@mail.com", "john00@mail.com"], ["John", "johnnybravo@mail.com"], ["John", "johnsmith@mail.com", "john_newyork@mail.com"], ["Mary", "mary@mail.com"]]
Output: [["John", 'john00@mail.com', 'john_newyork@mail.com', 'johnsmith@mail.com'],  ["John", "johnnybravo@mail.com"], ["Mary", "mary@mail.com"]]
Explanation:
  第一个和第三个 John 是同一个人，因为他们有共同的电子邮件 "johnsmith@mail.com"。
  第二个 John 和 Mary 是不同的人，因为他们的电子邮件地址没有被其他帐户使用。
  我们可以以任何顺序返回这些列表，例如答案[['Mary'，'mary@mail.com']，['John'，'johnnybravo@mail.com']，
  ['John'，'john00@mail.com'，'john_newyork@mail.com'，'johnsmith@mail.com']]仍然会被接受。

注意：

accounts的长度将在[1，1000]的范围内。
accounts[i]的长度将在[1，10]的范围内。
accounts[i][j]的长度将在[1，30]的范围内。
 * <p>
 * acceptance: 44.6%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class AccountsMerge {

    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        List<User> users = toUsers(accounts);
        Map<String, List<User>> resultMap = users.stream().collect(Collectors.groupingBy(u -> u.name));
        List<List<String>> resultList = new ArrayList<>();
        resultMap.values().forEach(s -> resultList.addAll(toList(s)));

        return resultList;
    }

    private List<User> toUsers(List<List<String>> accounts) {
        return accounts.stream().map(account -> {
            String name = account.get(0);
            Set<String> emails = new HashSet<>(account.subList(1, account.size()));
            return new User(name, emails);
        }).collect(Collectors.toList());
    }

    private List<List<String>> toList(List<User> userList) {
        if (userList.size() == 1) {
            List<List<String>> temp = new ArrayList<>();
            temp.add(userList.get(0).userToStringList());
            return temp;
        }

        return mergeUsers(userList);
    }

    private List<List<String>> mergeUsers(List<User> userList) {
        Set<Integer> usedIndex = new HashSet<>();
        List<User> list = new ArrayList<>();
        for (int i = 0; i < userList.size(); i++) {
            User first = userList.get(i);

            if (usedIndex.contains(i)) {
                continue;
            }
            for (int j = i + 1; j < userList.size() && !usedIndex.contains(j); j++) {
                User second = userList.get(j);
                HashSet<String> tempSet = new HashSet<>();
                tempSet.addAll(first.emails);
                tempSet.addAll(second.emails);
                if (tempSet.size() != first.emails.size() + second.emails.size()) {
                    usedIndex.add(j);
                    first.emails = tempSet;
                }
            }
            list.add(first);
        }
        return list.stream().map(User::userToStringList).collect(Collectors.toList());
    }

    class User {
        public String name;
        public Set<String> emails;

        public User(String name, Set<String> emails) {
            this.name = name;
            this.emails = emails;
        }

        public List<String> userToStringList() {
            List<String> list = new ArrayList<>();
            list.add(name);
            list.addAll(emails);
            return list;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", emails=" + emails +
                    '}';
        }
    }
}

