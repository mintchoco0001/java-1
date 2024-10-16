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
//		반복문 : for문, while 문
//			초기화식; 조건식; 증감식
//				  1		  2		 4
		for (int i = 1; i < 6; i++) {
//					3		
			System.out.println(i);
		}
//		1~5의 합을 구하라 합계변수 =sum
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
//		키보드로 2개 숫자 입력받되
//		작은수부터 큰수까지 출력
//		첫번째수:3, 두번째수:10
//		첫번째수:10, 두번째수 :1
//		이더라도 작은수가 먼저 입력되게 하기
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
