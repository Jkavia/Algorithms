package amazon;


public class LowestCommonAncestor {

	public static void main(String[] args) {
		TreenodeLCA root = new TreenodeLCA(3);
		root.left = new TreenodeLCA(5);
		root.right = new TreenodeLCA(1);
		root.left.left = new TreenodeLCA(6);
		root.left.right = new TreenodeLCA(2);
		root.left.right.left = new TreenodeLCA(7);
		root.left.right.right = new TreenodeLCA(4);
		root.right.left = new TreenodeLCA(0);
		root.right.right = new TreenodeLCA(8);
	
		
	TreenodeLCA lca = findlowestCommonAncestor(root,root.left,root.left.right.right);
	System.out.println(lca.val);
	
	TreenodeLCA lca2 = findlowestCommonAncestor(root,root.left,root.right.right);
	System.out.println(lca2.val);
	}

	private static TreenodeLCA findlowestCommonAncestor(TreenodeLCA root, TreenodeLCA l, TreenodeLCA r) {
		if(root==null || root==l || root == r) {return root;}
		
		TreenodeLCA left = findlowestCommonAncestor(root.left, l,r);
		TreenodeLCA right = findlowestCommonAncestor(root.right, l,r);
		
		if(left!=null && right!=null) {return root;}
		
		return left!=null?left:right;
		
	}

}

class TreenodeLCA{
	int val;
	TreenodeLCA left,right;
	
	TreenodeLCA(int value){
		val=value;
		left=right=null;
	}
}
