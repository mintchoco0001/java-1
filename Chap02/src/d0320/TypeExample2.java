package d0320;

public class TypeExample2 {

	public static void main(String[] args) {
		
//				byte        1byte = 8bit	-128~127
//				short		2byte = 16bit	-32768~32767
//		��������	char		2byte = 16bit	0~65535
//		��������	int			4byte = 32bit	���� 21��
//		ū����	long		8byte = 64bit	�̳� ū ����

		byte num1 = 127; //-128~127���� ����
		short num2 = -32768;//-32768~32767���� ����
		char ch = 90;//�������Ұ� 0~65535���� ����
		System.out.println(ch);//a�� 97, A�� 65 [�� �ΰ��� ���迡 ���ֳ���]
		int num3 = 22000000;//int�� ���� 21������ �ܿ���
		long num4 = 2000000000000000L;//�ҹ��� l�� 1�� �����ϱ� ����� �빮�� L������
		
		byte num5 = (byte)(num1+1);
		System.out.println(num5);
		byte num6 = (byte)(-128-1);
		System.out.println(num6);
//		������Ÿ���� �Ѱ踦 ������ ����Ÿ������ ����ϸ� ���ƿ´�
		
		num4 = num1;
//		�ڵ�����ȯ : ���� ������Ÿ���� ū ������Ÿ���� ������ ��������

//		ch = num2;
//		num2 = ch;
//		�� �ΰ��� ������Ÿ���� ���� byte�� ���������� ch���� ������ ���� �Ұ���
		
		num3 = num2;
//		�ݴ�� �̵ΰ��� ����

		num5 = num1;
		
//		2���� ��� 0b+2����
		int a = 0b1011;
		System.out.println(a);
//		8���� ��� 0+8����
		int b = 013;
		System.out.println(b);
//		16���� 0x+16����
		int c =0xd;
		System.out.println(c);
		
	
	}

}
