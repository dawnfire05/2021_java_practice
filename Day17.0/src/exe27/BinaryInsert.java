package exe27;

public class BinaryInsert {
	
	static void insertSort(int arr[], int n){
		for(int i = 1; i<n; i++) {
			int temp = arr[i];
			
			int start=0;
			int end=i;
			
		    while (start <= end) {
		        int j = (start + end) / 2;
		        if(arr[j] == arr[i]) {
		        	start = j;
		        }else if (arr[j] < arr[i]) {
		            start = j + 1;
		        }else if (arr[i] < arr[j]) {
		            end = j - 1;
		        }
		        
		    for(i++; i>start; i--) {
		    	arr[i-1]=arr[i-2];
		    }
		    
		    arr[start] = temp;

		    }
		}
	}
}
