public class ReverseLL2 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null)
            return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode leftNode = dummy;
        for (int i = 0; i < left - 1; i++)
            leftNode = leftNode.next;

        ListNode st = leftNode.next;
        ListNode curr = st.next;

        for (int i = 0; i < right - left; i++) {
            st.next = curr.next;
            curr.next = leftNode.next;
            leftNode.next = curr;
            curr = st.next;
        }
        return dummy.next;
    }
}
