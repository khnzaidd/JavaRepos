import java.util.*;
class VectorNext{
	public static void main(String[] args){
		Vector<String> places=new Vector<>();
		places.add("Allahabad");
		places.add("Banglore");
		places.add("Chennai");
		Enumeration<String> en=places.elements();
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}
	}
}
