package d0325;

public class OperaterExample {

	public static void main(String[] args) {
		System.out.println(3%2);
		System.out.println(4%3);
		
		byte a = 5;
//		byte b = +a;
		byte c;
		c = 10; //����, �ʱ�ȭ �Ҵ�, ����
		System.out.println("�ȳ�"+"�ϼ���");
		
		int num1 = 10;
		num1 = num1 + 1;
//		������ +,-,*,/ = �� �̸� �ش� ������ �� ���� ����
		System.out.println(num1);
		num1 ++;
		int num2 = 2;
		num2 *=3;
		System.out.println(num2);
		System.out.println(num1 >= num2);
//		and������ *, or������ + //and�� &, or�� |
		
		int value1 = 5;
		int value2 = 3;
		if(value1> value2 | num1 < num2);
		System.out.println("varlue1�� varlue2���� ũ��");
		System.out.println("num1�� num2���� Ů�ϴ�");
		
	}

}
