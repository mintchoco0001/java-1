package d0322;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		String name = "���ڹ�";
		System.out.println("�̸�: " + name);
		int age = 25;
		System.out.print("����: "+ age);
		String tel1="010", tel2="123", tel3="4567";
		System.out.printf("\n��ȭ: %s-%s-%s \n" , tel1, tel2, tel3);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° �� : ");
		String strnum1 = sc.nextLine();
		
		System.out.print("�� ��° �� : ");
		String strnum2 = sc.nextLine();
		
		int num1 = Integer.parseInt(strnum1);
		int num2 =Integer.parseInt(strnum2);
		int result = num1+num2;
		System.out.println("���� ���: " + result);
		
		System.out.print("1. �̸�: ");
		String uname = sc.nextLine();
		System.out.print("2. �ֹι�ȣ �� 6�ڸ�: ");
		String ss = sc.nextLine();
		System.out.print("3. ��ȭ��ȣ: ");
		String dd = sc.nextLine();
		
		System.out.println("1. �̸�: " + uname);
		System.out.println("2. �ֹι�ȣ �� 6�ڸ�: " + ss);
		System.out.println("3. ��ȭ��ȣ: " + dd);
	}

}
