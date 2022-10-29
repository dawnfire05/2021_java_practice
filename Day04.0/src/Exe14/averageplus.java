package Exe14;

public class averageplus {

	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 45, 89, -7, -5};
		
		int sum = 0;
		double avg = 0;
		
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Че: " + sum);
		
		avg = sum / arr.length;
		System.out.println("ЦђБе: " + avg);
	}
}