class DemoTester{
	int age;
	private DemoTester(){
		age=20;
	}
	public void display(){
		System.out.println("Display Method");
	}

	public static DemoTester getInstance(){
		return new DemoTester();
	}
}
