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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode tail=head;
        int c=1;
        if(head==null || head.next==null)return head;
        while(tail.next!=null){
            c++;
            tail=tail.next;
        }
        if(k%c==0) return head;
        k=k%c;
        tail.next=head;
        ListNode newlastnode=findlastnode(head,c-k);
        head=newlastnode.next;
        newlastnode.next=null;
        return head;

        
    }
    public ListNode findlastnode(ListNode head,int k){
        ListNode temp=head;
        while( k>1){
            k--;
            temp=temp.next;
        }
        return temp;
    }
}