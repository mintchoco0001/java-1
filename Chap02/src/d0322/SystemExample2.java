package d0322;

public class SystemExample2 {

	public static void main(String[] args) {
		System.out.println("ȫ�浿");
		System.out.println("��浿");
		System.out.print("�ڱ浿");
		System.out.println("�ֱ浿");
		System.out.printf("%s���� �����Դϴ�.","ȫ�浿");
		
		System.out.printf("\n�� ���̴� %d�� �Դϴ�.", 28);
		System.out.printf("%f\n",3.14);
//		%s�� �������� %d�� �������� %f�� �Ǽ�����
		
		System.out.printf("%5d\n", 123);
//		% �� d ���̿� ���ڴ� ������ ����
		System.out.printf("%05d\n", 123);
//		0�� ������ ���鸸ŭ 0���� ä����. 0�̿ܿ��� �ȉ�
		System.out.printf("%-5d\n��\n", 123);
//		-�� �����ʿ� ������ ����
//		�Ʒ��� �Ǽ� ǥ�� [%.����f]�� �⺻ ���� ���� ���ǰ���
		System.out.printf("%.3f\n", 3.141592);
		System.out.printf("%10.3f\n", 3.141592);
		System.out.printf("%-10.3f\n", 3.141592);
//		
		System.out.printf("%s\n","�ڹ�");
		System.out.printf("%5s\n","�ڹ�");
		System.out.printf("%-5s\n","�ڹ�");
//		
		System.out.printf("�� �̸��� %s�̰�, ���̴� %d�� �Դϴ�.\n",
				"������",28);
//		���ڿ� �����ڵ�� �ٸ� ������ Ÿ���� ���� �� �ִ�
		System.out.printf("%s\n", 10);
		System.out.printf("������ ������� %.2f%%��.\n", 0.78);
//		%�� ǥ���ϰ� ������ %�� �ѹ� �� ġ�� �´�.
		
	}

}
