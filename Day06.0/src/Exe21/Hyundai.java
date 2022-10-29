package Exe21;

public class Hyundai {

	public static void main(String[] args) {
		SportsCar c = new SportsCar();
		c.color = "Red";
		c.zerobaek(2);
		c.setTurbo(true);
		System.out.println(c);
	}

}

class Car{
	double speed;
	int gear;
	protected String color;
	public void zerobaek(int increament) {
		speed = increament + 0.5;
	}
}

class SportsCar extends Car {
	boolean turbo;
	public void setTurbo(boolean val) {
		turbo = val;
	}
	public String toString() {
		return "제로백= " + speed + " 색깔= " + color + " 터보= " +turbo;
	}
}