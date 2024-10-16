package d0329;

import java.util.Scanner;

public class ShinAnNanDa2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("총 금액 입력: " + num);
		System.out.println("잔돈 : " + num);
		System.out.println("10,000원 : " + (num / 10000) + " 개");
		System.out.println("5,000 원 : " + (num % 10000) / 5000 + " 개");
		System.out.println("1,000 원 : " + (num % 5000) / 1000 + " 개");
		System.out.println("500 원 : " + (num % 1000) / 500 + " 개");
		System.out.println("100 원 : " + (num % 500) / 100 + " 개");

	}
}
