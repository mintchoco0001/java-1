package d0326;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
//		int num = (int) (Math.random() * 6) + 1;
//		switch (num) {
//		case 1:
//			System.out.println("1이 나왔습니다");
//			break;
//
//		case 2:
//			System.out.println("2이 나왔습니다");
//			break;
//
//		case 3:
//			System.out.println("3이 나왔습니다");
//			break;
//
//		case 4:
//			System.out.println("4이 나왔습니다");
//			break;
//		default:
//			System.out.println("1~4 이외의 숫자가 나왔습니다");
//		}
////		case,default는 순서 꼭 지키고 case 안의 결과값만 얻으려면 꼭 break 자아애힘
////		default는 어차피 마지막 절차니 break 생략가능
//		switch (num % 2) // 정수,문자,문자열만 작성가능
//		{
//		case 0:
//			System.out.println("정수입니다");
//			break;
//
//		case 1:
//			System.out.println("홀수입니다");
//		}
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
//		키보드로 점수 입력받아 90이상A, 80이상B, 70이상C, 70미만이면 F문자열담기
//		이렇게 하던가
//		String str = "A";
//		str = "";
//		if (num >= 90) {
//			 str = "A";
//		}else if(num >=80) {
//			 str = "B";
//		}else if(num >=70) {
//			 str = "C";
//		}else {
//			 str = "F";
//		}
//		
		String str = "A";
		str = (num>=90)?"A":(num>=80)?"B":(num>=70)?"C":"F";
		switch (str) {
		case "A":
			System.out.println("A등급 입니다");
			break;
		case "B":
			System.out.println("B등급 입니다");
			break;
		case "C":
			System.out.println("C등급 입니다");
			break;
		default:
			System.out.println("학사경고");
		}
	}

}
