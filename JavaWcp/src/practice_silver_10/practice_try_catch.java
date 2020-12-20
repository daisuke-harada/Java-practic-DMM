package practice_silver_10;

public class practice_try_catch {
	public static void main(String[] args) {
		String a = "A";
		try {
			int[] array = {};
			array[0] = 2;
			System.out.println(array.length);
			System.out.println("finish");
		} catch (Exception e) {
			System.out.println("error");
			System.out.println(a);
		} finally {
			a = "B";
			System.out.println(a);
		}
	}

}
