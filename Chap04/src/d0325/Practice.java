package d0325;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		int p = 534;
		int s = 30;
		int ps = p / s;
		int psn = p % s;
		System.out.println(ps);
		System.out.println(psn);
		int v1 = 5;
		int v2 = 2;
		double v3 = (double) v1 / v2;
		System.out.println(v3);
		int v4 = (int) (v3 * v2);
		System.out.println(v4);
		int v = 356;
		System.out.println(v / 100 * 100);
		float a1 = 10f;
		float a2 = a1 / 100;
		System.out.println(a2);
		if (a2 == 0.1) {
			System.out.println("10프로다");
		} else {
			System.out.println("10프로가 아니다");
		}
		int lt = 5;
		int lb = 10;
		int h = 7;
		double area = (double) (lt + lb) * h / 2;
		System.out.println(area);

		Scanner sc = new Scanner(System.in);
		String snum1 = sc.next();
		String snum2 = sc.next();
		double num1 = Double.parseDouble(snum1);
		double num2 = Double.parseDouble(snum2);
		if ( num2 == 0) {
			System.out.println("무한대");
		} else {
			System.out.println(num1/num2);
		}
	}

}
