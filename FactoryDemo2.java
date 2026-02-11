class FactoryDemo2{
	public static FactoryDemo2 fd;
	public int age;
	static{
		fd=new FactoryDemo2();
	}
	private FactoryDemo2(){
		age=20;
	}
	public void show(){
		System.out.println("Shoe method");
	}
}
