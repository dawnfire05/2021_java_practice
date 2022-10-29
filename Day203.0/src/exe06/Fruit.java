package exe06;

class Fruit {
	String type;
	int number;
	
	void Buy(int n) {
		number += n;
	}
	
	void Sell(int n) {
		number -= n;
	}
}
