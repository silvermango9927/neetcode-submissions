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
    public ListNode add(ListNode l1, ListNode l2, int carry) {
            if (l1 == null && l2 == null && carry == 0) {
                return null;
            }
            int v1= 0;
            int v2 = 0;
            if(l1 != null) {
                v1 = l1.val;
            }
            if(l2 != null) {
                v2 = l2.val;
            }

            int sum = v1 + v2 + carry;
            int newc = sum / 10;
            int node = sum % 10;

            ListNode next = add(
                (l1 != null) ? l1.next : null,
                (l2 != null) ? l2.next : null,
                newc
            );

            return new ListNode(node, next);
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // int val;
        // int carry = 0;
        // if(l1 == null) return l2;
        // if(l2 == null) return l1;
        // val = l1.val + l2.val;
        // if(val > 10) {
        //     val = val - 10;
        //     carry = 1;
        //     l1 = new ListNode(l1.next.val + 1, l1.next.next);
        // }
        // return new ListNode(val, addTwoNumbers(l1.next, l2.next));


        

        return add(l1, l2, 0);

    }
}
