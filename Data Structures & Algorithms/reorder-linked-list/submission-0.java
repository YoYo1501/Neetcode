/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
   public static void reorderList(ListNode head) {

        /*
         B1: Chia đôi thành 2 Linked List, tìm điểm giữa
         B2: Đảo Linked List 2 lại
         B3: Trộn Linked List 1 và Linked List 2
        */

        if (head == null || head.next == null) {
            return;
        }

        // B1: Tìm điểm giữa
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }


        // B2: Đảo Linked List 2
        ListNode cur = slow.next;
        slow.next = null;

        ListNode prev = null;

        while (cur != null) {

            ListNode nextTemp = cur.next;

            cur.next = prev;

            prev = cur;
            cur = nextTemp;
        }


        // B3: Trộn 2 Linked List
        ListNode first = head;
        ListNode second = prev;

        while (second != null) {

            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }
}
