package d0322;

import java.io.IOException;

public class SystemExample {

	public static void main(String[] args) throws IOException {
	
//		System.out.println();
//		입력장치, 출력장치 I(input)/O(output)
		while(true) {
		int keyCode = System.in.read();
		System.out.println(keyCode);
		if(keyCode==122) {
				break;
			}
		}
	}

}
