class PcTester{
	public static void main(String[] args){
		ParentDemo p=new ChildDemo();
		System.out.println(p.add(2,5));
		System.out.println(p.add(2,5,10));
//		System.out.println(p.add(2,5,10,15));
	}
}
