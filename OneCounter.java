class OneCounter{
	public static void main(String[] args){
		int count=0;
		int x=45;
		while(x!=0){
			if((x&1)==1){
				count++;
			}
			x=x>>>1;
		}
	System.out.println(count +"  is the number of ones");
	}
}
