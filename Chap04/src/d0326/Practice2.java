package d0326;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		3~5 6~8 9~11 12~2
		int a = sc.nextInt();
		String str = "��";
		str = (a<=3)?"��":(a<=6)?"B":(a<=9)?"C":(a<=12)?"F":".";
		switch (str) {
		case "��":
			System.out.println(a + "���� �� �Դϴ�");
			break;
		case "����":
			System.out.println(a + "���� ���� �Դϴ�");
			break;
		case "����":
			System.out.println(a + "���� ���� �Դϴ�");
			break;
		case "�ܿ�":
			System.out.println(a + "���� �ܿ� �Դϴ�");
			break;
		default:
			System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
		}
	}

}
