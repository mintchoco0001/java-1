package d0328;

public class WhileExample {

	public static void main(String[] args) {
//		while���� ������ �´ٸ� ������ ���ư�
//		while���� ���⶧�� break ����ؾ���
		int cnt = 0;
//		while(true) {
//			System.out.println(cnt++);
//			if(cnt ==100) {
//				break;
//			}
//		}
//	
		while (true) {
			cnt++;
			if (cnt % 2 == 1) {
				continue;
			}
			System.out.println(cnt);
			if (cnt == 100) {
				break;
			}
		}
//		for���� ���ѹݺ� ����. ������ ���� ������� ����
//		for(;;) {
//			System.out.println("HI");
//		}
		do {
			System.out.println("�ȳ��ϼ���");
		}while(false);
		
	}

}
