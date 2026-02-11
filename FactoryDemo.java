class FactoryDemo{
	int age;
	String name;
	public static FactoryDemo fd=null;
	private FactoryDemo(int a,String s){
		age=a;
		name=s;
	}
	public static FactoryDemo factory(int x,String y){
		if(fd==null){
			fd=new FactoryDemo(x,y);
		}
		return fd;
	}
}
