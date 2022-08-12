package com.totoro.数据结构.list链表;

/**
 * @Description:
 * 给你一个链表的头节点 head 和一个整数 val ，
 * 请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
 *
 * 输入：head = [1,2,6,3,4,5,6], val = 6 输出：[1,2,3,4,5]
 *
 * @author: zhaoyan
 * @Date: 2022/07/31 18:52
 */
public class RemoveElements203 {
    public static void main(String[] args) {
        ListNode head = ListNode.getListNode1();
        System.out.println(head);
        head = removeElements(head, 6);

    }

    /**
     * 思路：记录前一个指针per，当前指针一直向前移动
     *
     * @param head
     * @param val
     * @return
     */
    public static ListNode removeElements(ListNode head, int val) {
        ListNode tmpHead = new ListNode();
        tmpHead.next = head;
        ListNode pre = tmpHead;
        ListNode cur = head;
        while (cur != null) {
            if(cur.val == val) {
                pre.next = cur.next;
            } else {
                pre = pre.next;
            }
            cur = cur.next; // 当前指针一直移动，前一个指针看情况移动
        }
        //System.out.println(tmpHead.next.toString());
        return tmpHead.next;
    }
}
