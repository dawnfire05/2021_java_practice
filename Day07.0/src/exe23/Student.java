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
		System.out.println("이름: " + name + " 입학연도: " + year + " 반: " + classroom);
	}

	public static void main(String[] args) {
		Student myStudent = new Student("유영빈", 2021, "D반");
		myStudent.ShowId();
	}
}
