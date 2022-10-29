package Exe19;
//피플 클래스
class People {
	public boolean gender;
	public int age;
	public String name;
	public float tall;
	public float weight;
	public int count;
	public boolean love;
	
	public void printPeople() {
		String gen;
		if(gender=true) {
			gen = "남자";
		}
		else 
			gen = "여자";
		System.out.println("성별: " + gen);
		System.out.println("나이: " + age);
		System.out.println("이름: " + name);
		System.out.println("키: " + tall);
		System.out.println("몸무게: " + weight);
		System.out.println("연애횟수: " + count);
		String yeon;
		if(love=true) {
			yeon = "있음";
		}
		else 
			yeon = "없음";
		System.out.println("여친/남친 유무: " + yeon);
	}
		
}