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
        int size = 0;
        ListNode temp = head;
        while(head!=null){
            size++;
            head = head.next;
        }
        if(size == 1) return true;
        Stack<Integer> st = new Stack<>();
        int current = 1;
        
        while(current<=size/2){ //st -> 1// temp[1] // current -> 2 //size ->3
            st.push(temp.val);
            temp = temp.next;
            current++; 
        }
        if(size%2!=0) {
            temp = temp.next;
            current++;
        }
        while(current<=size){
            if(st.isEmpty()) return false;
            if(st.pop() != temp.val)
                return false;
            temp = temp.next;
            current++;
        } 
        return true;
    }
}