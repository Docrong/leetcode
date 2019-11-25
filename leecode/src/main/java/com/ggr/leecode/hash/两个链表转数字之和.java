package com.ggr.leecode.hash;


/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class 两个链表转数字之和 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode t = addTwoNumbers(l1, l2);

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        String str1 = "";
        String str2 = "";
        while (l1 != null) {
            str1 += String.valueOf(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            str2 += String.valueOf(l2.val);
            l2 = l2.next;
        }
        String total = String.valueOf(Integer.parseInt(str1) + Integer.parseInt(str2));
        char[] chararrs = total.toCharArray();

        ListNode curr=new ListNode(0);
        for (int i = 0; i < chararrs.length; i++) {
            curr.setVal(Integer.parseInt(String.valueOf(chararrs[i])));
        }

        result = new ListNode(Integer.parseInt(String.valueOf(chararrs[0])));
        result.next = new ListNode(Integer.parseInt(String.valueOf(chararrs[1])));
        result.next.next = new ListNode(Integer.parseInt(String.valueOf(chararrs[2])));

        for (int i = 0; i < chararrs.length; i++) {

        }

        System.out.println(result.val);
        return result;
    }

    /**
     * ListNode
     */
    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }
    }
}

