package exe23;

public class Student {
	String name;
	int year;
	String classroom;
	
	public Student(String name, int year, String classroom) {
		this.name =name;
		this.year =year;
		this.classroom = classroom;
	}


	public void ShowId() {
		System.out.println("�̸�: " + name + " ���п���: " + year + " ��: " + classroom);
	}

	public static void main(String[] args) {
		Student myStudent = new Student("������", 2021, "D��");
		myStudent.ShowId();
	}
}
