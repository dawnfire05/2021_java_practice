package Exe19;
//���� Ŭ����
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
			gen = "����";
		}
		else 
			gen = "����";
		System.out.println("����: " + gen);
		System.out.println("����: " + age);
		System.out.println("�̸�: " + name);
		System.out.println("Ű: " + tall);
		System.out.println("������: " + weight);
		System.out.println("����Ƚ��: " + count);
		String yeon;
		if(love=true) {
			yeon = "����";
		}
		else 
			yeon = "����";
		System.out.println("��ģ/��ģ ����: " + yeon);
	}
		
}