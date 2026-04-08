class SLList{
	private class Node{
		int data;
		Node next;
		Node(int x){
			data=x;
			next=null;
		}
	}
	private Node head;
	public SLList(){
		head=null;
	}
	public void insertData(int data){
		Node temp=new Node(data);
		if(head==null){
			
