package com.ragku.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthOfLongestSubstringTest {

    @Test
    public void lengthOfLongestSubstring() {
        LengthOfLongestSubstring lengthOfLongestSubstring = new LengthOfLongestSubstring();
        long time = System.currentTimeMillis();
        int length = lengthOfLongestSubstring.lengthOfLongestSubstring("123");
        System.out.println(System.currentTimeMillis() - time);
        assertEquals(length, 3);
    }
}