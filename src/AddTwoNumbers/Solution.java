package AddTwoNumbers;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        ListNode tmpCurrent = listNode;
        int numToMoveLeft = 0;


        while (l1 != null || l2 != null){
            int addedNum = l1.val + l2.val + numToMoveLeft;

            int rightDigit = addedNum % 10;
            int leftDigit = addedNum / 10;
            numToMoveLeft = leftDigit;


            tmpCurrent.next = new ListNode(rightDigit);
            tmpCurrent = tmpCurrent.next;

            l1 = l1.next;
            l2 = l2.next;

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

        ListNode solution = new Solution().addTwoNumbers(listNode1, listNode2);
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
