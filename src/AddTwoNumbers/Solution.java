package AddTwoNumbers;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        ListNode tmp1 = l1;
        ListNode tmp2 = l2;
        int numToMoveLeft = 0;
        // tbc c:


        do {
            int addedNum = tmp1.val + tmp2.val + numToMoveLeft;

            if (addedNum > 9) {
                int rightDigit = addedNum % 10;
                numToMoveLeft = addedNum / 10;
                listNode.next = new ListNode(rightDigit);
            }
            if (addedNum < 9) {
                listNode.next = new ListNode(tmp1.val + tmp2.val + numToMoveLeft);
                numToMoveLeft = 0;
            }
            tmp1 = new ListNode(tmp1.val);
            tmp2 = new ListNode(tmp2.val);

        } while (tmp1.next != null);

        return listNode;
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
