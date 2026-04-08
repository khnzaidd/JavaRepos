interface MyInterface{
	void display();
}
class AnonyInner{
	private String name="Zaid Khan";
	MyInterface mi=new MyInterface(){
		public void display(){
			System.out.println(name);
		}
	};
}
