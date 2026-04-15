import java.util.*;
class QueueTester{
	public static void main(String[] args){
		Queue<String> queue=new LinkedList<>();
		queue.offer("Lucknow");
		queue.offer("Kanpur");
		queue.offer("Unnao");
		while(queue.peek()!=null){
			System.out.println(queue.poll());
		}
	}
}
