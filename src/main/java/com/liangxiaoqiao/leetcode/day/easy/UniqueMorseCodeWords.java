package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 804
 * title: Unique Morse Code Words
 * href: https://leetcode.com/problems/unique-morse-code-words
 * desc: International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: \"a\" maps to \".-\", \"b\" maps to \"-...\", \"c\" maps to \"-.-.\", and so on.\nFor convenience, the full table for the 26 letters of the English alphabet is given below:\n[\".-\",\"-...\",\"-.-.\",\"-..\",\".\",\"..-.\",\"--.\",\"....\",\"..\",\".---\",\"-.-\",\".-..\",\"--\",\"-.\",\"---\",\".--.\",\"--.-\",\".-.\",\"...\",\"-\",\"..-\",\"...-\",\".--\",\"-..-\",\"-.--\",\"--..\"]\nNow, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, \"cba\" can be written as \"-.-..--...\", (which is the concatenation \"-.-.\" + \"-...\" + \".-\"). We\'ll call such a concatenation, the transformation of a word.\nReturn the number of different transformations among all words we have.\nExample:\nInput: words = [\"gin\", \"zen\", \"gig\", \"msg\"]\nOutput: 2\nExplanation: \nThe transformation of each word is:\n\"gin\" -> \"--...-.\"\n\"zen\" -> \"--...-.\"\n\"gig\" -> \"--...--.\"\n\"msg\" -> \"--...--.\"\n\nThere are 2 different transformations, \"--...-.\" and \"--...--.\".\nNote:\nThe length of words will be at most 100.\nEach words[i] will have length in range [1, 12].\nwords[i] will only consist of lowercase letters.
 * <p>
 * 中文
 * 序号: 804
 * 标题： 唯一摩尔斯密码词
 * 链接： https://leetcode-cn.com/problems/unique-morse-code-words
 * 描述： 国际摩尔斯密码定义一种标准编码方式，将每个字母对应于一个由一系列点和短线组成的字符串， 比如: \"a\" 对应 \".-\", \"b\" 对应 \"-...\", \"c\" 对应 \"-.-.\", 等等。\n为了方便，所有26个英文字母对应摩尔斯密码表如下：\n[\".-\",\"-...\",\"-.-.\",\"-..\",\".\",\"..-.\",\"--.\",\"....\",\"..\",\".---\",\"-.-\",\".-..\",\"--\",\"-.\",\"---\",\".--.\",\"--.-\",\".-.\",\"...\",\"-\",\"..-\",\"...-\",\".--\",\"-..-\",\"-.--\",\"--..\"]\n给定一个单词列表，每个单词可以写成每个字母对应摩尔斯密码的组合。例如，\"cab\" 可以写成 \"-.-..--...\"，(即 \"-.-.\" + \"-...\" + \".-\"字符串的结合)。我们将这样一个连接过程称作单词翻译。\n返回我们可以获得所有词不同单词翻译的数量。\n例如:\n输入: words = [\"gin\", \"zen\", \"gig\", \"msg\"]\n输出: 2\n解释: \n各单词翻译如下:\n\"gin\" -> \"--...-.\"\n\"zen\" -> \"--...-.\"\n\"gig\" -> \"--...--.\"\n\"msg\" -> \"--...--.\"\n\n共有 2 种不同翻译, \"--...-.\" 和 \"--...--.\".\n  注意:\n单词列表words 的长度不会超过 100。\n每个单词 words[i]的长度范围为 [1, 12]。\n每个单词 words[i]只包含小写字母。
 * <p>
 * acceptance: 75.7%
 * difficulty: Easy
 * private: False
 */


//TODO init
public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        return 0;
    }
}