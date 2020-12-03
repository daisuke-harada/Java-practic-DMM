package practice_silver_9;

public class practice_character {
	public static void main(String[] args) {
		char a = '0';
		int num = 0;
		
		// Characterクラスのメソッドは全てboolean型で値を戻す。
		// 引数で受け取った文字がアルファベットかどうか調べている。
		if(Character.isAlphabetic(a)) {
			num++;
		}
		
		// 引数で受け取った値が数字かどうか見ている。
		if(Character.isDigit(a)) {
			num++;
		}

		// 引数で受け取った値が小文字かどうか見ている。
		if(Character.isLowerCase(a)) {
			num++;
		}

		System.out.println(num);
	}
}
