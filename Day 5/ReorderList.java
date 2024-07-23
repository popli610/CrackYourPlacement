public class ReorderList {
    private ListNode reverse(ListNode node) {
        ListNode curr = node;
        ListNode prev = null;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public void reorderList(ListNode head) {
        ListNode slowCar = head;
        ListNode fastCar = head;
        while (fastCar != null && fastCar.next != null) {
            slowCar = slowCar.next;
            fastCar = fastCar.next.next;
        }
        ListNode firstLL = head;
        ListNode secLL = reverse(slowCar.next);
        slowCar.next = null;
        ListNode firstNext = null;
        ListNode secNext = null;

        while (firstLL != null && secLL != null) {
            firstNext = firstLL.next;
            firstLL.next = secLL;
            secNext = secLL.next;
            secLL.next = firstNext;
            firstLL = firstNext;
            secLL = secNext;
        }
    }
}
