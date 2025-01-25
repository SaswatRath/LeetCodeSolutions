class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        int carry = 0;
        ListNode head = l3;
        while (l1 != null && l2 != null) {
            int value = l1.val + l2.val + carry;
            carry = value / 10;
            l3.next = new ListNode(value % 10);
            l3 = l3.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int value = l1.val + carry;
            carry = value / 10;
            l3.next = new ListNode(value % 10);
            l3 = l3.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            int value = l2.val + carry;
            carry = value / 10;
            l3.next = new ListNode(value % 10);
            l3 = l3.next;
            l2 = l2.next;
        }
        if (carry > 0) {
            l3.next = new ListNode(carry);
        }
        return head.next; 
    }
    public static ListNode createList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) {
                System.out.print(" -> ");
            }
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] num1 = {2, 4, 3}; 
        int[] num2 = {5, 6, 4}; 
        ListNode l1 = createList(num1);
        ListNode l2 = createList(num2);
        System.out.print("Input List 1: ");
        printList(l1);
        System.out.print("Input List 2: ");
        printList(l2);
        ListNode result = solution.addTwoNumbers(l1, l2);
        System.out.print("Result List: ");
        printList(result);
    }
}
