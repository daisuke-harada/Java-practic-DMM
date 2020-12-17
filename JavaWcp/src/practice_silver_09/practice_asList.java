package practice_silver_09;

import java.util.Arrays;
import java.util.List;

public class practice_asList {
	public static void main(String[] args) {
		String a[] = {"あ","い","う"};
		List<String> array = Arrays.asList(a);
		// Arraysメソッドで作成された配列は、変数を出力しようとすると、ハッシュコードではなく。配列の中身が出力される。
		System.out.println(array);
		System.out.println(a);
	}


}
