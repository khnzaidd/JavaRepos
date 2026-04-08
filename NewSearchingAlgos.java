class NewSearchingAlgos extends SearchingAlgos{
	public int search(int[] a,int data){
		int low=0;
		int high=a.length-1;
		int mid=(low+high)/2;
		if(data==a[mid]){
			return mid;
		}else if(data<a[mid]){
			high=mid-1;
			return search(a,data);
		}else if(data>a[mid]){
			low=mid+1;
			search(a,data);
		}
	}
                return -1;
        }

