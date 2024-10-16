package d0326;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String a = sc.next();
		int n2 = sc.nextInt();

		if (a.equals("+")) {
			System.out.println(n + a + n2 + "=" + (n + n2));
		} else if (a.equals("-")) {
			System.out.println(n + a + n2 + "=" + (n - n2));
		} else if (a.equals("*")) {
			System.out.println(n + a + n2 + "=" + (n * n2));
		} else if (a.equals("/")) {
			System.out.println(n + a + n2 + "=" + (n / n2));
		} else {
			System.out.println("잘못 입력 하셨습니다.");
		}

		int score = 85;
		System.out.print("등급은");
		if (score < 70) {
			System.out.print("D");
		} else if (score < 80) {
			System.out.print("C");
		} else if (score < 90) {
			System.out.print("B");
		} else {
			System.out.print("A");
		}
		System.out.println("입니다");
	}

}
