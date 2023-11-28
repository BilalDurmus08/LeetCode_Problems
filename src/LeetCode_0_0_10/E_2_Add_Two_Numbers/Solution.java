package LeetCode_0_0_10.E_2_Add_Two_Numbers;

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int upper = 0;

        while (l1 != null || l2 != null || upper == 1) {
            int sum = 0;
            if (l1 != null) {
                sum = sum + l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum = sum + l2.val;
                l2 = l2.next;
            }
            sum = sum + upper;
            upper = sum /10;

            ListNode node = new ListNode(sum % 10);
            current.next = node;
            current = current.next;
        }
        return dummy.next;

    }
}
