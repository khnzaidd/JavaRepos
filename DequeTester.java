import java.util.*;
class DequeTester{
	public static void main(String[] args){
		Deque<String> deque=new ArrayDeque<>();
		deque.offerFirst("Lucknow");
		deque.offerLast("Kanpur");
		deque.offerFirst("Kannauj");
		deque.offerLast("kashmir");
		while(deque.peekFirst()!=null){
			System.out.println(deque.pollFirst());
		}
	}
}
