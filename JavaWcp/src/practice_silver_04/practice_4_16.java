package practice_silver_04;

public class practice_4_16 {

	public static void main(String[] args) {
		sample:
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (3 < j) {
					break sample;
				}
				System.out.println(j);
			}
		}
	}

}
