package AddTwoNumbers;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {



        return l1;
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
