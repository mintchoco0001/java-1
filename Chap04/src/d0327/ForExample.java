package d0327;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int a = 1;
//		int b = 2;
//		int c = 3;
//		int d = 4;
//		int e = 5;
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
//		�ݺ��� : for��, while ��
//			�ʱ�ȭ��; ���ǽ�; ������
//				  1		  2		 4
		for (int i = 1; i < 6; i++) {
//					3		
			System.out.println(i);
		}
//		1~5�� ���� ���϶� �հ躯�� =sum
//		int sum = 0;
//		for (int i = 1; i < 6; i++) {
//			sum += i;
//}
//		System.out.println(sum);
//		int sum =0;
//		for (int i = 1; i<=10; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		}
//		Ű����� 2�� ���� �Է¹޵�
//		���������� ū������ ���
//		ù��°��:3, �ι�°��:10
//		ù��°��:10, �ι�°�� :1
//		�̴��� �������� ���� �Էµǰ� �ϱ�
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		if (num <= num2) {
			for (int i = num; i <= num2; i++) {
				System.out.println(i);
			}
		} else {
			for (int i = num2; i <= num; i++) {
				System.out.println(i);
			}
		}
//		for (int i=num; i<=num2; i++) {
//			System.out.println(i);
//		}

	}

}
