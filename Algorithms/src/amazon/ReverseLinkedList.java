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
		
		Listnode newHead = null;
		while(head!=null) {
			Listnode next= head.next;
			head.next = newHead;
			newHead=head;
			head=next;
		}
		
		return newHead;
	
	}

}
