class StaticNonStatic{
	{
		System.out.println("This is non Static block");
	}
	static{
		System.out.println("This is a Static block");
	}
	public static void main(String[] args){
		System.out.println("Zaid");
		StaticNonStatic sns1=new StaticNonStatic();
		StaticNonStatic sns2=new StaticNonStatic();
	}
}
