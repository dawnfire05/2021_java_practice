package Exe20;

class SuperClass{
	String getResult(String msg) {
		return "**" + msg;
	}
}

class subClass extends SuperClass{
	String getResult(String msg) {
		return "##" + msg;
	}
}


public class overriding{
public static void main(String[] args) {
	SuperClass exam = new SuperClass();
	subClass exam2 = new subClass();
	exam.getResult("��������");
	exam2.getResult("��");
	}	
}
