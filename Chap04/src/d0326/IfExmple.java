package d0326;

import java.util.Scanner;

public class IfExmple {
	public static void main(String[] args) {
		// if���� ���ǽ��� ���̸� ���� ��� �ƴϸ� ������ ���
		if (!true) {
			System.out.println("��");
		} else {
			System.out.println("����");
		}
//		�Ѱ��� �׸񿡼��� �����߰��� else if�߰� �������� ������ else�� ������
//		int score = 85;
//		if (score >= 80) {
//			System.out.println("80�� �̻��Դϴ�");
//
//		} else if (score >= 70) {
//			System.out.println("70�� �̻��Դϴ�");
//		} else {
//			System.out.println("�����Դϴ�");
//		}
//		�� �׸��� if�� �Ѱ� �� �޸� �ι� �����
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		if (num%2==0)
		//(num&1)==0 �ΰ��� ��밡��
		{
			System.out.println("¦���Դϴ�.");
		}else {
			System.out.println("Ȧ���Դϴ�");
		}
		
		
	}

}