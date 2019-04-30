package amazon;

import helperClasses.TreeNode;

public class ValidateBinarySearchTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		
		root.right = new TreeNode(7);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(8);
		
		boolean isbst=isBST(root);
		System.out.println(isbst);
		
	}

	private static boolean isBST(TreeNode root) {

		return isBST(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
	}

	private static boolean isBST(TreeNode root, int maxValue, int minValue) {
		if(root==null) {
			return true;
		}
		if(root.val<minValue || root.val>maxValue) {
			return false;
		}
		
		boolean leftside = isBST(root.left, root.val, minValue);
		boolean rightside = isBST(root.right, maxValue, root.val);
		
		return (leftside&&rightside);
	}

}
