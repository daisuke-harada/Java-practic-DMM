package practice_silver_10;

public class practice_try_catch {
	public static void main(String[] args) {
		try {
			int[] array = {};
			array[0] = 10;
			System.out.println("finish");
		} catch (Exception e) {
			System.out.println("error");
		}
	}

}
