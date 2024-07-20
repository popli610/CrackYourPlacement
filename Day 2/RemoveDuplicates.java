public class RemoveDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode prev = head;
        ListNode curr = head.next;
        while(curr!=null){
            if(prev.val==curr.val){
                prev.next = curr.next;
                curr=curr.next;
            }
            else{
                ListNode temp = curr;
                curr = curr.next;
                prev = temp;
            }
        }
        return head;

    }
}
