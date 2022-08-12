package com.totoro.数据结构.list链表;

/**
 * @Description: 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 *
 * @author: zhaoyan
 * @Date: 2022/07/31 18:52
 */
public class ReverseList206 {
    public static void main(String[] args) {
        ListNode head = ListNode.getListNode1();
        System.out.println(head);
        reverseList(head);
    }

    /**
     * 思路1：多加一个头指针：tmpHead
     *
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {
        ListNode tmpHead = new ListNode();
        tmpHead.next = null;
        ListNode p = head;
        while (p != null) {
            ListNode q = p;
            p = p.next;
            q.next = tmpHead.next;
            tmpHead.next = q;
        }
        System.out.println(tmpHead.next.toString());
        return tmpHead.next;
    }
}
