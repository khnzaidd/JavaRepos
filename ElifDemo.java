class ElifDemo{
	public static void main(String[] args){
		int x=10,y=20,z=30;
		if(x<y) if(y>z) if(z<x){
			System.out.println("x<y");
		}else{
			System.out.println("y>z");
		}else{
			System.out.println("z>x");
		}else{
			System.out.println("all false");
		}
	}
}
