package d0325;

public class OperatorExample {

	public static void main(String[] args) {

		String str = "�ڹ�";
		String str2 = new String("�ڹ�");
		System.out.println(str == str2);// false
		System.out.println(str.equals(str2));// true

	}

}
