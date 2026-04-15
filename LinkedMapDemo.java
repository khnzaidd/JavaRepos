import java.util.*;
class LinkedMapDemo{
	public static void main(String[] args){
		Map<String,String> lm=new LinkedHashMap<>();
		lm.put("name","Ajay");
		lm.put("class","upper");
		lm.put("school","aquarium");
		Set<String> st=lm.keySet();
		for(String key:st){
			System.out.println(key+" "+lm.get(key));
		}
	}
}
