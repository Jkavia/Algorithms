package amazon;

public class Twosum {

	public static void main(String[] args) {
	Listnode root1 = new Listnode(2);
	root1.next=new Listnode(4);
	root1.next.next=new Listnode(3);
	
	Listnode root2 = new Listnode(5);
	root2.next = new Listnode(6);
	root2.next.next = new Listnode(6);
	root2.next.next.next = new Listnode(8);
	
	Listnode ret = twosum(root1, root2);
	while(ret!=null) {
		System.out.print(ret.value);
		ret=ret.next;
	}
	}
	
	/**Algorithm to add two numbers represented by linkedlist*/
	public static Listnode twosum(Listnode root1, Listnode root2) {
		Listnode rootreturn=new Listnode(0), root;
		root=rootreturn;
		int carry=0;
		
		while(root1!=null && root2!=null) {
			int val = root1.value+root2.value+carry;
			carry = (val>=10)?1:0;
			root.next = new Listnode(val%10);
			root=root.next;
			root1=root1.next;
			root2=root2.next;	
		}
		if(root1==null && root2!=null) {
			while(root2!=null) {
				int val = root2.value+carry;
				carry = (val>=10)?1:0;
				root.next = new Listnode(val%10);
				root=root.next;
				root2=root2.next;
			}
		}
		if(root2==null && root1!=null) {
			while(root1!=null) {
				int val = root1.value+carry;
				carry = (val>=10)?1:0;
				root.next = new Listnode(val%10);
				root=root.next;
				root1=root1.next;
			}
		}
		
		if(carry==1) {
			root.next = new Listnode(1);
		}
		return rootreturn.next;
		
	}

}

class Listnode{
	int value;
	Listnode next;
	
	public Listnode(int input) {
		value=input;
		next=null;
	}
}
