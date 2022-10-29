package Exe20;

class Calculator{

	public static int left;
	public static int right;
	
	public static void sum() {
		System.out.println(Calculator.left+Calculator.right);
	}
	
	public static void avg() {
		System.out.println((Calculator.right+Calculator.left)/2);
	}
}



class multiplicationableCalculator extends Calculator{
	
	public void multiply() {
		System.out.println(left*right);
	}
}


class Employee{
	public static int period;
	public static int right;
	public static void sum(int period, int right) {
		System.out.println("급여: " + right*period);
	}
}

public class Company {

	public static void main(String[] args) {
		
		//인스턴스
		Calculator c1 = new Calculator();
		Calculator c2 = new Calculator();
		
		c1.left = 10;
		c1.right = 20;
		c1.sum();
		
		c2.left = 100;
		c2.right = 200;
		c2.sum();
		
		c1.avg();
		c2.avg();
		
		
		Employee.period = 2;
		Employee.right = 5000;
		Employee.sum(Employee.period, Employee.right);
	}

}