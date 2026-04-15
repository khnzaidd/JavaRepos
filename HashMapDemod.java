import java.util.*;
class HasMapDemod{
	public static void main(String[] args){
		Map<String,Integer> freq=new HashMap<>();
		freq.put("Kannauj",1);
		freq.put("Lucknow",2);
		Integer i=freq.get("Kanpur");
		System.out.println(i);
	}
}
