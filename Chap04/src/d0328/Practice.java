package d0328;

import java.util.Iterator;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			System.out.print("");
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i < 5; i++) {
			for (int j = 4; j > 0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-------------------------------");
			System.out.println("����> ");

			int menuNum = Integer.parseInt(sc.nextLine());
			switch (menuNum) {
			case 1:
				System.out.print("���ݾ�> ");
				balance += Integer.parseInt(sc.nextLine());
				break;
			case 2:
				System.out.print("��ݾ�> ");
				balance -= Integer.parseInt(sc.nextLine());
				break;
			case 3:
				System.out.print("�ܰ�> ");
				System.out.println(balance);
				break;
			case 4:
				run = false;
				break;
			}
			
			System.out.println();
		}

		System.out.println("���α׷� ����");
	}
}
