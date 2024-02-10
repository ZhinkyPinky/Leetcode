class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result;
        int sum = l1.val + l2.val;

        if (l1.next != null || l2.next != null) {
            if (sum >= 10) {
                result = new ListNode(sum - 10);

                if (l1.next == null) {
                    result.next = addTwoNumbers(new ListNode(), l2.next);
                } else if (l2.next == null) {
                    result.next = addTwoNumbers(l1.next, new ListNode());
                } else {
                    result.next = addTwoNumbers(l1.next, l2.next);
                }

            } else {
                result = new ListNode(sum);
                if (l1.next == null) {
                    result.next = addTwoNumbers(new ListNode(), l2.next);
                } else if (l2.next == null) {
                    result.next = addTwoNumbers(l1.next, new ListNode());
                } else {
                    result.next = addTwoNumbers(l1.next, l2.next);
                }
            }

            return result;
        }

        if (sum >= 10) {
            result = new ListNode(sum - 10);
            result.next = new ListNode(1);
            return result;
        } else {
            return new ListNode(sum);
        }
    }

    public ListNode addTwoNumbersTwo(ListNode l1, ListNode l2) {
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

