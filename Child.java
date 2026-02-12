class Child extends Parent{
	void printer(){
		System.out.println("Printer of child");
	}
	Child(){
//		super(5);
		System.out.println("Constructor of Child");
		super(5);
	}
}
