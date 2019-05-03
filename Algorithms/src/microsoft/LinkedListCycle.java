package microsoft;

public class LinkedListCycle {

	public static void main(String[] args) {
		Listnode head= new Listnode(1);
		head.next = new Listnode(2);
		head.next.next = new Listnode(3);
		head.next.next.next = new Listnode(4);
		head.next.next.next.next = new Listnode(5);
		
		System.out.println(isCycle(head));
	}
	
	
	public static boolean isCycle(Listnode head) {
		if(head==null || head.next==null) {return false;}
		Listnode fast=head, slow=head;
		while(fast!=null && fast.next!=null) {
			
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				return true;
			}
		}
		
		
		return false;
	}

}

class Listnode{
	int val;
	Listnode next;
	
	public Listnode(int value) {
		val=value;
		next=null;
	}
}
