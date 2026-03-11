package AddTwoNumbers;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        ListNode tmpCurrent = listNode;
        int numToMoveLeft = 0;

        // fix later -> missing last value :d
        while (l1 != null || l2 != null){
            int l1value = (l1 != null) ? l1.val : 0;
            int l2value = (l2 != null) ? l2.val : 0;
            int addedNum = l1value + l2value + numToMoveLeft;

            int rightDigit = addedNum % 10;
            int leftDigit = addedNum / 10;
            numToMoveLeft = leftDigit;


            tmpCurrent.next = new ListNode(rightDigit);
            tmpCurrent = tmpCurrent.next;

            if (l1 != null){
                l1 = l1.next;
            }
            if (l2 != null){
                l2 = l2.next;

            }
        }

        return listNode.next;
    }

    public static void main(String[] args) {
        ListNode listNode1 =
                new ListNode(2,
                        new ListNode(4,
                                new ListNode(3)));

        ListNode listNode2 =
                new ListNode(5,
                        new ListNode(6,
                                new ListNode(4)));

        //

        ListNode listNode3 = new ListNode(0);
        ListNode listNode4 = new ListNode(0);

        //

        ListNode listNode5 =
                new ListNode(9,
                new ListNode(9,
                new ListNode(9,
                new ListNode(9,
                new ListNode(9,
                new ListNode(9,
                new ListNode(9)
        ))))));
        ListNode listNode6 =
                new ListNode(9,
                new ListNode(9,
                new ListNode(9,
                new ListNode(9)
        )));

        ListNode solution = new Solution().addTwoNumbers(listNode5, listNode6);
        while (true){
            System.out.print(solution.val +" ");
            if (solution.next != null){
                solution = solution.next;
                continue;
            }
            break;
        }
    }
}
