package d0325;

public class OperaterExample {

	public static void main(String[] args) {
		System.out.println(3%2);
		System.out.println(4%3);
		
		byte a = 5;
//		byte b = +a;
		byte c;
		c = 10; //저장, 초기화 할당, 대입
		System.out.println("안녕"+"하세요");
		
		int num1 = 10;
		num1 = num1 + 1;
//		변수값 +,-,*,/ = 값 이면 해당 연산을 한 값이 나옴
		System.out.println(num1);
		num1 ++;
		int num2 = 2;
		num2 *=3;
		System.out.println(num2);
		System.out.println(num1 >= num2);
//		and연산은 *, or연산은 + //and는 &, or은 |
		
		int value1 = 5;
		int value2 = 3;
		if(value1> value2 | num1 < num2);
		System.out.println("varlue1은 varlue2보다 크고");
		System.out.println("num1은 num2보다 큽니다");
		
	}

}
