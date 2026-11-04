
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(-1);
        ListNode root = dummy;

        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                root.next = l1;
                l1 = l1.next;
            }
            else {
                root.next = l2;
                l2 = l2.next;
            }

            root = root.next;
        }
        if(l1 != null)
            root.next = l1;

        if(l2 != null)
            root.next = l2;

        return dummy.next;
    }
}
