package d0321;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		
//		int result = (int)( var1 + var2 + var3 + (int)(Double.parseDouble(var4)));
				//System.out.println(result);
		
		int result = (int)(var1 + var3 + (Double.parseDouble(var4)) + (int)var2);
		System.out.println(result);
	}

}
