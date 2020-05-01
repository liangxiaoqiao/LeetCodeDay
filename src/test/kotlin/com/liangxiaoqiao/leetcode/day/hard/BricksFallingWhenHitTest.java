package com.liangxiaoqiao.leetcode.day.hard;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BricksFallingWhenHitTest {

    BricksFallingWhenHit target = new BricksFallingWhenHit();

    @Test
    void testHit() {
        int[][] left = {{1, 0, 0, 0}, {1, 1, 1, 0}};
        int[][] right = {{1, 0}};
        int[] result = target.hitBricks(left, right);
        assertEquals(1, result.length);
        assertEquals(2, result[0]);
    }

    @Test
    void testHit2() {
        int[][] left = {{1, 0, 0, 0}, {1, 1, 0, 0}};
        int[][] right = {{1, 1}, {1, 0}};
        int[] result = target.hitBricks(left, right);
        assertEquals(2, result.length);
        assertEquals(0, result[0]);
        assertEquals(0, result[1]);
    }

    @Test
    void testHit3() {
        int[][] left = {{1}, {1}, {1}, {1}, {1}};
        int[][] right = {{3, 0}, {4, 0}, {1, 0}, {2, 0}, {0, 0}};
        int[] result = target.hitBricks(left, right);
        int[] expect = {1, 0, 1, 0, 0};
        assertEquals(Arrays.toString(expect), Arrays.toString(result));
    }

    @Test
    void testHit4() {
        int[][] left = {{0, 1, 1, 1, 1, 1}
                , {1, 1, 1, 1, 1, 1}
                , {0, 0, 1, 0, 0, 0}
                , {0, 0, 0, 0, 0, 0}
                , {0, 0, 0, 0, 0, 0}};
        int[][] right = {{1, 3}, {3, 5}, {0, 3}, {3, 3}, {1, 1}, {4, 2}, {1, 0}, {3, 0}, {4, 5}
                , {2, 1}, {4, 4}, {4, 0}, {2, 4}, {2, 5}, {3, 4}, {0, 5}, {0, 4}, {3, 2}, {1, 5}, {4, 1}, {2, 2}, {0, 2}};
        int[] expect = {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 1};
        int[] result = target.hitBricks(left, right);
        assertEquals(Arrays.toString(expect), Arrays.toString(result));
    }

    @Test
    void testHit5() {
        int[][] left = {{0, 0, 1, 0, 0, 0}
                , {1, 1, 1, 1, 1, 1}
                , {1, 1, 1, 1, 1, 1}
                , {1, 0, 0, 0, 1, 1}
                , {1, 1, 1, 1, 1, 1}};
        int[][] right = {{1, 0}, {1, 2}};
        int[] expect = {0, 19};
        int[] result = target.hitBricks(left, right);
        assertEquals(Arrays.toString(expect), Arrays.toString(result));
    }
}