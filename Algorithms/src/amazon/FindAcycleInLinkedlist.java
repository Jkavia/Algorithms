package amazon;

public class FindAcycleInLinkedlist {

	public static void main(String[] args) {
		ListNodeOne head = new ListNodeOne(1);
		head.next = new ListNodeOne(2);
		head.next.next = new ListNodeOne(3);
		head.next.next.next = new ListNodeOne(4);
		head.next.next.next.next = new ListNodeOne(5);
		head.next.next.next.next.next = head.next;
		
		System.out.println(findthePointOfCycle(head).val);
		
		

	}

	private static ListNodeOne findthePointOfCycle(ListNodeOne head) {
		
		if(head==null || head.next==null || head.next.next==null) {
			return null;
		}
		ListNodeOne slow = head.next, runner = head.next.next;
		
		while(slow!=runner) {
			if(runner==null || slow==null || slow.next==null || runner.next==null) {
				return null;
			}
			System.out.println(slow.val+" "+runner.val);
			slow=slow.next;
			runner = runner.next.next;
		}
		slow = head;
		while(slow!=runner) {
			slow=slow.next;
			runner = runner.next;
		}
		return slow;
	}

	
}
class ListNodeOne{
	int val;
	ListNodeOne next;
	
	ListNodeOne(int value){
		val=value;
		next=null;
	}
}

