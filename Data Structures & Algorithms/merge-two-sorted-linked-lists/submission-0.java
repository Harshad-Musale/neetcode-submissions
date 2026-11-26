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
        ListNode dummy=new ListNode(-1);
        ListNode n1=list1;
        ListNode n2=list2;
        ListNode temp=dummy;
        while(n1!=null & n2!=null){
            if(n1.val<=n2.val){
                temp.next=n1;
                temp=temp.next;
                n1=n1.next;
            }
            else if(n1.val>n2.val){
                temp.next=n2;
                temp=temp.next;
                n2=n2.next;
            }
        }
            if(n1==null){
                temp.next=n2;
            }
            else if(n2==null){
                temp.next=n1;
            }
        return dummy.next;
    }
}