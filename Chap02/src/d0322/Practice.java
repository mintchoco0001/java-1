package d0322;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		String name = "김자바";
		System.out.println("이름: " + name);
		int age = 25;
		System.out.print("나이: "+ age);
		String tel1="010", tel2="123", tel3="4567";
		System.out.printf("\n전화: %s-%s-%s \n" , tel1, tel2, tel3);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 수 : ");
		String strnum1 = sc.nextLine();
		
		System.out.print("두 번째 수 : ");
		String strnum2 = sc.nextLine();
		
		int num1 = Integer.parseInt(strnum1);
		int num2 =Integer.parseInt(strnum2);
		int result = num1+num2;
		System.out.println("덧셈 결과: " + result);
		
		System.out.print("1. 이름: ");
		String uname = sc.nextLine();
		System.out.print("2. 주민번호 앞 6자리: ");
		String ss = sc.nextLine();
		System.out.print("3. 전화번호: ");
		String dd = sc.nextLine();
		
		System.out.println("1. 이름: " + uname);
		System.out.println("2. 주민번호 앞 6자리: " + ss);
		System.out.println("3. 전화번호: " + dd);
	}

}
