class StaticTester{
	public static void main(String[] args){
		StaticVarDemo sd1=new StaticVarDemo();
		StaticVarDemo sd2=new StaticVarDemo();
		sd1.display();
		sd2.display();
		sd1.x=15;
		sd2.y=30;
		sd1.display();
		sd2.display();
	}
}
