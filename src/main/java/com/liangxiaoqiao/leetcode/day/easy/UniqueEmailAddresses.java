package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 929
 * title: Unique Email Addresses
 * href: https://leetcode.com/problems/unique-email-addresses
 * desc: Every email consists of a local name and a domain name, separated by the @ sign.\nFor example, in alice@leetcode.com, alice is the local name, and leetcode.com is the domain name.\nBesides lowercase letters, these emails may contain \'.\'s or \'+\'s.\nIf you add periods (\'.\') between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name.  For example, \"alice.z@leetcode.com\" and \"alicez@leetcode.com\" forward to the same email address.  (Note that this rule does not apply for domain names.)\nIf you add a plus (\'+\') in the local name, everything after the first plus sign will be ignored. This allows certain emails to be filtered, for example m.y+name@email.com will be forwarded to my@email.com.  (Again, this rule does not apply for domain names.)\nIt is possible to use both of these rules at the same time.\nGiven a list of emails, we send one email to each address in the list.  How many different addresses actually receive mails? \n  Example 1:\nInput: [\"test.email+alex@leetcode.com\",\"test.e.mail+bob.cathy@leetcode.com\",\"testemail+david@lee.tcode.com\"]\nOutput: 2\nExplanation: \"testemail@leetcode.com\" and \"testemail@lee.tcode.com\" actually receive mails\n  Note:\n1 <= emails[i].length <= 100\n1 <= emails.length <= 100\nEach emails[i] contains exactly one \'@\' character.
 * <p>
 * 中文
 * 序号: 929
 * 标题： 独特的电子邮件地址
 * 链接： https://leetcode-cn.com/problems/unique-email-addresses
 * 描述： 每封电子邮件都由一个本地名称和一个域名组成，以 @ 符号分隔。\n例如，在 alice@leetcode.com中， alice 是本地名称，而 leetcode.com 是域名。\n除了小写字母，这些电子邮件还可能包含 \'.\' 或 \'+\'。\n如果在电子邮件地址的本地名称部分中的某些字符之间添加句点（\'.\'），则发往那里的邮件将会转发到本地名称中没有点的同一地址。例如，\"alice.z@leetcode.com” 和 “alicez@leetcode.com” 会转发到同一电子邮件地址。 （请注意，此规则不适用于域名。）\n如果在本地名称中添加加号（\'+\'），则会忽略第一个加号后面的所有内容。这允许过滤某些电子邮件，例如 m.y+name@email.com 将转发到 my@email.com。 （同样，此规则不适用于域名。）\n可以同时使用这两个规则。\n给定电子邮件列表 emails，我们会向列表中的每个地址发送一封电子邮件。实际收到邮件的不同地址有多少？\n  示例：\n输入：[\"test.email+alex@leetcode.com\",\"test.e.mail+bob.cathy@leetcode.com\",\"testemail+david@lee.tcode.com\"]\n输出：2\n解释：实际收到邮件的是 \"testemail@leetcode.com\" 和 \"testemail@lee.tcode.com\"。\n  提示：\n1 <= emails[i].length <= 100\n1 <= emails.length <= 100\n每封 emails[i] 都包含有且仅有一个 \'@\' 字符。
 * <p>
 * acceptance: 67.9%
 * difficulty: Easy
 * private: False
 */


//TODO init
public class UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        return 0;
    }
}