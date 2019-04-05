package main;

public class NonBST {

	public static void main(String[] args) {
System.out.println("HEllo");
	}

}

class Project{
	Treenode node;
	boolean isParent;
	
	public Project(Treenode nd, boolean isp) {
		node=nd;
		isParent = isp;
	}
}

class Treenode{
	int value;
	Treenode left,right;
	
	public Treenode(int val) {
		value = val;
		left=right=null;
	}
}