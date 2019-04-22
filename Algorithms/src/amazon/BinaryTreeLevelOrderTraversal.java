package amazon;
import java.util.*;
import helperClasses.*;

public class BinaryTreeLevelOrderTraversal {

	public static void main(String[] args) {
		
	}
	public TreeNode addVals(int[]arr) {
		
		TreeNode root = new TreeNode(arr[0]);
		root.left = new TreeNode(arr[1]);
		root.right = new TreeNode(arr[2]);
		root.right.left = new TreeNode(arr[3]);
		root.right.right = new TreeNode(arr[4]);
		
		return root;
	}
	public  List<List<Integer>> LevelOrderTraversal(TreeNode root){
		List<List<Integer>> returnList = new ArrayList<>();
		if(root==null) {
			return returnList;
		}
		List<Integer> templist = new ArrayList<>();
		templist.add(root.val);
		returnList.add(templist);
		Queue<TreeNode> que = new LinkedList<>();
		que.add(root);
		while(!que.isEmpty()) {
			List<Integer> lst = new ArrayList<>();
			Queue<TreeNode> currentlevel = new LinkedList<>();
			while(!que.isEmpty()) {
				TreeNode temp = que.remove();
				if(temp.left!=null) {
					currentlevel.add(temp.left);
					lst.add(temp.left.val);
				}
				if(temp.right!=null) {
					currentlevel.add(temp.right);
					lst.add(temp.right.val);
				}
			}
			if(lst.size()>0) {returnList.add(lst);};
			
			que = currentlevel;
		}
		return returnList;
	}

}

