class CastingDemo{
	byte b=20;
	int a=20;
	int x=b;
	byte y=(byte)a;
	public static void main(String[] args){
		CastingDemo cd=new CastingDemo();
		System.out.println(cd.x);
		System.out.println(cd.y);
	}
}
