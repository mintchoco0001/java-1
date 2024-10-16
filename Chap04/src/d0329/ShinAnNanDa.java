package d0329;

public class ShinAnNanDa {

	public static void main(String[] args) {
		for (int i = 5; i >= 1; i--) {
			System.out.print("");
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= 1; j--) {
				if (i >= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 4; i < 0; i--) {
			for (int j = 1; j < 5; j++) {
				System.out.print("*");
			}System.out.println();
			
			
		}
		int a = 1;
		int b = a+1;
		int sum = a-b;
		for(int i =1; i<=99; i+=2) {
			a=i;
			b=i+1;
			sum+=a-b;
			System.out.println(i+"-"+b+"=");
			
	}System.out.println(sum);
	}
}
