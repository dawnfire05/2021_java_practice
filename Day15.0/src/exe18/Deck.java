package exe18;

public class Deck {
	private int max;
	private int front;
	private int rear;
	private int num;
	private int[] que;
	
	public class EmptyDeckException extends RuntimeException{
		public EmptyDeckException() {}
	}
	
	public class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQueueException() {}
	}
	
	public Deck(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int [max];
		}catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public int enqueFront(int x) {
		que[front--] = x;
		num++;
		if(front<=0)
			front = max-1;
		return x;
	}
	
	public int enqueRear(int x) {
		que[rear++] = x;
		num++;
		if(rear == max-1)
			rear = 0;
		return x;
	}
	
	public int dequeFront() {
		int x = que[front++];
		num--;
		if(front >= max-1)
			front = 0;
		return x;
	}
	
	public int dequeRear() {
		int x = que[rear--];
		num--;
		if(front <= max-1)
			rear = max-1;
		return x;
	}
	
}
