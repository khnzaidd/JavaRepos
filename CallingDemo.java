class CallingDemo{
	void printer(){
		System.out.println("Printer");
	}
	static void Display(){
		System.out.println("Display");
	}
	void caller(){
		CallingDemo cd=new CallingDemo();
		printer();
		Display();
		//CallingDemo.printer();
		CallingDemo.Display();
		cd.printer();
		cd.Display();
	}
	public static void main(String[] args){
		CallingDemo cd1=new CallingDemo();
		//printer();
		Display();
		//CallingDemo.printer();
		CallingDemo.Display();
		cd1.printer();
		cd1.Display();
		cd1.caller();
	}
}
