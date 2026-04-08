class SBTester{
	public static void main(String[] args){
		StringBuilder sb=new StringBuilder();
		StringBuilder sb2=new StringBuilder(20);
		StringBuilder sb3=new StringBuilder("Lucknow");
		System.out.println(sb3);
		System.out.println(sb.length()+" "+sb.capacity());
		System.out.println(sb2.length()+" "+sb2.capacity());
		System.out.println(sb3.length()+" "+sb3.capacity());
		StringBuilder sb4=new StringBuilder();
		sb4.append("Lucknow");
		//System.out.println(sb4==sb5);
		System.out.println(sb4.length()+" "+sb4.capacity());
		sb4.append(" Jucntion");
		System.out.println(sb4.length()+" "+sb4.capacity());
		sb4.append(" East");
		System.out.println(sb4.length()+" "+sb4.capacity());
	}
}
