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

    public static TwoSum.ListNode getListNode(int... vars) {
        TwoSum.ListNode node = new TwoSum.ListNode(vars[0]);
        TwoSum.ListNode tmp = node;
        for (int i = 1; i < vars.length; i++) {
            TwoSum.ListNode newNode = new TwoSum.ListNode(vars[i]);
            tmp.setNext(newNode);
            tmp = tmp.getNext();
        }
        return node;
    }

    public ListNode twoSum(ListNode node1, ListNode node2) {
        ListNode result = null, tmp = null;
        int carry = 0;
        do {
            if (null == node1 && null == node2) {
                break;
            }
            int add = carry;
            if (null != node1) {
                add += node1.val;
                node1 = node1.next;
            }

            if (null != node2) {
                add += node2.val;
                node2 = node2.next;
            }

            if (null == tmp) {
                result = tmp = new ListNode(add % 10);
            } else {
                tmp.next = new ListNode(add % 10);
                tmp = tmp.next;
            }
            carry = add / 10;

        } while (true);
        if (carry > 0) {
            tmp.next = new ListNode(carry);
            tmp = tmp.next;
        }
        return result;
    }

    public static class ListNode {
        private int val;
        private ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode getNext() {
            return this.next;
        }

        public void setNext(ListNode node) {
            this.next = node;
        }

        public int getVal() {
            return val;
        }
    }
}
