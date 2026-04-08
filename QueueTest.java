class QueueTest{
	public static void main(String[] args){
		Queue qs=new Queue(10);
		qs.enqueue(10);
		qs.enqueue(20);
		qs.enqueue(30);
		System.out.println("First: "+qs.dequeue());
		System.out.println("Second "+qs.dequeue());
		System.out.println("Third "+qs.dequeue());
	}
}
