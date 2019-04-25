package amazon;

public class MinStack {

	public static void main(String[] args) {
		MinimumStack ms = new MinimumStack();
		
		ms.push(5);ms.push(6);ms.push(2);ms.push(9);
		
		System.out.println(ms.top());
		System.out.println(ms.min());
		ms.pop();
		System.out.println(ms.top());
		ms.pop();
		System.out.println(ms.top());
		System.out.println(ms.min());
	}

}

class MinimumStack{
	Node head;
	class Node{
		int data;
		int min;
		Node next;
		
		Node(int datainp, int mininp){
			data= datainp;
			min = mininp;
			next=null;
		}
	}
	MinimumStack(){
		head=null;
	}
	
	public void push(int value) {
		if(head==null) {
			head = new Node(value,value);
		}else {
			Node newNode= new Node(value, Math.min(value, head.min));
			newNode.next = head;
			head=newNode;
		}
	}
	
	public Node pop() {
		if(head!=null) {
		Node temp= head;
		head=head.next;
		return temp;}else{return null;}
	}
	
	public int top() {
		return head.data;
	}
	
	public int min() {
		return head.min;
	}
	
}
