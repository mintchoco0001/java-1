package d0326;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
//		int num = (int) (Math.random() * 6) + 1;
//		switch (num) {
//		case 1:
//			System.out.println("1�� ���Խ��ϴ�");
//			break;
//
//		case 2:
//			System.out.println("2�� ���Խ��ϴ�");
//			break;
//
//		case 3:
//			System.out.println("3�� ���Խ��ϴ�");
//			break;
//
//		case 4:
//			System.out.println("4�� ���Խ��ϴ�");
//			break;
//		default:
//			System.out.println("1~4 �̿��� ���ڰ� ���Խ��ϴ�");
//		}
////		case,default�� ���� �� ��Ű�� case ���� ������� �������� �� break �ھƾ���
////		default�� ������ ������ ������ break ��������
//		switch (num % 2) // ����,����,���ڿ��� �ۼ�����
//		{
//		case 0:
//			System.out.println("�����Դϴ�");
//			break;
//
//		case 1:
//			System.out.println("Ȧ���Դϴ�");
//		}
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
//		Ű����� ���� �Է¹޾� 90�̻�A, 80�̻�B, 70�̻�C, 70�̸��̸� F���ڿ����
//		�̷��� �ϴ���
//		String str = "A";
//		str = "";
//		if (num >= 90) {
//			 str = "A";
//		}else if(num >=80) {
//			 str = "B";
//		}else if(num >=70) {
//			 str = "C";
//		}else {
//			 str = "F";
//		}
//		
		String str = "A";
		str = (num>=90)?"A":(num>=80)?"B":(num>=70)?"C":"F";
		switch (str) {
		case "A":
			System.out.println("A��� �Դϴ�");
			break;
		case "B":
			System.out.println("B��� �Դϴ�");
			break;
		case "C":
			System.out.println("C��� �Դϴ�");
			break;
		default:
			System.out.println("�л���");
		}
	}

}
