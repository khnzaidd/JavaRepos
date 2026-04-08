import java.util.*;
class DoublyCLL{
	private class Node{
		int data;
		Node prev;
		Node next;
		Node(int x){
			data=x;
			prev=this;
			next=this;
		}
	}
	private Node head;
	public DoublyCLL(){
		head=null;
	}
	public void createList(int n){
//		Node temp=null,p=null;
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=n;i++){
			System.out.println("Enter the data: ");
			Node temp=new Node(sc.nextInt());
			if(head==null){
				head=temp;
			}else{
				Node p=head;
				while(p.next!=head){
					p=p.next;
				}
				p.next=temp;
				temp.prev=p;
				temp.next=head;
				head.prev=temp;
			}
		}
	}
	public void insertNode(int data,int pos){
		Node temp=new Node(data);
		if(head==null){
			head=temp;
			return;
		}
		if(pos==1){
			Node p=head;
			while(p.next!=head){
				p=p.next;
			}
			temp.next=head;
			temp.prev=p;
			p.next=temp;
			head.prev=temp;
			head=temp;
		}
		else{
			Node p=head;
			int count=1;
			while((p.next!=head)&&(count<pos-1)){
				p=p.next;
				count++;
			}
			Node q=p.next;
			temp.next=q;
			temp.prev=p;
			p.next=temp;
			q.prev=temp;
		}
	}
	public void deleteNode(int pos){
		Node p=null,t=null;
		int count=1;
		if(head==null){
			System.out.println("List is empty");
		}
		else if(pos==1){
			p=head;
			while(p.next!=head){
				p=p.next;
			}
			t=head;
			head=t.next;
			head.prev=p;
			p.next=head;
			t.next=t.prev;
			t.next=null;
			}
		else{
			p=head;
			t=head;
			while((t.next!=head)&&(count<pos)){
				p=t;
				t=t.next;
				count++;
			}
			Node next=t.next;
			p.next=next;
			next.prev=p;
			t.next=t.prev;
			t.prev=null;
		}
	}
	public void traverse(){
		Node temp=head;
		while (temp.next!=head){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.print(temp.data);
		//System.out.println(temp.next.data);
		System.out.println();
		while(temp!=head){
			System.out.print(temp.data+" ");
			temp=temp.prev;
		}
		System.out.print(temp.data);
		System.out.println();
	}
}
