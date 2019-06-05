package google;

import java.util.ArrayList;
import java.util.List;

import helperClasses.TreeNode;

public class BinaryTreePaths {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(11);
		root.left = new TreeNode(6);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(8);
		root.left.left.left = new TreeNode(1);
		root.left.left.right = new TreeNode(5);
		List<String> str = binaryTreePaths(root);
		for (String s : str) {
			System.out.println(s);
		}
	}

	public static List<String> binaryTreePaths(TreeNode root) {
		List<String> returnlist = new ArrayList<>();
		String sb = new String();
		binaryTreePaths(root, sb, returnlist);
		System.out.println();
		return returnlist;
	}

	private static void binaryTreePaths(TreeNode root, String sb, List<String> returnlist) {
		if (root.left == null && root.right == null) {

			returnlist.add(sb + root.val);
			return;
		}
		sb = sb + root.val + "->";

		if (root.left != null) {
			binaryTreePaths(root.left, sb, returnlist);
		}
		if (root.right != null) {
			binaryTreePaths(root.right, sb, returnlist);
		}
	}
}
