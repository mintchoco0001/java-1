package d0321;

public class TypeExample2 {

	public static void main(String[] args) {
//		byte< short< int< long< float< double
		byte num1 = 10;
		int num2 = num1; //�ڵ�Ÿ�� ��ȭ(���� ������ Ÿ���� ū������ Ÿ�Կ� �ڵ����� ��)
		long num3 = num2;
		float num4 = num3;
		double num5 = num4;
		
		byte n1 = (byte)num2;
//	���� 10�� �������� byteŸ�Ժ��� intŸ���� ũ�⶧���� ���� ����ȉ�.
//	�׷��� ���� (�հ� ����Ÿ��)���� ���� ����ȯ
		int n2 = (int)num3;
//		Ÿ���� ũ�Ⱑ ������ ǥ���ϴ� ���� ���̷� ������ȯ �������
		int n3 = 65;
		char ch1 =(char)n3;
		System.out.println(ch1);
		
		byte b1 = 10;
		byte b2 = 20;
//		char b3 = b1+b2; //����� int�� ����
//		int l1 = 10;
//		long l1 = 20;
//		int result = l1+l1; //���� ������ Ÿ�� +ū ������ Ÿ�� ����
//		
//		2+3"�ȳ��ϼ���"�� 5�ȳ��ϼ���� ���
//		"�ȳ��ϼ���"+2+3�� ���ڿ��� �νĵǾ� �ȳ��ϼ���23���� ���
		
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
//		int�� �ٸ� ������ Ÿ�԰��� �ٸ��� Integer ���
		
	}
	
	

}
