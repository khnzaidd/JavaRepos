class DoubleQMain{
	public static void main(String[] args){
		DoubleEndQueue dq=new DoubleEndQueue();
		dq.enqueue1(10);
		dq.enqueue1(20);
		dq.enqueue1(30);
		System.out.println(dq.dequeue1());
		System.out.println(dq.dequeue1());
		dq.enqueue2(60);
		dq.enqueue2(80);
		System.out.println("dequeue2: "+dq.dequeue2());
//		System.out.println(dq.dequeue1());
	}
}
