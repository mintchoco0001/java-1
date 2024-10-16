package d0325;

import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		int v1 = 10;
		int v2 = 3;
		int v3 = 14;
		double v4 = v1 * v1 * (Double.parseDouble(v2 + "." + v3));
		System.out.println(v4);
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디:");
		String name = sc.nextLine();

		System.out.println("패스워드:");
		String strPassword = sc.nextLine();
		int password = Integer.parseInt(strPassword);

		if (name .equals("java") ) {
			if (password == 12345) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패:패스워드가 틀림");
			}
		} else {
			System.out.println("로그인 실패:아이디가 존재하지 않음");
		}
		
	}
}
