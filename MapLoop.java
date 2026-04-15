import java.util.*;
class MapLoop{
	public static void main(String[] args){
		Map<String,String> mp=new TreeMap<>();
		mp.put("name","Arsh Kumar");
		mp.put("city","Sitapur");
		mp.put("college","Integral University");
		Set<String> st=mp.keySet();
		for(String key:st){
			System.out.println(key+" "+mp.get(key));
		}
	}
}
