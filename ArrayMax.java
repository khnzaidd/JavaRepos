class ArrayMax{
	public static void main(String[] args){
		int[] arr={3,5,7,6,8,4,1};
		int max=arr[0];
		int smax=arr[0];
		for(int i=1;i<arr.length;i++){
			if(max<arr[i]){
				smax=max;
				max=arr[i];
			}else if(smax<arr[i]){
				smax=arr[i];
			}
		}
		System.out.println(smax);
	}
}
