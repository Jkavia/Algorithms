package main;

import java.util.ArrayList;
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
		addnode(root, 8);

		// printTree(root);
		// System.out.println("val is "+commonancestor(root,8,5).value);

	}

	/** given a binary tree print all possible arrays that have led to this tree **/
	ArrayList<LinkedList<Integer>> allSequences(Treenode node) {
		ArrayList<LinkedList<Integer>> result = new ArrayList<LinkedList<Integer>>();
		if (node == null) {
			result.add(new LinkedList<Integer>());
			return result;
		}
		LinkedList<Integer> prefix = new LinkedList<Integer>();
		prefix.add(node.value);

		ArrayList<LinkedList<Integer>> leftseq = allSequences(node.left);
		ArrayList<LinkedList<Integer>> rightseq = allSequences(node.right);

		for (LinkedList<Integer> left : leftseq) {
			for (LinkedList<Integer> right : rightseq) {
				ArrayList<LinkedList<Integer>> weaved = new ArrayList<>();
				weaveLists(left, right, weaved, prefix);
				result.addAll(weaved);
			}
		}

		return result;

	}

	private void weaveLists(LinkedList<Integer> first, LinkedList<Integer> second, ArrayList<LinkedList<Integer>> results,
			LinkedList<Integer> prefix) {
	if(first.size()==0||second.size()==0) {
		LinkedList<Integer> result = (LinkedList<Integer>)prefix.clone();
		result.addAll(first);
		result.addAll(second);
		results.add(result);
		return;
	}
		
	
	int headFirst = first.removeFirst();
	prefix.addLast(headFirst);
	weaveLists(first, second, results, prefix);
	prefix.removeLast();
	first.addFirst(headFirst);
	
	int headSecond = second.removeFirst();
	prefix.addLast(headSecond);
	weaveLists(first, second, results, prefix);
	prefix.removeLast();
	second.addFirst(headSecond);
	
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
		} else if (p == root.value || q == root.value) {
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
		System.out.print(root.value + " ");
		printTree(root.right);
	}

	/** Print the tree in post order **/
	public static void printTreepost(Treenode root) {
		if (root == null) {
			return;
		}
		printTree(root.left);
		printTree(root.right);
		System.out.print(root.value + " ");
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