class UniqueArrFreq{
	public static void main(String[] args){
		int[] arr={1,2,34,5,6,7,8,9,10,2,4,6,89,11,345,547,32,33,2,6,8,9,2,5,8,0};
		int[] freq=new int[1000];
		for(int i=0;i<arr.length;i++){
			freq[arr[i]]++;
		}
		int count=0;
		for(int i=0;i<freq.length;i++){
			if(freq[i]==1) count++;
		}
		System.out.println(count);
	}
}
