package d0326;

public class IfExample2 {

	public static void main(String[] args) {

		int num = (int) (Math.random() * 6) + 1;
		System.out.println(num);

//		Math.random()//0.0~1.0�̸��� �� �� �����´�
//		Math.random()*6//0.0~5.99999999...
//		(int)(Math.random()*6)//0~5
//		(int)(Math.random()*6)+1//1~5
		// 1~6�� ��µǰ� �ϱ�
		System.out.println(num + "��(��) ���Խ��ϴ�");
		if (num == 1) {
			System.out.println(num + "��(��) ���Խ��ϴ�");
		} else if (num == 2) {
			System.out.println(num + "��(��) ���Խ��ϴ�");
		} else if (num == 3) {
			System.out.println(num + "��(��) ���Խ��ϴ�");
		} else if (num == 4) {
			System.out.println(num + "��(��) ���Խ��ϴ�");
		} else if (num == 5) {
			System.out.println(num + "��(��) ���Խ��ϴ�");
		} else {
			System.out.println(num + "��(��) ���Խ��ϴ�");
		}

	}
}
