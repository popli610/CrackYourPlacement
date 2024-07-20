public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return null;
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode temp = dummy;
        while (temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } else
                temp = temp.next;
        }
        return dummy.next;
    }
}
