package d0320;

public class VariableExampel2 {

	public static void main(String[] args) {
//		int a = 10;
//		int b = 20;
//		System.out.println(a);
//		System.out.println(b);
//	//	int c = a + b;
//	//	System.out.println(c);
//		int c = a;
//		a = b;
//		b = c;
//		System.out.println(a);
//		System.out.println(b);
//	//	변수 생성시 규칙을 꼭 지켜야 한다		
		int sum;
		int score1 = 0;
		int score2 = 5;
		sum = score1 + score2;
		
		//데이터타입 변수명 = 값;
		int a = 10;
		//변수 선언
		int b;
		//변수 저장, 대입, 초기화
		b = 20;
		
//		데이터 타입의 종류
//		아래의 데이터 타입은 모두 정수를 담는 데이터 타입이다
//					byte        1byte = 8bit	-128~127
//		short		2byte = 16bit	-32768~32767
//문자저장	char		2byte = 16bit	0~65535
//작은숫자	int			4byte = 32bit	대충 21억
//큰숫자	long		8byte = 64bit	겁나 큰 숫자
//		long 데이터 사용시 값에 L을 붙여줘야한다
//		예) long num = 5L;
		if(true) {
			System.out.println(a);
			int d = 100;
//		if문 안에서 나온 변수는 사용 불가하지만, 밖에서 만든 변수는 사용가능
//		System.out.println(d); // 사용불가
		}
		
		
		
	}

}
