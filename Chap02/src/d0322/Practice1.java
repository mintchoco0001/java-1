package d0322;

public class Practice1 {

	public static void main(String[] args) {
//		���� variable
//		���� ������ ����, ���, ���� �� ������ ������ ��ƾ� �Ѵ�.
//		������Ÿ�� ������ = ��(���ͷ�);
		int a; //����
//		int a = 10; �� �Ұ���
		a = 10; //�̷��� ���� �ʱ�ȭ, ����, ��ü, �Ҵ�
		int b = 20;
		int c = 30;
//		int x, y, z;
		int x=10, y=20, z=30;
//		�̷������� ������ ���� ���� ����
//		var1,2�� ���� 100,200 �־� �ΰ��� ���� ���� ��� ����
		int var1 = 100, var2 = 200;		
		int result = var1 + var2;
		System.out.println(result);
		
//		����ð� 17�� 30�� hour, minute ������ ���� ���ڸ� ���
//		��� �� ���� ���� �ð��� 17�� 30�� �Դϴ�.
//		���ڿ��� ������ �Բ� ����ϱ�
		
		String hour = "17��";
		String minute = "30��";
		int H= 17;
		int M = 30;		
		int h = 17;
		int m = 30;
		System.out.println("���� �ð��� " + hour + " " + minute + " �Դϴ�.");
		System.out.println("���� �ð��� " + h + "�� " + m + "�� �Դϴ�.");
		
		System.out.printf("���� �ð��� %s %s �Դϴ�.\n", hour, minute);
		System.out.printf("���� �ð��� %d�� %d�� �Դϴ�.\n", H, M);
		
		System.out.println("3+4="+3+4);
		System.out.println("5*6="+5*6);
//		System.out.println("10-5="+10-5);
//		���ڿ� �ڿ��� - ��ȣ�� ��� �Ұ� �׷��� ����
		System.out.println("10-5="+(10-5));
		System.out.println("10/2="+10/2);
//		""�� �ȿ� ������ ������ ���ڿ�
		
		
	}

}
