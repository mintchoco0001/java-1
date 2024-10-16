package d0326;

import java.util.Scanner;

public class IfExmple {
	public static void main(String[] args) {
		// if문의 조건식이 참이면 참이 출력 아니면 거짓이 출력
		if (!true) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
//		한가지 항목에서의 조건추가시 else if추가 마지막은 무조건 else로 끝맺음
//		int score = 85;
//		if (score >= 80) {
//			System.out.println("80점 이상입니다");
//
//		} else if (score >= 70) {
//			System.out.println("70점 이상입니다");
//		} else {
//			System.out.println("과락입니다");
//		}
//		한 항목의 if를 한개 더 달면 두번 출력함
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		if (num%2==0)
		//(num&1)==0 두개다 사용가능
		{
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다");
		}
		
		
	}

}