package LinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListOperations {
	
    public static ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            // Store next node
            next = current.next;

            // Reverse the current node's pointer
            current.next = prev;

            // Move pointers one position forward
            prev = current;
            current = next;
        }
        return prev;  // prev becomes the new head of the reversed list
    }
    public static void printListReverse(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public static ListNode findMiddleElement(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;         // Move slow pointer by 1
            fast = fast.next.next;    // Move fast pointer by 2
        }
        return slow;  // slow will be at the middle of the list
    }
    public static void printListMiddle(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        // Creating a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);


        System.out.println("Original Linked List:");
        printListReverse(head);

        // Reversing the linked list
        ListNode reversedHead = reverseLinkedList(head);
        
        System.out.println("Reversed Linked List:");
        printListReverse(reversedHead);
        
        System.out.println("Linked List:");
        printListMiddle(head);

        // Finding the middle element
        ListNode middleNode = findMiddleElement(head);
        
        System.out.println("Middle Element: " + middleNode.val);
    }
    
}
