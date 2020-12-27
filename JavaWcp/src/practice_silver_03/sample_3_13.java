package practice_silver_03;

public class sample_3_13 {
	static Object a = "Sample";
	public static void main(String[] args) {
		Object b = "Sample";
		Object c = new String("Sample");
		System.out.println(b.equals(a));
		System.out.println(c.equals(b));
	}

}
