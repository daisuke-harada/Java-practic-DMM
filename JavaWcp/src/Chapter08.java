
public class Chapter08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int number = 1;
		
		while (number < 5) {
			System.out.println(number * number);
			number++;
		}
		
		int[] array = {1, 4, 14, 25 };
		for(int i = 0; i < array.length; i++ ) {
			System.out.println(i);
		}
		
		for ( int num: array) {
			if (num%2 == 0) {
				continue;
			}else {
				System.out.println(num);
			}
		}
		
		for ( int num: array) {
			if (num%2 == 0) {
				continue;
			}
			num++;
			System.out.println(num);
		}
	}

}
