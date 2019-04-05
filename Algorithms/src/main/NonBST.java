package main;

import java.util.LinkedList;
import java.util.Queue;

public class NonBST {

	public static void main(String[] args) {
		Treenode root = new Treenode(1);
		addnode(root, 2);
		addnode(root, 3);
		addnode(root, 4);
		addnode(root, 5);
		addnode(root, 6);
		addnode(root, 7);

		printTree(root);

	}

	/** find the first common ancestor **/
	public static Treenode commonancestor(Treenode root, int p, int q) {
		Result rs = commonancestorHelper(root, p, q);

		if (rs.isParent) {
			return rs.node;
		}
		return null;
	}

	private static Result commonancestorHelper(Treenode root, int p, int q) {
		if (root == null) {
			return new Result(null, false);
		}
		if (root.value == p && root.value == q) {
			return new Result(root, true);
		}

		Result rx = commonancestorHelper(root.left, p, q);
		if (rx.isParent) {
			return rx;
		}
		Result ry = commonancestorHelper(root.right, p, q);
		if (ry.isParent) {
			return ry;
		}

		if (rx.node != null && ry.node != null) {
			return new Result(root, true);
		} else if (rx.node == root || ry.node == root) {
			boolean isAncestor = rx.node != null || ry.node != null;
			return new Result(root, isAncestor);
		} else {
			return new Result((rx.node != null ? rx.node : ry.node), false);
		}

	}

	/** Add node to a non BST left to right **/
	public static void addnode(Treenode root, int val) {
		if (root == null) {
			System.out.println("root is null");
			return;
		}
		Queue<Treenode> que = new LinkedList<>();
		que.add(root);

		while (!que.isEmpty()) {
			Treenode temp = que.remove();
			if (temp.left == null) {
				temp.left = new Treenode(val);
				break;
			} else {
				que.add(temp.left);
			}
			if (temp.right == null) {
				temp.right = new Treenode(val);
				break;
			} else {
				que.add(temp.right);
			}
		}
	}

	/** Print the tree in pre order **/
	public static void printTree(Treenode root) {
		if (root == null) {
			return;
		}
		printTree(root.left);
		System.out.println(root.value);
		printTree(root.right);
	}

}

class Result {
	Treenode node;
	boolean isParent;

	public Result(Treenode nd, boolean isp) {
		node = nd;
		isParent = isp;
	}
}

class Treenode {
	int value;
	Treenode left, right;

	public Treenode(int val) {
		value = val;
		left = right = null;
	}

}