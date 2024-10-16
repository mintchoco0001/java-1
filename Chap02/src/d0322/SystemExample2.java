package d0322;

public class SystemExample2 {

	public static void main(String[] args) {
		System.out.println("홍길동");
		System.out.println("김길동");
		System.out.print("박길동");
		System.out.println("최길동");
		System.out.printf("%s씨는 도적입니다.","홍길동");
		
		System.out.printf("\n제 나이는 %d살 입니다.", 28);
		System.out.printf("%f\n",3.14);
//		%s는 문자포멧 %d는 정수포멧 %f는 실수포멧
		
		System.out.printf("%5d\n", 123);
//		% 와 d 사이에 숫자는 공백의 길이
		System.out.printf("%05d\n", 123);
//		0을 넣으면 공백만큼 0으로 채워짐. 0이외에는 안됌
		System.out.printf("%-5d\n살\n", 123);
//		-는 오른쪽에 공백이 생김
//		아래는 실수 표현 [%.숫자f]가 기본 위에 설명가 거의같음
		System.out.printf("%.3f\n", 3.141592);
		System.out.printf("%10.3f\n", 3.141592);
		System.out.printf("%-10.3f\n", 3.141592);
//		
		System.out.printf("%s\n","자바");
		System.out.printf("%5s\n","자바");
		System.out.printf("%-5s\n","자바");
//		
		System.out.printf("제 이름은 %s이고, 나이는 %d살 입니다.\n",
				"김희재",28);
//		문자열 포멧코드는 다른 데이터 타입을 넣을 수 있다
		System.out.printf("%s\n", 10);
		System.out.printf("광주의 출산율은 %.2f%%다.\n", 0.78);
//		%를 표현하고 싶으면 %를 한번 더 치면 됀다.
		
	}

}
