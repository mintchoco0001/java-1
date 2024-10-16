package d0326;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		3~5 6~8 9~11 12~2
		int a = sc.nextInt();
		String str = "봄";
		str = (a<=3)?"봄":(a<=6)?"B":(a<=9)?"C":(a<=12)?"F":".";
		switch (str) {
		case "봄":
			System.out.println(a + "월은 봄 입니다");
			break;
		case "여름":
			System.out.println(a + "월은 여름 입니다");
			break;
		case "가을":
			System.out.println(a + "월은 가을 입니다");
			break;
		case "겨울":
			System.out.println(a + "월은 겨울 입니다");
			break;
		default:
			System.out.println("잘못 입력 하셨습니다.");
		}
	}

}
