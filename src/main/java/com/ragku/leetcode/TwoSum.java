package com.ragku.leetcode;

/**
 * @author tony
 */
public class TwoSum {

    public int[] twoSum(int[] arrays, int target) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[i] + arrays[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
