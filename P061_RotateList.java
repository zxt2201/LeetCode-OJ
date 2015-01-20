/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class P061_RotateList {
    public ListNode rotateRight(ListNode head, int n) {
        if(head==null){
            return null;
        }
        int count = 1;
        ListNode current = head;
        while(current.next!=null){
            count++;
            current = current.next;
        }
        current.next = head;//make the list as a circle
        
        int left = count-n%count;
        
        ListNode prev = head;
        current = head.next;
        left--;//because current point to 2nd element.
        while(left>0){
            prev = prev.next;
            current = current.next;
            left--;
        }
        
        prev.next = null;
        return current;
    }
}
