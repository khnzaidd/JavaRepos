class Outer{
	static private String name="Zaid Khan";
	//Outer(String s){
	//	name=s;
	//}
	static class Inner{
		private int age;
		Inner(int a){
			age=a;
		}
		public void printer(){
			System.out.println(age);
			System.out.println(name);
		}
	}
}
