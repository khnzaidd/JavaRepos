class LocalInnerTester{
	public static void main(String[] args){
		MethodLocalDemo mld=new MethodLocalDemo();
		LocalDemo ld=mld.caller();
		ld.display();
	}
}
