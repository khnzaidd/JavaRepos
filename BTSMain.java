import java.util.*;
class BSTMain{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		BSTDemo tree=new BSTDemo();
		System.out.println("Enter number of nodes: ");
		int n=sc.nextInt();
		tree.createTree(n);
		System.out.println("Traversal....:-");
		tree.levelOrderBottom(tree.root);
	}
}
