package exe22;

public class HelloWorld {
	private String msg;
	static int count = 0;
	static String prefix = "";
	
	public HelloWorld() {
		msg = "Hello World !!";
	}
	
	public HelloWorld(String msg) {
		this.msg = msg;
	}
	
	public HelloWorld(String msg, int option) {
		if(option == 1)
			this.msg = msg;
		else if(option == 2)
			this.msg = msg + ", æ»≥Á«œººø‰?";
	}
	
	public void doyoulikeprint() {
		// System.out.println(msg);
		count++;
		System.out.println("[" + count + "]" + prefix + msg);
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
