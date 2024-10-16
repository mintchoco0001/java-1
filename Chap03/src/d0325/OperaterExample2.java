package d0325;

public class OperaterExample2 {

	public static void main(String[] args) {
		int a =10;
		a++;
		System.out.println(a);
		++a;
		System.out.println(a);

		int b =5;
		int c = b++;
		System.out.println(c);
		System.out.println(b);
		int x = 5;
		int y = x--;
		System.out.println(y);
		System.out.println(x);
		
		x=10;
		y=20;
		int z = ++x + y--;
		System.out.println(z);
		
		x=5;
		y=5;
		int result, result2, result3;
		result = --x +10; //14 x=4
		result2 = y--+10; //15 y=4
		y = x-- + 7 + --x; //13 x=2 y=13
		result3 = y-- + 3 + ++x; //19 
		System.out.printf("%d, %d, %d, %d, %d \n",x ,y, result, result2, result3);
		
		int i = 3;
		int j = 4;
		if (++i>j-- && i++<--j){ 
		i=--i + ++j;
		}else {j = i-- - --j;}
		System.out.printf("d%, d% \n",i,j);
//		
		int score =85;
		String grade = "";
//		score의 값이 100 이상이면 A학점, 90이상이라면 B학점,
//		80점이상이라면 C학점
		grade = score>=100?"A학점" : score>=90?
				"B학점" : score>=80?"C학점" : "재수강";
		System.out.println(grade);
		
		
		
		
	}

}
