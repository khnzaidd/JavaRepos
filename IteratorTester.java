import java.util.*;
class IteratorTester{
	public static void main(String[] args){
		List<String> names=new ArrayList<>();
		names.add("Zaid");
		names.add("Khan");
		names.add("Mukul");
		names.add("Chaudhary");
		names.add("Christopher");
		names.add("Henry");
		Iterator<String> it=names.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}

