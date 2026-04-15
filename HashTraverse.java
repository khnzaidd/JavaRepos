import java.util.*;
class HashTraverse{
	public static void main(String[] args){
		Map<String,String> person=new HashMap<>();
		person.put("name","Akash");
		person.put("age","22");
		person.put("city","Allahabad");
		Set<String> k=person.keySet();
		for(String s:k){
			System.out.println(s+" "+person.get(s));
		}
		Collection<String> v=person.values();
		for(String val:v){
			System.out.println(val);
		}
		Iterator<String> it=v.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		for(Map.Entry<String,String> entry:person.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
