import java.util.*;
class BSTDemo{
	private class Node{
		int data;
		Node left;
		Node right;
		Node(int x){
			data=x;
			left=null;
			right=null;
		}
	}
	private Node root;
	public BSTDemo(){
		root=null;
	}
	public void createTree(int no_of_nodes){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<no_of_nodes;i++){
			System.out.println("Enter data");
			Node temp=new Node(sc.nextInt());
			if(root==null){
				root=temp;
			}else{
				Node p=root,q=root;
				while(p!=null){
					q=p;
					if(temp.data>root.data){
						p=p.right;
					}else{
						p=p.left;
					}
				}
				if(q.data<temp.data){
					q.left=temp;
				}else{
					q.right=temp;
				}
			}
		}
	}
}
