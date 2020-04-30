package com.liangxiaoqiao.leetcode.day.easy

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class BuddyStringsTest {

    private val target = BuddyStrings()

    @Test
    fun testBuddyStrings() {
        assertTrue(target.buddyStrings("ab", "ba"))
        assertFalse(target.buddyStrings("ab", "ab"))
        assertTrue(target.buddyStrings("aa", "aa"))
        assertTrue(target.buddyStrings("aaaaaaabc", "aaaaaaacb"))
        assertFalse(target.buddyStrings("", "aa"))
        assertFalse(target.buddyStrings("abcaa", "abcbb"))
    }
}