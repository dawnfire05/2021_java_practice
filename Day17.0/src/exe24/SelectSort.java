package exe24;

public class SelectSort {
	
	static void swap(int arr[], int indx1, int indx2) {
		int temp = arr[indx1];
		arr[indx1]=arr[indx2];
		arr[indx2]=temp;
	}
	
	static void SelectionSort(int arr[], int n){
		for(int i = 0; i < n-1; i++) {
			int min = i;
			for(int j = i+1; j<n; j++) {
				if(arr[j]<arr[min])
					min = j;
			}
			swap(arr,i,min);
		}
	}
}
