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
    public boolean isPalindrome(ListNode head) {
        ListNode s=head;
        ListNode f=head;
        while(f.next!=null && f.next.next!= null){
            s=s.next;
            f=f.next.next;
        }
        ListNode newhead= reverse(s.next);
        ListNode first = head;
        ListNode second= newhead;
        while(second!=null){
            if(first.val != second.val){
                reverse(newhead);
                return false;
            }
            first=first.next;
            second=second.next;
        }
        reverse(newhead);
        return true;
        
    }

    public ListNode reverse( ListNode head){
        ListNode temp=head;
        ListNode pre=null;
        while(temp!=null){
            ListNode front=temp.next;
            temp.next=pre;
            pre=temp;
            temp=front;
        }
        return pre;
    }
}