import java.util.*;
class HashTableDemo{
	public static void main(String[] args){
		Hashtable<String,String> ht=new Hashtable<>();
		ht.put("name","Ajay Devgan");
		ht.put("age","46");
		ht.put("City","Mumbai");
		String n=ht.get("name");
		String m=ht.get("age");
		System.out.println(n+"	"+m);
	}
}
