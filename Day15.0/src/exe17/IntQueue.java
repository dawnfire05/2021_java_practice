package exe17;

public class IntQueue {
	private int max;
	private int front;
	private int rear;
	private int num;
	private int[] que;
	
	public class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException() {}
	}
	
	public class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQueueException() {}
	}
	
	public IntQueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int [max];
		}catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public int enque(int x) throws OverflowIntQueueException{
		if(num >= max)
			throw new OverflowIntQueueException();
		que[rear++] = x;
		num++;
		if(rear ==max)
			rear = 0;
		return x;
	}
	
	public int deque() throws EmptyIntQueueException{
		if(num <= 0)
			throw new EmptyIntQueueException();
		int x = que[front++];
		num--;
		if(front == max)
			front = 0;
		return x;
	}
	
	
	public int peek() {
		if(num <= 0)
			throw new EmptyIntQueueException();
		return que[front];
	}
	
	public int indexOf(int x) {
		/*
		int result = 0;
		for(int i = 0; i<num; i++) {
			if(x==que[i])
				result = i;
			else
				result = -1;
		}
		return result;
		*/
		
		for (int i = 0; i< num; i++) {
			int idx = (i + front)%max;
			if(que[idx] == x)
				return idx;
		}
		return -1;
	}
	
	public void clear() {
		front = rear = num = 0;
	}
	
	public boolean IsEmpty() {
		/*
		if(num == max)
			return true;
		else
			return false;
		*/
		return num <= 0;
	}
	
	public boolean IsFull() {
		/*
		if(num == 0)
			return true;
		else
			return false;
		*/
		return num >= max;
	}
	
	public int search(int x) {
		/*
		for (int i = 0; i< num; i++) {
			int idx=(front+i)%max;
			if(x==que[idx])
				return i+1;
		}
		return -1;
		*/
		for(int i = 0; i< num; i++) {
			if(que[(i+front)%max]==x)
				return i+1;
			}
		return -1;
	}
}
