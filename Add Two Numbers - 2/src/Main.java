public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        printResult(solution.addTwoNumbersTwo(l1, l2));
        System.out.println();

        l1 = new ListNode();
        l2 = new ListNode();

        printResult(solution.addTwoNumbersTwo(l1, l2));
        System.out.println();

        l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(9);
        l1.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next.next = new ListNode(9);

        l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);

        printResult(solution.addTwoNumbersTwo(l1, l2));
    }

    private static void printResult(ListNode result) {
        System.out.print(result.val);

        if (result.next != null) {
            printResult(result.next);
        }
    }
}
