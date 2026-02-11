class PowerTest{
	public int power(int a,int n){
		if(n==0) return 1;
		if(n==1) return a;
		return a*power(a,n-1);
	}

	public static void main(String[] args){
		PowerTest pt=new PowerTest();
		int result=pt.power(3,4);
		System.out.println(result);
	}
}
