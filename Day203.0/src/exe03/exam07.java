package exe03;

public class exam07 {

	public static void main(String[] args) {
		Car myCar1 = new Car("����", 0);
		myCar1.color = "����";
		myCar1.speed = 0;
		
		Car myCar2 = new Car("�Ķ�", 0);
		myCar2.color = "�Ķ�";
		myCar2.speed = 0;
		
		Car myCar3 = new Car("�ʷ�", 0);
		myCar3.color = "�ʷ�";
		myCar3.speed = 0;
		
		myCar1.upSpeed(50);
		System.out.println("�ڵ���1�� ������ " + myCar1.getColor() + "�̸�, �ӵ��� " + myCar1.getSpeed() + "km�Դϴ�.");
		
		myCar1.upSpeed(20);
		System.out.println("�ڵ���2�� ������ " + myCar2.getColor() + "�̸�, �ӵ��� " + myCar2.getSpeed() + "km�Դϴ�.");
		
		myCar1.upSpeed(250);
		System.out.println("�ڵ���3�� ������ " + myCar3.getColor() + "�̸�, �ӵ��� " + myCar3.getSpeed() + "km�Դϴ�.");

	}

}