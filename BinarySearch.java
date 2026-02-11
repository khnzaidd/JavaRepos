class BinarySearch{
	int binarySearch(int[] a,int low,int high,int data){
		if (low<=high){
			int mid=(low+high)/2;
			if(data==a[mid]){
				 return mid;
			}else if(data<a[mid]){
				return binarySearch(a,low,mid-1,data);
			}else if(data>a[mid]){
				return binarySearch(a,mid+1,high,data);
			}
		}
		return -1;
	}
	public static void main(String[] args){
		int[] arr={2,6,8,10,15,25,70,89,95,109};
		BinarySearch bs=new BinarySearch();
		int result=bs.binarySearch(arr,0,arr.length,15);
		if(result>=0){
			System.out.println("data found at index "+result);
		}else if (result==-1){
			System.out.println("Data not found");
		}
	}
}
