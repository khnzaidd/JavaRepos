class StaticDemo{
	int x=10;
	static int y=20;
	public static void main(String[] args){
		StaticDemo sd=new StaticDemo();
		System.out.println(sd.x);
		System.out.println(sd.y);
		System.out.println(StaticDemo.x);
		System.out.println(StaticDemo.y);
	}
}
