package Exe13;

public class hangyeol {

	public static void main(String[] args) {
		String[][] members = {{"101", "이신비"}, {"102", "이신혁"}, {"103", "이신용"}};
		
		for(int i = 0; i <members.length; i++) {
			System.out.println(members[i][0] + ":" + members[i][1]);
		}
	}
}