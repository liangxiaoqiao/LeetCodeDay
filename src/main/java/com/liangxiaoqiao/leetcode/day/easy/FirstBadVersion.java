package com.liangxiaoqiao.leetcode.day.easy;


/*
 * English
 * id: 278
 * title: First Bad Version
 * href: https://leetcode.com/problems/first-bad-version
 * desc: You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
 * You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
 * Example:
 * Given n = 5, and version = 4 is the first bad version.
 * <p>
 * call isBadVersion(3) -> false
 * call isBadVersion(5) -> true
 * call isBadVersion(4) -> true
 * <p>
 * Then 4 is the first bad version.
 * <p>
 * 中文
 * 序号: 278
 * 标题： 第一个错误的版本
 * 链接： https://leetcode-cn.com/problems/first-bad-version
 * 描述： 你是产品经理，目前正在带领一个团队开发新的产品。不幸的是，你的产品的最新版本没有通过质量检测。由于每个版本都是基于之前的版本开发的，所以错误的版本之后的所有版本都是错的。\n假设你有 n 个版本 [1, 2, ..., n]，你想找出导致之后所有版本出错的第一个错误的版本。\n你可以通过调用 bool isBadVersion(version) 接口来判断版本号 version 是否在单元测试中出错。实现一个函数来查找第一个错误的版本。你应该尽量减少对调用 API 的次数。\n示例:\n给定 n = 5，并且 version = 4 是第一个错误的版本。\n\n调用 isBadVersion(3) -> false\n调用 isBadVersion(5) -> true\n调用 isBadVersion(4) -> true\n\n所以，4 是第一个错误的版本。
 * <p>
 * acceptance: 32.4%
 * difficulty: Easy
 * private: False
 */


//TODO init
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
public class FirstBadVersion extends VersionControl {

    public int firstBadVersion(int n) {
        return 0;
    }
}

//TODO
class VersionControl{
    //boolean isBadVersion(int version){}
}
