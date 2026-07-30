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
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while(list1 != null && list2 != null){
        
            if(list1.val <= list2.val){
                temp.next = list1;
                list1 = list1.next;
            }
            else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if(list1 != null){
            temp.next = list1;
        }
        if(list2 != null){
            temp.next = list2;
        }
        return dummy.next;
    }
}


// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

//         // Dummy node to start the merged list
//         ListNode dummy = new ListNode(-1);

//         // Tail pointer to build the new list
//         ListNode temp = dummy;

//         // Traverse both lists
//         while(list1 != null && list2 != null){

//             // Compare values
//             if(list1.val <= list2.val){
//                 temp.next = list1;
//                 list1 = list1.next;
//             }
//             else{
//                 temp.next = list2;
//                 list2 = list2.next;
//             }

//             // Move temp forward
//             temp = temp.next;
//         }

//         // If elements remain in list1
//         if(list1 != null){
//             temp.next = list1;
//         }

//         // If elements remain in list2
//         if(list2 != null){
//             temp.next = list2;
//         }

//         // Return merged list
//         return dummy.next;
//     }
// }