class SearchingAlgos{
	public int Search(int[] a,int data){
		int result=-1;
		for(int i=0;i<a.length;i++){
			if(a[i]==data){
				result=i;
				break;
			}
		}
		return result;
	}
}
