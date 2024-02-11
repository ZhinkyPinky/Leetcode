class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode resultLast = result;

        int sum = 0;
        while (l1 != null || l2 != null || sum != 0) {
            sum += l1 != null ? l1.val : 0;
            sum += l2 != null ? l2.val : 0;
            resultLast.next = new ListNode(sum % 10);
            resultLast = resultLast.next;
            sum /= 10;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }

        return result.next;
    }
}

