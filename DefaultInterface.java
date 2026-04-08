interface DefaultInterface{
	default void mymethod(){}
	default void display(){}
	default void show(){}
	default void printer(){}
}

class NoAdapterDemo implements DefaultInterface{
	public void display(){
		System.out.println("Display");
	}
	public void mymethod2(){
		System.out.println("mymethod of class");
	}
}
