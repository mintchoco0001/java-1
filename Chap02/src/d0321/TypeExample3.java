package d0321;

import java.util.Scanner;

public class TypeExample3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str2 = sc.nextLine();
//		str+str2�� �����ؼ�100200�� �ƴ� 300���� ����غ��� 
		System.out.println(str+str2);
		short s1 = Short.parseShort(str);
		short s2 = Short.parseShort(str2);
		System.out.println(s1+s2);
//		byte +byte = int
//		byte +short = int
//		short +int = int
//		int +int = int
//		int +long = long
//		
//		���ڿ��� �⺻ ������ Ÿ������ �ٲٴ� ���
//		byteŸ�� -> Byte.parseByte(���ڿ�)\
//		int -> Integer.parseInt(���ڿ�)
//		
//	    syso(���� + ����) -> ����
//	    syso(���ڿ� + ���� + ����) -> ���ڿ�+����+���� -> ���ڿ�
//	    syso(���ڿ� + ���ڿ�) -> ���ڿ� +���ڿ� -> ���ڿ�
		
		System.out.println('A'+1);//char+���� ->int
		
		char ch = 'A'+1;
//		char ch =66;
		System.out.println(ch);
		
		String str5 = 10+"";
		String str6 = String.valueOf(10);
		
		String var4 ="3.9";
		double p1 = 2.5;
		float p2 = 1.8f;
		int result = Integer.parseInt(var4);
		System.out.println(result);
	}

}
