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
public class Solution {
    List<ListNode> temp = new ArrayList<ListNode>();
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while(headA != null){
            temp.add(headA);
            headA = headA.next;
        }
        while(headB!=null){
            if(temp.contains(headB)) return headB;
            headB = headB.next;
        }
        return null;
    }
}