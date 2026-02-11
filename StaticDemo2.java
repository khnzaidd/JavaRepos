class StaticDemo2{
	int x=10;
	static int y=20;
	public static void main(String[] args){
		StaticDemo2 sd1=new StaticDemo2();
		StaticDemo2 sd2=new StaticDemo2();
		System.out.println(sd1.x);
		System.out.println(sd1.y);
		System.out.println(sd2.x);
		System.out.println(sd2.y);
		sd1.x=15;
		sd1.y=25;
		System.out.println(sd1.x);
		System.out.println(sd1.y);
		System.out.println(sd2.x);
		System.out.println(sd2.y);
	}
}
