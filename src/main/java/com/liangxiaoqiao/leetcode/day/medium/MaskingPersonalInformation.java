package com.liangxiaoqiao.leetcode.day.medium;


/*
 * English
 * id: 831
 * title: Masking Personal Information
 * href: https://leetcode.com/problems/masking-personal-information
 * desc: We are given a personal information string S, which may represent either an email address or a phone number.\nWe would like to mask this personal information according to the following rules:\n\n1. Email address:\nWe define a name to be a string of length ≥ 2 consisting of only lowercase letters a-z or uppercase letters A-Z.\nAn email address starts with a name, followed by the symbol \'@\', followed by a name, followed by the dot \'.\' and followed by a name. \nAll email addresses are guaranteed to be valid and in the format of \"name1@name2.name3\".\nTo mask an email, all names must be converted to lowercase and all letters between the first and last letter of the first name must be replaced by 5 asterisks \'*\'.\n\n2. Phone number:\nA phone number is a string consisting of only the digits 0-9 or the characters from the set {\'+\', \'-\', \'(\', \')\', \' \'}. You may assume a phone number contains 10 to 13 digits.\nThe last 10 digits make up the local number, while the digits before those make up the country code. Note that the country code is optional. We want to expose only the last 4 digits and mask all other digits.\nThe local number should be formatted and masked as \"***-***-1111\", where 1 represents the exposed digits.\nTo mask a phone number with country code like \"+111 111 111 1111\", we write it in the form \"+***-***-***-1111\".  The \'+\' sign and the first \'-\' sign before the local number should only exist if there is a country code.  For example, a 12 digit phone number mask should start with \"+**-\".\nNote that extraneous characters like \"(\", \")\", \" \", as well as extra dashes or plus signs not part of the above formatting scheme should be removed.\n  Return the correct \"mask\" of the information provided.\n  Example 1:\nInput: \"LeetCode@LeetCode.com\"\nOutput: \"l*****e@leetcode.com\"\nExplanation: All names are converted to lowercase, and the letters between the\n             first and last letter of the first name is replaced by 5 asterisks.\n             Therefore, \"leetcode\" -> \"l*****e\".\nExample 2:\nInput: \"AB@qq.com\"\nOutput: \"a*****b@qq.com\"\nExplanation: There must be 5 asterisks between the first and last letter \n             of the first name \"ab\". Therefore, \"ab\" -> \"a*****b\".\nExample 3:\nInput: \"1(234)567-890\"\nOutput: \"***-***-7890\"\nExplanation: 10 digits in the phone number, which means all digits make up the local number.\nExample 4:\nInput: \"86-(10)12345678\"\nOutput: \"+**-***-***-5678\"\nExplanation: 12 digits, 2 digits for country code and 10 digits for local number. \nNotes:\nS.length <= 40.\nEmails have length at least 8.\nPhone numbers have length at least 10.
 * <p>
 * 中文
 * 序号: 831
 * 标题： 隐藏个人信息
 * 链接： https://leetcode-cn.com/problems/masking-personal-information
 * 描述： 给你一条个人信息 string S，它可能是一个邮箱地址，也可能是一个电话号码。\n我们将隐藏它的隐私信息，通过如下规则:\n1. 电子邮箱\n定义名称 <name> 的长度大于2，并且只包含小写字母 a-z 和大写字母 A-Z。\n电子邮箱地址由名称 <name> 开头，紧接着是符号 \'@\'，后面接着一个名称 <name>，再接着一个点号 \'.\'，然后是一个名称 <name>。\n电子邮箱地址确定为有效的，并且格式是\"name1@name2.name3\"。\n为了隐藏电子邮箱，所有的名称 <name> 必须被转换成小写的，并且第一个名称 <name> 的第一个字母和最后一个字母的中间的所有字母由 5 个 \'*\' 代替。\n2. 电话号码\n电话号码是一串包括数组 0-9，以及 {\'+\', \'-\', \'(\', \')\', \' \'} 这几个字符的字符串。你可以假设电话号码包含 10 到 13 个数字。\n电话号码的最后 10 个数字组成本地号码，在这之前的数字组成国际号码。注意，国际号码是可选的。我们只暴露最后 4 个数字并隐藏所有其他数字。\n本地号码是有格式的，并且如 \"***-***-1111\" 这样显示，这里的 1 表示暴露的数字。\n为了隐藏有国际号码的电话号码，像 \"+111 111 111 1111\"，我们以 \"+***-***-***-1111\" 的格式来显示。在本地号码前面的 \'+\' 号和第一个 \'-\' 号仅当电话号码中包含国际号码时存在。例如，一个 12 位的电话号码应当以 \"+**-\" 开头进行显示。\n注意：像 \"(\"，\")\"，\" \" 这样的不相干的字符以及不符合上述格式的额外的减号或者加号都应当被删除。\n  最后，将提供的信息正确隐藏后返回。\n  示例 1：\n输入: \"LeetCode@LeetCode.com\"\n输出: \"l*****e@leetcode.com\"\n解释： \n所有的名称转换成小写, 第一个名称的第一个字符和最后一个字符中间由 5 个星号代替。\n因此，\"leetcode\" -> \"l*****e\"。\n示例 2：\n输入: \"AB@qq.com\"\n输出: \"a*****b@qq.com\"\n解释: \n第一个名称\"ab\"的第一个字符和最后一个字符的中间必须有 5 个星号\n因此，\"ab\" -> \"a*****b\"。\n示例 3：\n输入: \"1(234)567-890\"\n输出: \"***-***-7890\"\n解释: \n10 个数字的电话号码，那意味着所有的数字都是本地号码。\n示例 4：\n输入: \"86-(10)12345678\"\n输出: \"+**-***-***-5678\"\n解释: \n12 位数字，2 个数字是国际号码另外 10 个数字是本地号码 。\n注意:\nS.length <= 40。\n邮箱的长度至少是 8。\n电话号码的长度至少是 10。
 * <p>
 * acceptance: 42.9%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class MaskingPersonalInformation {
    public String maskPII(String S) {
        return null;
    }
}