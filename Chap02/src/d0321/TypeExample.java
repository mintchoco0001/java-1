package d0321;

public class TypeExample {

	public static void main(String[] args) {
		char ch1 = 'a';
//		���ڿ��� ""ǥ�ð� �ƴ� ''ǥ�÷� ǥ��
		System.out.println(ch1);
//		char ch2 = "a";
//		�׷��� �̷��Դ� ���� �Ұ�
		char ch2 = '\u0041';
		System.out.println(ch2);
//		�빮�� A�� 65
		char ch3 = 97;
		System.out.println(ch3);
//		�ҹ��� a �� 97
		char ch4 = '��';
		System.out.println(ch4);
//		char ch5 = '������';
//		char ���ڸ� ǥ������ ���ڿ��� �����ٴ� ǥ���� �� ����.
		char ch5 = '\uAC52';
		System.out.println(ch5);
		//�Ǽ� ������ Ÿ��
		float f1 = 3.14f;//4byte �Ҽ��� �Ʒ� 7�ڸ����� ǥ�� ����
//		float ���� �Ҽ��� �ִ� �� �ڿ� f ���̱�
		float f2 = 314e-2f;
		float f3 = 3.14e2f;
//		e�� ���� �𸣸� ���� 10�̶�� ��ġ��
		System.out.println(f2);
		System.out.println(f3);
		double d1 =3.14;//8byte �Ҽ��� �Ʒ� 15�ڸ� ���� ǥ�� ����
		System.out.println(0.1f+0.2f);
//		float ���� double�� ��Ȯ���� ���Ƽ� �⺻�����δ� double�� ���
		//�� ������ Ÿ��
//		boolean ->true(1), false(0) �ΰ����� ��°��� //1byte
		boolean result = true;
		boolean result2 = false;
		
//	������Ÿ���� ũ�� byte<short=char<int<long<float<double
//	String�� ���ڿ� ������ Ÿ�� ""����ؾ���	
		String name = "ȫ�浿";
		String job = "����";
		int num1 =10;
		int num2 =20;
		System.out.println(num1 + num2);
		System.out.println(name + job);
		
//		���ڿ� �ȿ� ""�� ���Խ�Ű�� ������ \����ؾ���
		String str = "���� \"�ڹ�\"�� �����մϴ�.";
//		\�̰� ���������� ����
		System.out.println(str);
//		\�� ����ϰ� ������ \\�̷��� �ι� ġ�� �ȴ�
		String str2 = "���� \\�ڹٸ�\\ �����մϴ�.";
		System.out.println(str2);
//		���ڿ� �ȿ��� ���͸� ǥ���ϰ� ������
//		\n�� ���
		String str3 = "������\n�ֿ���\n����ȭ";
		System.out.println(str3);
//		println���� ln�� �ڵ����� ���� ����ִ� ���
		
	}

}
