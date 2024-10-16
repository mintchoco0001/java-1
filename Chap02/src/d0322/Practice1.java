package d0322;

public class Practice1 {

	public static void main(String[] args) {
//		변수 variable
//		값을 가지고 연산, 출력, 재사용 할 때에는 변수에 담아야 한다.
//		데이터타입 변수명 = 값(리터럴);
		int a; //선언
//		int a = 10; 은 불가능
		a = 10; //이렇게 변수 초기화, 지정, 대체, 할당
		int b = 20;
		int c = 30;
//		int x, y, z;
		int x=10, y=20, z=30;
//		이런식으로 여러개 변수 생성 가능
//		var1,2에 각각 100,200 넣어 두개의 값을 합한 결과 내기
		int var1 = 100, var2 = 200;		
		int result = var1 + var2;
		System.out.println(result);
		
//		현재시간 17시 30분 hour, minute 변수에 각각 숫자를 담고
//		출력 할 때에 현재 시간은 17시 30분 입니다.
//		문자열과 변수를 함께 출력하기
		
		String hour = "17시";
		String minute = "30분";
		int H= 17;
		int M = 30;		
		int h = 17;
		int m = 30;
		System.out.println("현재 시간은 " + hour + " " + minute + " 입니다.");
		System.out.println("현재 시간은 " + h + "시 " + m + "분 입니다.");
		
		System.out.printf("현재 시간은 %s %s 입니다.\n", hour, minute);
		System.out.printf("현재 시간은 %d시 %d분 입니다.\n", H, M);
		
		System.out.println("3+4="+3+4);
		System.out.println("5*6="+5*6);
//		System.out.println("10-5="+10-5);
//		문자열 뒤에는 - 기호는 사용 불가 그래서 오류
		System.out.println("10-5="+(10-5));
		System.out.println("10/2="+10/2);
//		""이 안에 있으면 무조건 문자열
		
		
	}

}
