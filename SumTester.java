class SumTester{
	public static void main(String... args){
		SumDemo sd=new SumDemo();
		int re=sd.add(2,3);
		int res=sd.add(1,2,3,4);
		int res2=sd.add(5,6,7,8,9,18);
		System.out.println(re);
		System.out.println(res+" "+res2);
	}
}
