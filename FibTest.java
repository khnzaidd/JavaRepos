class FibTest{
	public int fib(int n){
		if(n==1||n==2) return 1;
		return fib(n-1)+fib(n-2);
	}

	public static void main(String[] args){
		FibTest ft=new FibTest();
		int result=ft.fib(49);
		System.out.println(result);
	}
}
