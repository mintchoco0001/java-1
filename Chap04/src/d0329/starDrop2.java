package d0329;

import java.util.Scanner;

public class starDrop2 {

	public static void main(String[] args) {
		// �� �޾Ƽ� �� ���

		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� ����: ");
		int num = sc.nextInt();

		// ���� �� �����
		for (int i = 0; i < num; i++) {
			for (int j = 1; j < num - i; j++) {
				System.out.print(" ");
			}
			// �� ��� ���� Ȧ�� �����
			for (int j = 1; j <= (2 * (i + 1)) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// �� �� �� �����
		for (int i = 1; i < num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (2 * num) - 1 - (2 * i); j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
