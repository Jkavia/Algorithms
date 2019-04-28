package amazon;

public class ReverseLinkedList {

	public static void main(String[] args) {
		Listnode head = new Listnode(1);
		head.next = new Listnode(2);
		head.next.next = new Listnode(3);
		head.next.next.next = new Listnode(4);
		
		Listnode rethead = reverse(head);
		while(rethead!=null) {
			System.out.println(rethead.value);
			rethead=rethead.next;
		}
	}

	private static Listnode reverse(Listnode head) {
		if(head==null) {
			return null;
		}else if(head.next==null) {return head;}
		Listnode prev=head,curr=head.next,next=head.next.next;
		prev.next=null;
		while(next!=null) {
			curr.next=prev;
			prev=curr;
			curr=next;
			next=next.next;
		}
		curr.next=prev;
		
		return curr;
	
	}

}
