package exe22;

public class HelloRun {
	public void go() {
		HelloWorld hello1 = new HelloWorld();
		hello1.doyoulikeprint();
		
		HelloWorld hello2 = new HelloWorld("My Hello World!!");
		hello2.doyoulikeprint();
		
		HelloWorld hello3 = new HelloWorld("Hello", 2);
		hello3.doyoulikeprint();
		
		hello2.setMsg("반갑습니다!!");
		hello2.doyoulikeprint();
		System.out.println(hello2.getMsg());
		
		HelloWorld.prefix = "Grettings: ";
		hello2.doyoulikeprint();
		hello3.doyoulikeprint();
		HelloWorld.prefix = "인사말: ";
		hello2.doyoulikeprint();
		hello3.doyoulikeprint();
	}
	
	public static void main(String[]args) {
		HelloRun hr = new HelloRun();
		hr.go();
	}
}
