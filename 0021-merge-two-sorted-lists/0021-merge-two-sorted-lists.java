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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode temp = head;
        ListNode root = head;
        if(list1==null && list2 == null) return list1;
        else if(list1==null) return list2;
        else if(list2==null) return list1;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                
                head.val = list1.val;
                list1 = list1.next;
                ListNode head1 = new ListNode();
                head.next = head1;
                temp = head;
                                head = head.next;

            }
            else if(list1.val > list2.val){
                head.val = list2.val;
                list2 = list2.next;
                ListNode head1 = new ListNode();
                head.next = head1;
                                temp = head;

                head = head.next;
            }
            else{
                
                head.val = list1.val;
                list1 = list1.next;
                ListNode head1 = new ListNode();
                head.next = head1;
                head = head.next;
                head.val = list2.val;
                list2 = list2.next;
                                ListNode head2 = new ListNode();

                head.next = head2;
                                temp = head;

                                head = head.next;

            }
        }
        if(list1==null && list2 == null){
            head = temp;
            head.next = null;
        }
        else if(list1==null){
            head = temp;
            head.next = list2;
        }
        else if(list2==null){
            head = temp;
            head.next = list1;
        }
        return root;
    }
        
}