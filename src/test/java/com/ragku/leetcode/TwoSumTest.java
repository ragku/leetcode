package com.ragku.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest {

    @Test
    public void twoSum() {
        TwoSum twoSum = new TwoSum();
        int[] expect = new int[]{0, 1};
        int[] actual = twoSum.twoSum(new int[]{1, 3, 5, 7}, 4);
        assertArrayEquals(expect, actual);
    }

    @Test
    public void twoSum2() {
        TwoSum twoSum = new TwoSum();
        TwoSum.ListNode node1 = TwoSum.getListNode(5);
        TwoSum.ListNode node2 = TwoSum.getListNode(5);
        TwoSum.ListNode result = twoSum.twoSum(node1, node2);
        int step = 1;
        int value = 0;
        while (null != result) {
            value += result.getVal() * step;
            step *= 10;
            result = result.getNext();
        }
        System.out.println(value);
    }
}