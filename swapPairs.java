/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    public ListNode swapPairs(ListNode head) {
        if(head==null)  return null;
        
        if(head.next == null) return head;
        
        ListNode nextNext = swapPairs(head.next.next);
        ListNode next = head.next;
        head.next = nextNext;
        next.next = head;
        
        return next;
    }
    
    public ListNode swapPairsI(ListNode head) {
        if(head==null) return null;
        
        if(head.next == null) return head;
        
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        
        while(current!=null && current.next!=null) //odd
        {
            next = current.next;
            
            current.next = next.next;
            next.next = current;
            
            if(prev==null)
                head = next;
            else
                prev.next = next;
            
            prev = current;
            current = current.next;
        }
        
        return head;
    }
}
