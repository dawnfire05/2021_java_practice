package exe23;
import java.util.Scanner;

public class BubbleSort {

		static void swap(int arr[], int indx1, int indx2) {
			int temp = arr[indx1];
			arr[indx1]=arr[indx2];
			arr[indx2]=temp;
		}
		
		static void Bubble(int arr[], int n) {
			for(int i=0; i<n-1; i++) {
				for(int j=n-1; j>1; j--) {
					if(arr[j-1]>arr[j])
						swap(arr,j-1,j);
				}
			}
		}
		
		public static void main(String[]args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("<���� ����>");
			System.out.print("��ڼ�: ");
			int nx = scan.nextInt();
			int [] x = new int[nx];
			
			for(int i = 0; i<nx; i++) {
				System.out.print("x["+i+"]: ");
				x[i] = scan.nextInt();
			}
			
			Bubble(x,nx);
			System.out.println("���ĵǾ����ϴ�.");
			
			for(int i = 0; i< nx; i++)
				System.out.println("x[" + i + "]: " + x[i]);
		}
}
