class AnonyMain{
	public static void main(String[] args){
//		MyClass m1=new MyClass();
		m1.myMethod(new AnonyClass(){
			public void display(){
				System.out.println("Display method");
			}
		});
	}
}

