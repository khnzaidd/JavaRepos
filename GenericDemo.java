class GenericDemo <T> {
	T x;
	public GenericDemo(T a){
		x=a;
	}
}

class GenericTester{
	public static void main(String[] args){
		GenericDemo <String> gd=new GenericDemo<>("Lucknow");
		System.out.println(gd.x);
		GenericDemo <Integer> gdd=new GenericDemo<>(10);
		System.out.println(gdd.x);
	}
}
