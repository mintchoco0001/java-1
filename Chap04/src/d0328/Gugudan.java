package d0328;

import java.util.Iterator;
import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
//		구구단의 식 만들기
		int sum = 0;
		for (int i = 1; i < 10; i++) {
			System.out.println("구구단" + " " + i + " 단은");
			for (int j = 1; j < 10; j++) {
				sum = i * j;
				System.out.println(i + "x" + j + "=" + sum + "   ");
			}

		}
		for (int i = 1; i < 10; i++) {
			System.out.println('\n' + "1~9까지의 숫자에 " + i + "곱하기");
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
