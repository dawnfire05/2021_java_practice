package Exe20;

public class test_overloading {
	public int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	public int sum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	public static void main(String[] args) {
		test_overloading exam = new test_overloading();
		System.out.println(exam.sum(3, 5));
		System.out.println(exam.sum(3, 5, 8));
	}
}