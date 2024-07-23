public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode leftSubList = new ListNode(0);
        ListNode rightSubList = new ListNode(0);

        ListNode leftTail = leftSubList;
        ListNode rightTail = rightSubList;

        while (head != null) {
            if (head.val < x) {
                leftTail.next = head;
                leftTail = leftTail.next;
            } else {
                rightTail.next = head;
                rightTail = rightTail.next;
            }
            head = head.next;
        }
        leftTail.next = rightSubList.next;
        rightTail.next = null;
        return leftSubList.next;
    }
}
