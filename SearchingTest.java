class SearchingTest{
	public static void main(String[] args){
		int[] a={2,30,8,7,6,5,13,56,78,89,34,19};
		int x=13;
		SearchingAlgo sa=new SearchingAlgo();
		int result=sa.linearSearch(a,x);
		if(result==-1){
			System.out.println("Data not found");
		}else{
			System.out.println("Data found at "+result);
		}
	}
}
