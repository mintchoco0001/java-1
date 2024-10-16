package d0320;

public class TypeExample {

	public static void main(String[] args) {

//				byte        1byte = 8bit	-128~127
//		short		2byte = 16bit	-32768~32767
//		문자저장	char		2byte = 16bit	0~65535
//		작은숫자	int			4byte = 32bit	대충 21억
//		큰숫자	long		8byte = 64bit	겁나 큰 숫자
		
		
		byte num1 = 127; //-128~127까지 가능
		short num2 = -32768;//-32768~32767까지 가능
		char ch = 90;//음수사용불가 0~65535까지 가능
		System.out.println(ch);//a는 97, A는 65
		int num3 = 22000000;//int는 대충 21억으로 외우자
		long num4 = 2000000000000000L;//소문자 l은 1과 구분하기 힘들어 대문자 L사용권장
		
		byte num5 = (byte)(num1+1);
		System.out.println(num5);
		byte num6 = (byte)(-128-1);
		System.out.println(num6);
//		데이터타입의 한계를 강제로 같은타입으로 계산하면 돌아온다
	}

}
