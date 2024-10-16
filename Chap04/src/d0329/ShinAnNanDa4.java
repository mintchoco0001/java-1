package d0329;

import java.util.Iterator;
import java.util.Scanner;

public class ShinAnNanDa4 {

	public static void main(String[] args) {
		System.out.println("별 줄 개수");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 1; j <= 2 * (i + 1) - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * (i + 1) - 1); j++) {
				System.out.print("*");
			}
			System.out.print("");
		}
		for (int i = 1; i < num; i++) {
			for (int j = 1; j <= i; j++) {

			}
			for (int j = 0; j < args.length; j++) {

			}

		}
	}

	{
	}
}
