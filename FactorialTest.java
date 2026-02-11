class FactorialTest{
	public int fact(int n){
		int result=1;
		for(int i=1;i<=n;i++){
			result=result*i;
		}
		return result;
//		if(n==1||n==0) return 1;
//		return n*fact(n-1);
	}
}

