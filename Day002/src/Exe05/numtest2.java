package Exe05;

public class numtest2 {

	public static void main(String[] args) {
		int num1 = 313;
		long num2 = 15L;
		
		long result1 = num1 * num2;
		System.out.println("== �ڵ� ����ȯ ==");
		System.out.printf("result1 : %d \n", result1);
		
		long result2 = num1 / num2;
		double result3 = num1 / num2;
		double result4 = num1 / 15.0;
		
		System.out.println("== ����/�Ǽ� ���==");
		System.out.printf("result2-���� : %d \n", result2);
		System.out.printf("result3-�Ǽ� : %f \n", result3);
		System.out.printf("result4-�Ǽ� : %.5f \n", result4);
		
		int result5 = 1000000 * 1000000;
		
		System.out.println("== ���� �÷ο� ==");
		System.out.println(result5);
		
	}

}