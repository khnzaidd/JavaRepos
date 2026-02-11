class LocalVariableTest{
	void printer(){
		int i=10;
		if(true){
			i=20;
			System.out.println(i);
		}
		System.out.println(i);
	}
	public static void main(String[] args){
		LocalVariableTest lvt=new LocalVariableTest();
		lvt.printer();
	}
}
