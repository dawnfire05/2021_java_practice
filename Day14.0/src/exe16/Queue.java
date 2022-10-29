package exe16;

public class Queue {
	private int max;
	private int num;
	private int[] que;
	
	private int front = 0;
	private int rear = max;
	
	public Queue(int capacity) {
		num = 0;
		max = capacity;
		try {
			que = new int[max];
		}catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public int enque(int x) {
		
		if (num >= max)
			que[num++] = x;
		return x;
	}
	
	public int deque() {
		if (num <= 0)
			System.out.print("¸ø ³Ö¾î");
		int x = que[0];
		for(int i = 0; i<num; i++)
			que[i] = que[i+1];
		num--;
		return x;
		//return que[front++];
	}
	

}
