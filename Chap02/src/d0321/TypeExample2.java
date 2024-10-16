package d0321;

public class TypeExample2 {

	public static void main(String[] args) {
//		byte< short< int< long< float< double
		byte num1 = 10;
		int num2 = num1; //자동타입 변화(작은 데이터 타입이 큰데이터 타입에 자동으로 들어감)
		long num3 = num2;
		float num4 = num3;
		double num5 = num4;
		
		byte n1 = (byte)num2;
//	같은 10의 값이지만 byte타입보다 int타입이 크기때문에 원래 실행안됌.
//	그래서 값에 (앞과 같은타입)으로 강제 형변환
		int n2 = (int)num3;
//		타입의 크기가 같더라도 표현하는 숫자 차이로 강제변환 해줘야함
		int n3 = 65;
		char ch1 =(char)n3;
		System.out.println(ch1);
		
		byte b1 = 10;
		byte b2 = 20;
//		char b3 = b1+b2; //결과는 int로 나옴
//		int l1 = 10;
//		long l1 = 20;
//		int result = l1+l1; //작은 데이터 타입 +큰 데이터 타임 연산
//		
//		2+3"안녕하세요"는 5안녕하세요로 출력
//		"안녕하세요"+2+3는 문자열로 인식되어 안녕하세요23으로 출력
		
		String str1 = "10";
		String str2 = "20";
		System.out.println(str1+str2);
		
		byte byte1 = Byte.parseByte(str1);
		System.out.println(byte1);
		short short1 = Short.parseShort(str2);
		int int1 = Integer.parseInt(str2);
		long long1 = Long.parseLong(str2);
		float float1 = Float.parseFloat(str2);
		double double1 = Double.parseDouble(str2);
		boolean bool1 = Boolean.parseBoolean("true");
//		int는 다른 데이터 타입과는 다르게 Integer 사용
		
	}
	
	

}
