package amazon;

import java.util.Stack;

public class PalindromeLinkedList {

	public static void main(String[] args) {
		Listnode head = new Listnode(1);
		head.next = new Listnode(2);
		head.next.next = new Listnode(3);
		head.next.next.next = new Listnode(3);
		head.next.next.next.next = new Listnode(2);
		head.next.next.next.next.next = new Listnode(1);

		System.out.println(isPalindrome(head));
	}

	private static boolean isPalindrome(Listnode head) {
		if (head == null) {
			return false;
		}
		if (head.next == null) {
			return true;
		}
		Listnode slow = head, fast = head;
		Stack<Integer> stack = new Stack<>();

		while (fast != null && fast.next != null) {
			if (slow != null) {
				stack.add(slow.value);
			}
			fast = fast.next.next;
			slow = slow.next;
		}

		if (fast != null) {
			slow = slow.next;
		}

		while (slow != null) {
			if (slow.value != stack.pop()) {
				return false;
			}
			slow = slow.next;
		}
		return true;
	}

}
