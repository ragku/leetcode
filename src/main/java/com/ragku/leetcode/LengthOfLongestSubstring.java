package com.ragku.leetcode;

/**
 * 找出相邻最大不相同字符串长度
 * @author tony
 */
public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        if (null == s) {
            return 0;
        }
        if (s.length() <= 1) {
            return s.length();
        }
        int length = 0;
        int index = 0;
        do {
            int start = index, end = start, duxIndex = 0;
            if (length > s.length() - start) {
                break;
            }
            do {
                end++;
                if (end == s.length()) {
                    break;
                }
                duxIndex = getDuxIndex(s, start, end);
            } while (duxIndex == -1);
            if (end - start > length) {
                length = end - start;
            }
            if (end == s.length()) {
                break;
            }
            if (duxIndex >= 0) {
                index = duxIndex + 1;
            }
        } while (true);
        return length;
    }

    private int getDuxIndex(String s, int start, int end) {
        for (int i = start; i < end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return i;
                }
            }
        }
        return -1;
    }

}
