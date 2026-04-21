import java.util.*;
class BSTMain{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		BSTDemo tree=new BSTDemo();
		System.out.println("Enter number of nodes: ");
		int n=sc.nextInt();
		tree.createTree(n);
		System.out.println("Level Order Traversal ...:-");
		tree.levelOrderTraversal(tree.root);
		System.out.println("Pre Order Traversal ...:-");
		tree.preOrder(tree.root);
		System.out.println("Post Order Traversal ...:-");
		tree.postOrder(tree.root);
		System.out.println("In Order Traversal ...:-");
		tree.inOrder(tree.root);
		System.out.println("Searching 50 ...:-");
		tree.searchNode(tree.root,50);
	}
}
