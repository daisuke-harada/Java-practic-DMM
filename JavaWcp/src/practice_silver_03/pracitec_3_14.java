package practice_silver_03;

public class pracitec_3_14 {
	public static void main(String[] args) {
		String str1 = new String("def");
		String str2 = new String("def");
		System.out.println(str1.intern() == str2.intern());
	}
}
