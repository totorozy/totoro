package com.totoro.数据结构.list链表;

import java.util.List;

/**
 * @Description:
 * @author: zhaoyan
 * @Date: 2022/07/31 18:51
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    // 1,2,6,3,4,5,6
    public static ListNode getListNode1() {
        ListNode h = new ListNode(6);
        ListNode g = new ListNode(5, h);
        ListNode f = new ListNode(4, g);
        ListNode d = new ListNode(3, f);
        ListNode c = new ListNode(6, d);
        ListNode b = new ListNode(2, c);
        ListNode a = new ListNode(1, b);
        return a;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
