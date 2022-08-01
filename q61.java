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
        if(k==0||head==null||head.next==null){
            return head;
        }
        int index=0;
        ListNode last=head;
        while(last.next!=null){
            index++;
            last=last.next;
        }
        int length=index+1;
        k=k%length;
        if(k==0){
            return head;
        }
        last.next=head;
        ListNode current=head;
        for(int i=0;i<k;i++){
            current=current.next;
        }
        ListNode output=current.next;
        current.next=null;
        return output;
    }
}
