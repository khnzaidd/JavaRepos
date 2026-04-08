class LQueueMain{
	public static void main(String[] args){
		LQueue lm=new LQueue();
		lm.enqueue(10);
		lm.enqueue(20);
		lm.enqueue(30);
		System.out.println(lm.dequeue());
		System.out.println(lm.dequeue());
	}
}
