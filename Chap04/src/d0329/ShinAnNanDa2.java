package d0329;

import java.util.Scanner;

public class ShinAnNanDa2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("�� �ݾ� �Է�: " + num);
		System.out.println("�ܵ� : " + num);
		System.out.println("10,000�� : " + (num / 10000) + " ��");
		System.out.println("5,000 �� : " + (num % 10000) / 5000 + " ��");
		System.out.println("1,000 �� : " + (num % 5000) / 1000 + " ��");
		System.out.println("500 �� : " + (num % 1000) / 500 + " ��");
		System.out.println("100 �� : " + (num % 500) / 100 + " ��");

	}
}
