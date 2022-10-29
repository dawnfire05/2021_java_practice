package Exe16;

import java.util.Scanner;

public class dongjeon {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		int[][] coins= {{50000,0},{10000,0},{5000,0},{1000,0},{500,0},{100,0},{50,0},{10,0}};
		int money=Scan.nextInt();
		for(int a = 0; a<=7; a++) {
				coins[a][1] = money / coins[a][0];
				money= money % coins[a][0];
				System.out.println(coins[a][0] + "¿ø: " + coins[a][1]);
		}
		Scan.close();
	}
}