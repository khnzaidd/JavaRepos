class SwitchDemo{
	public static void main(String[] args){
		int x=1;
		switch(x){
			case 1+2:
				System.out.println("3");
				break;
			case 5%2:
				System.out.println("1");
				break;
			case 7^9:
				System.out.println("third");
				break;
			default:
				System.out.println("default");
		}
	}
}
