package com.ragku.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {

    @Test
    public void twoSum() {
        TwoSum twoSum = new TwoSum();
        int[] expect = new int[]{0, 1};
        int[] actual = twoSum.twoSum(new int[]{1, 3, 5, 7}, 4);
        assertArrayEquals(expect, actual);
    }
}