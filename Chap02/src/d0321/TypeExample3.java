package d0321;

import java.util.Scanner;

public class TypeExample3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str2 = sc.nextLine();
//		str+str2를 연산해서100200이 아닌 300으로 출력해보기 
		System.out.println(str+str2);
		short s1 = Short.parseShort(str);
		short s2 = Short.parseShort(str2);
		System.out.println(s1+s2);
//		byte +byte = int
//		byte +short = int
//		short +int = int
//		int +int = int
//		int +long = long
//		
//		문자열을 기본 데이터 타입으로 바꾸는 방법
//		byte타입 -> Byte.parseByte(문자열)\
//		int -> Integer.parseInt(문자열)
//		
//	    syso(정수 + 정수) -> 정수
//	    syso(문자열 + 정수 + 정수) -> 문자열+정수+정수 -> 문자열
//	    syso(문자열 + 문자열) -> 문자열 +문자열 -> 문자열
		
		System.out.println('A'+1);//char+정수 ->int
		
		char ch = 'A'+1;
//		char ch =66;
		System.out.println(ch);
		
		String str5 = 10+"";
		String str6 = String.valueOf(10);
		
		String var4 ="3.9";
		double p1 = 2.5;
		float p2 = 1.8f;
		int result = Integer.parseInt(var4);
		System.out.println(result);
	}

}
