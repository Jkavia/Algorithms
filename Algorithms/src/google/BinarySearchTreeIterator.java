package google;

import java.util.Stack;

public class BinarySearchTreeIterator {

	public static void main(String[] args) {
		BSTNode root = new BSTNode(11);
		root.left = new BSTNode(6);
		root.left.left = new BSTNode(3);
		root.left.right = new BSTNode(8);
		root.left.left.left = new BSTNode(1);
		root.left.left.right = new BSTNode(5);

		BSTIterator bSTIterator = new BSTIterator(root);

		while (bSTIterator.hasnext()) {
			System.out.println(bSTIterator.smallest().data);
		}
	}

}

class BSTIterator {
	Stack<BSTNode> stack;

	public BSTIterator(BSTNode root) {
		stack = new Stack<>();
		while (root != null) {
			stack.push(root);
			root = root.left;
		}

	}

	public boolean hasnext() {
		return stack.isEmpty() ? false : true;
	}

	public BSTNode smallest() {
		BSTNode smallest = stack.pop();

		BSTNode nextsmall = smallest.right;

		while (nextsmall != null) {
			stack.push(nextsmall);
			nextsmall = nextsmall.left;
		}

		return smallest;
	}

}

class BSTNode {
	BSTNode left;
	BSTNode right;
	int data;

	public BSTNode(int val) {
		data = val;
		left = right = null;
	}
}
