public class Main {
    public static void main(String[] args) {
        ListNode inputListOne = buildListNode(new int[]{2, 4, 3});
        ListNode inputListTwo = buildListNode(new int[]{5, 6, 4});
        ListNode expectedResult = buildListNode(new int[]{7, 0, 8});

        System.out.println((testAddTwoNumbers(inputListOne, inputListTwo, expectedResult)));
        System.out.println();

        inputListOne = buildListNode(new int[]{0});
        inputListTwo = buildListNode(new int[]{0});
        expectedResult = buildListNode(new int[]{0});

        System.out.println((testAddTwoNumbers(inputListOne, inputListTwo, expectedResult)));
        System.out.println();

        inputListOne = buildListNode(new int[]{9, 9, 9, 9, 9, 9, 9});
        inputListTwo = buildListNode(new int[]{9, 9, 9, 9});
        expectedResult = buildListNode(new int[]{8, 9, 9, 9, 0, 0, 0, 1});

        System.out.println((testAddTwoNumbers(inputListOne, inputListTwo, expectedResult)));
        System.out.println();
    }

    private static ListNode buildListNode(int[] values) {
        ListNode head = new ListNode();
        ListNode tail = head;

        for (int value : values) {
            tail.next = new ListNode(value);
            tail = tail.next;
        }

        return head.next;
    }

    private static void printList(ListNode result) {
        System.out.print(result.val);

        if (result.next != null) {
            printList(result.next);
        }
    }

    private static boolean testAddTwoNumbers(ListNode inputListOne, ListNode inputListTwo, ListNode expectedResult) {
        Solution solution = new Solution();

        ListNode result = solution.addTwoNumbers(inputListOne, inputListTwo);

        printList(result);
        System.out.println();
        printList(expectedResult);
        System.out.println();

        while (result != null) {
            if (result.val != expectedResult.val) {
                return false;
            }

            result = result.next;
            expectedResult = expectedResult.next;
        }

        return true;
    }
}
