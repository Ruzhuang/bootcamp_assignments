/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
import java.util.ArrayList;
import java.util.List;
public class Solution {
    public boolean hasCycle(ListNode head) {
        List myList = new ArrayList();
        if(head==null){
            return false;
        }
        ListNode current=head;
        myList.add(head);
        while(current.next!=null){
            current=current.next;
            if(myList.contains(current)){
                return true;
            }
            myList.add(current);
        }
        return false;
    }
}
