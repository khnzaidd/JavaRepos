class MethodLocalDemo{
	int age=20;
	public void caller(){
		class LocalDemo{
			String name="Anas Khan";
			public void display(){
				System.out.println(name);
				System.out.println(age);
			}
		}
		return new LocalDemo();
		//ld.display();
	}
}
