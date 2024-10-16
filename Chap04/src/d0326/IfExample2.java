package d0326;

public class IfExample2 {

	public static void main(String[] args) {

		int num = (int) (Math.random() * 6) + 1;
		System.out.println(num);

//		Math.random()//0.0~1.0미만의 수 를 가져온다
//		Math.random()*6//0.0~5.99999999...
//		(int)(Math.random()*6)//0~5
//		(int)(Math.random()*6)+1//1~5
		// 1~6이 출력되게 하기
		System.out.println(num + "이(가) 나왔습니다");
		if (num == 1) {
			System.out.println(num + "이(가) 나왔습니다");
		} else if (num == 2) {
			System.out.println(num + "이(가) 나왔습니다");
		} else if (num == 3) {
			System.out.println(num + "이(가) 나왔습니다");
		} else if (num == 4) {
			System.out.println(num + "이(가) 나왔습니다");
		} else if (num == 5) {
			System.out.println(num + "이(가) 나왔습니다");
		} else {
			System.out.println(num + "이(가) 나왔습니다");
		}

	}
}
