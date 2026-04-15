class Queue{
	private int[] queue;
	private int rear;
	private int front;
	public Queue(int n){
                queue=new int[n];
                rear=-1;
		front=-1;
        }
	public void enqueue(int data){
		if(rear==queue.length-1){
                        System.out.println("queue full");
		}else{
			queue[++rear]=data;
			front=0;
                }
        }
	public int dequeue(){
		if((front==-1)&&(rear==-1)) return Integer.MIN_VALUE;
		int data=queue[front++];
		if(front>rear){
			rear=-1;
			front=-1;
		}
		return data;
        }
}



