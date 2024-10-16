package d0329;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
//		int num2 = num / 100 * 100;
		System.out.println(num/100*100);

		System.out.println("정수를 입력하세요 : ");
		String str = sc.nextLine();
//		int sum= 0;
//		
//		for(int i=0; i<str.length();i++){
//			sum+= str.charAt(i) - '0';
//		}
//		System.out.println("결과 : "+sum);

		

	}
}