import java.util.Vector;
class VectorArrayDemo{
	public static void main(String[] args){
		Vector <String> names=new Vector <> (3);
		names.add("Amir Khursheed");
		names.add("Yasir Ajaz");
		names.add("Mohd Arsh");
		System.out.println(names.capacity());
		System.out.println(names.size());
		names.add("Jack Sparrow");
		names.add("Noor Saba");
		System.out.println(names.capacity()+" "+names.size());
		System.out.println(names.get(0)+" "+names.get(1)+" "+names.get(2));
		names.set(0,"Amaan Khan");
		System.out.println(names.get(0)+" "+names.get(1)+" "+names.get(2));

	}
}
