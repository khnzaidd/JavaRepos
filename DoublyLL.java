import java.util.*;
class DoublyLL{
	private class Node{
		Node prev;
		Node next;
		int data;
		Node(int x){
			data=x;
			prev=null;
			next=null;
		}
	}
	private Node head;
	public DoublyLL(){
		head=null;
	}
	public void createList(int n){
		Node temp=null,t=null;
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=n;i++){
			System.out.println("Enter data: ");
			temp=new Node(sc.nextInt());
			if(i==1){
				head=temp;
				t=head;
			}else{
				t.next=temp;
				temp.prev=t;
				t=t.next;
			}
		}
	}
	public void insertNode(int data,int pos){
		Node temp=new Node(data);
		if(pos==1){
			if(head==null){
				head=temp;
			}else{
				temp.next=head;
				head.prev=temp;
				head=temp;
			}
		}else{
			if(head==null){
				System.out.println("Node can not be inserted");
			}else{
				Node p=head;
				Node q=head;
				int count=1;
				while((q!=null) && (count<pos)){
				p=q;
				q=q.next;
				count++;
				}
			}
		}
	}
	public void deleteNode(int pos){
		Node p=head,t=head;
		int count;
		if(pos==1){
			t.prev=p.prev;
			head=t;
		
	public void traverse(){
		Node temp=null;
		if(head==null){
			System.out.println("List is empty");
		//	return;
		}else{
			do{
				System.out.print(head.data+" ");
				temp=head;
				head=head.next;
			}while(head!=null);
		}
		System.out.println();
		System.out.println();
		if(head==null){
			do{
				System.out.print(temp.data+" ");
				temp=temp.prev;
			}while(temp!=null);
		}
		System.out.println();
	}
}

