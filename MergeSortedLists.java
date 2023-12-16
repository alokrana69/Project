package Sharpener_DSA_Sheet;

public class MergeSortedLists {

	ListNode head;
	class ListNode{
		
		int val;
		ListNode  next;
		
		ListNode(int val, ListNode next){
			
			this.val = val;
			this.next = next;
		}
	}
	// function of mergeing two sorted list //
	
	
	
	
	
	public ListNode MergeSortedList1 (ListNode list1, ListNode list2) {

		// check both list are empty or note 
		
         if(list1 != null && list2 != null) {
			
           if(list1.val < list2.val) {
              list1.next = MergeSortedList1(list1.next , list2);
              return list1;
           }
           else {
	         list2.next = MergeSortedList1(list1, list2.next);
             return list2;
          }
        }
         // checking list == null

       if(list1 == null) {
	        
    	   return list2;
       } 
       return list1;	
	}
	
	// print the linkedList //
	
	void printList() {
		
		ListNode temp = head;
		
		while(temp != null) {
			
		}
		
	}
}
