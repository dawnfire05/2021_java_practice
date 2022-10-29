package exe25;

public class InsertionSort {

	static void insertSort(int arr[], int n){
		for(int i = 1; i<n; i++) {
			int j;
			int temp = arr[i];
			for(j = i; j>0 && arr[j-1] > temp; j--) {
				arr[j]= arr[j-1];
			}
			arr[j] = temp;
		}
	}
}
