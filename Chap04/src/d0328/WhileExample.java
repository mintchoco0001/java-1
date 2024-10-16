package d0328;

public class WhileExample {

	public static void main(String[] args) {
//		while문은 조건이 맞다면 무한이 돌아감
//		while문을 멈출때는 break 사용해야함
		int cnt = 0;
//		while(true) {
//			System.out.println(cnt++);
//			if(cnt ==100) {
//				break;
//			}
//		}
//	
		while (true) {
			cnt++;
			if (cnt % 2 == 1) {
				continue;
			}
			System.out.println(cnt);
			if (cnt == 100) {
				break;
			}
		}
//		for문도 무한반복 가능. 하지만 굳이 사용하지 않음
//		for(;;) {
//			System.out.println("HI");
//		}
		do {
			System.out.println("안녕하세요");
		}while(false);
		
	}

}
