package d0328;

import java.util.Iterator;
import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
//		�������� �� �����
		int sum = 0;
		for (int i = 1; i < 10; i++) {
			System.out.println("������" + " " + i + " ����");
			for (int j = 1; j < 10; j++) {
				sum = i * j;
				System.out.println(i + "x" + j + "=" + sum + "   ");
			}

		}
		for (int i = 1; i < 10; i++) {
			System.out.println('\n' + "1~9������ ���ڿ� " + i + "���ϱ�");
			for (int j = 1; j < 10; j++) {
				sum = i * j;
				System.out.print(j + "x" + i + "=" + sum + "    ");
			}

		}
		System.out.println();

		for (int i = 1; i < 10; i++) {
			
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d X %d = %d   ",i,j,i*j);
			}System.out.println();
		}
	}

}
