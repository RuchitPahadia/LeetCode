/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(l1!=null||l2!=null){
            int x1 = 0;
            if(l1 != null){
                x1 = l1.val;
                l1 = l1.next;
            }
            int x2 = 0;
            if(l2 != null){
                x2 = l2.val;
                l2 = l2.next;
            }
            int sum = x1+x2+carry;
            curr.next=new ListNode(sum%10);
            curr=curr.next;
            carry=sum/10;
            
        }
        if(carry>0)
            curr.next=new ListNode(carry);
        return dummy.next;
    }
}