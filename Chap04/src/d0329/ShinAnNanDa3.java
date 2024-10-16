package d0329;

import java.util.Scanner;

public class ShinAnNanDa3 {

	public static void main(String[] args) {
		int a = 77;
		int b = 1;
		int sum = 0;
//		while (b < 78) {
//			sum += a * b;
//			a-=1;
//			b+=1;
//			System.out.println(sum);
//		}
		for (int i=77;i>0;i--) {
			
			sum += i*b++;
			System.out.println(sum);
		}
	}
}
