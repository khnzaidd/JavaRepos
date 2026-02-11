class FactoryTester{
	public static void main(String[] args){
		FactoryDemo fd1=FactoryDemo.factory(20,"Amit");
		FactoryDemo fd2=FactoryDemo.factory(30,"SUMIT");
		System.out.println(fd1.age+" "+fd1.name);
		System.out.println(fd2.age+" "+fd2.name);
	}
}
