
class Solution {
    public ListNode middleNode(ListNode head) {
        int len = 0;
        ListNode root = head;
        while(root!=null){
            root = root.next;
            len++;
        }
        int mid = len/2;
        int ctr = 0;
        root = head;
        while(ctr != mid){
            root = root.next;
            ctr++;
        }
        return root;
    }
}