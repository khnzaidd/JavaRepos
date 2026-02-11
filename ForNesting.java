class ForNesting{
	public static void main(String[] args){
		ab:
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(j==2) continue ab;
				System.out.println(i+" "+j);
			}
		}
	}
}
