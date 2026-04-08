class MainClassSearch{
	public static void main(String[] args){
		int[] arr={2,3,4,5,6,7,8,9};
		SearchingAlgos sa=Factory.getInstance();
		int result=sa.search(arr,2);
		if(result==-1){
			System.out.println("Index not found");
		}else{
			System.out.println("Found at: "+result);
		}
	}
}
