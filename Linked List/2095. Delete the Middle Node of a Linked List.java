// Time complexity: O(n)


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
    public ListNode deleteMiddle(ListNode head) {
        // list is empty or has 1 node
        if(head==null || head.next==null) return null; 
        ListNode fast = head , slow = head , previous = null;
        // Traverse until fast reaches the end or slow passes the middle
        while( slow != null && fast.next != null){
            
            previous = slow; // Track the node before slow
            slow = slow.next;// Move slow forward once
            
            fast=fast.next;  // Move fast forward once
            if(fast !=null && fast.next != null){
                fast=fast.next; // Move fast again if possible
            }
            

        }
        // Skip the middle node to delete it 
        previous.next = slow.next;
        
        return head;
    }
}

// Approach
// 1/ If the list is empty or has only one node, return null (no middle to delete).

// 2/ Fast-Slow Pointer Technique:

// Use fast (moves 2 steps) and slow (moves 1 step) to find the middle node.

// Track previous to stay one node behind slow.
// 3/ Traverse the List:

// Move fast twice and slow once per iteration.

// Stop when fast reaches the end.
// 4/Delete the Middle Node:

// Skip the middle node by linking previous.next to slow.next.
