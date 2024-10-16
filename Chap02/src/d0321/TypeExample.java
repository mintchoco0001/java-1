package d0321;

public class TypeExample {

	public static void main(String[] args) {
		char ch1 = 'a';
//		문자열은 ""표시가 아닌 ''표시로 표현
		System.out.println(ch1);
//		char ch2 = "a";
//		그래서 이렇게는 실행 불가
		char ch2 = '\u0041';
		System.out.println(ch2);
//		대문자 A는 65
		char ch3 = 97;
		System.out.println(ch3);
//		소문자 a 는 97
		char ch4 = '가';
		System.out.println(ch4);
//		char ch5 = '가나다';
//		char 문자만 표현가능 문자열인 가나다는 표현할 수 없다.
		char ch5 = '\uAC52';
		System.out.println(ch5);
		//실수 데이터 타입
		float f1 = 3.14f;//4byte 소수점 아래 7자리까지 표시 가능
//		float 사용시 소수점 있는 수 뒤에 f 붙이기
		float f2 = 314e-2f;
		float f3 = 3.14e2f;
//		e가 뭔지 모르면 대충 10이라고 퉁치자
		System.out.println(f2);
		System.out.println(f3);
		double d1 =3.14;//8byte 소수점 아래 15자리 까지 표시 가능
		System.out.println(0.1f+0.2f);
//		float 보단 double이 정확도가 높아서 기본적으로는 double을 사용
		//논리 데이터 타입
//		boolean ->true(1), false(0) 두가지만 출력가능 //1byte
		boolean result = true;
		boolean result2 = false;
		
//	데이터타입의 크기 byte<short=char<int<long<float<double
//	String은 문자열 데이터 타입 ""사용해야함	
		String name = "홍길동";
		String job = "도둑";
		int num1 =10;
		int num2 =20;
		System.out.println(num1 + num2);
		System.out.println(name + job);
		
//		문자열 안에 ""를 포함시키고 싶으면 \사용해야함
		String str = "나는 \"자바\"를 좋아합니다.";
//		\이건 에스케이프 문자
		System.out.println(str);
//		\를 출력하고 싶으면 \\이렇게 두번 치면 된다
		String str2 = "나는 \\자바를\\ 좋아합니다.";
		System.out.println(str2);
//		문자열 안에서 엔터를 표현하고 싶을때
//		\n을 사용
		String str3 = "김희재\n주영준\n심평화";
		System.out.println(str3);
//		println에서 ln은 자동으로 한줄 띄어주는 기능
		
	}

}
