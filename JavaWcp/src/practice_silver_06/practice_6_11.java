package practice_silver_06;

public class practice_6_11{

	public static void main(String[] args) {
		Sample11 s = new Sample11();
//		戻り値を返さないメソッドに対して戻り値を受け取る変数は宣言できない
//		String val = s.setValue("hello");
		float result = s.divide(8, 3);
		System.out.println(result);
	}

}
