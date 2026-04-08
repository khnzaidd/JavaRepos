class LQueue{
	private class Node{
		int data;
		Node next;
		Node(int x){
			data=x;
			next=null;
		}
	}
	private Node front,rear;
	public LQueue(){
		front=null;
		rear=null;
	}
	public void enqueue(int data){
		Node temp=new Node(data);
		if((front==null)&&(rear==null)){
			front=temp;
			rear=temp;
//			System.out.println("Empty Queue");
		}else{
			rear.next=temp;
			rear=temp;
		}
	}
	public int dequeue(){
		if(front==null){
			return Integer.MIN_VALUE;
		}
		Node temp=front;
		front=front.next;
		temp.next=null;
		if(temp==null){
			System.out.println("Queue is full");
		}
		if(front==null){
			rear=null;
		}
		return temp.data;
	}
}
