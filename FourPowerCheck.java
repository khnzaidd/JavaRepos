class FourPowerCheck{
	public static void main(String[] args){
		int n=23;
		int count=0;
		if(((n&(n-1))==0) && ((n%3)==1)){
			System.out.println(n + " " + "is in form 4^n");
		}else{
			System.out.println(n + " " + "is not in form 4^n");
		}
	}
}
