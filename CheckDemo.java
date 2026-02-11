class CheckDemo{
	public static void main(String[] args){
		int num=8;
		if((num&(num-1))==0){
			System.out.println(num + " " +  "is in form 2^n");
		}else{
			System.out.println("It's not in form 2^n");
		}
	}
}
