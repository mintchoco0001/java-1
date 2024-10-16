package d0327;

public class ForExample2 {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {// ¹Ù±ùÂÊ for¹®
			System.out.println("i´Â " + i + "*******");
			for (int j = 0; j < 5; j++) {// ÁßÃ¸ for¹®
				System.out.println("j´Â " + j);
			}
		}
	}
}
