package topQuestions;

import helperClasses.TreeNode;

public class MergeTwoBinaryTrees {

	public static void main(String[] args) {
		TreeNode root1 = new TreeNode(5);
		root1.left = new TreeNode(3);
		root1.right = new TreeNode(2);
		root1.right.right = new TreeNode(1);
		TreeNode root2 = new TreeNode(4);
		root2.left = new TreeNode(9);
		root2.left.left = new TreeNode(13);
		root2.right = new TreeNode(4);

		TreeNode rootval = mergeTrees(root1, root2);
		printtree(rootval);
	}

	private static void printtree(TreeNode rootval) {
		if (rootval == null)return;
		printtree(rootval.left);
		System.out.println(rootval.val);
		printtree(rootval.right);
	}

	private static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null)
			return null;
		if (root1 == null && root2 != null)
			return root2;
		if (root1 != null && root2 == null)
			return root1;

		TreeNode root3 = new TreeNode(root1.val + root2.val);
		root3.left = mergeTrees(root1.left, root2.left);
		root3.right = mergeTrees(root1.right, root2.right);

		return root3;

	}

}
