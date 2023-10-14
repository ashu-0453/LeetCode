/*Follow 3 steps :
  1. Find length of cycle
  2. Move 's' ahead by length of cycle times
  3. Then from that point move 's', and 'f' from head , one by one step and it will meet at the start of cycle.

*/

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
public class Solution {
    public ListNode detectCycle(ListNode head) {
        int length=0;
        ListNode fast=head;
        ListNode slow=head;
        while(fast != null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                length=LengthOfCycle(slow);
                break;
            }
        }

        //return null if no cycle is present

        if(length==0){
            return null;
        }

        //find the start node

        ListNode f=head;
        ListNode s=head;
        while(length > 0){
            s=s.next;
            length--;
        }
        
        //Keep moving till the two pointers meet at the starting of Cycle

        while(f!=s){
            s=s.next;
            f=f.next;
        }

        return s;
    }

  //To Calculate the length of cycle
  
    public int LengthOfCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast !=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                ListNode temp=slow;
                int len=0;
                do{
                    temp=temp.next;
                    len++;
                }while(temp!=slow);
                return len;
            }
        }
        return 0;
    }
}
