package practice_silver_1;

import java.util.Arrays;

public class practice1_5 {
	public static void main(String[] args) {
		// 引数に"あ"を設定してメソッド呼び出し
		System.out.println("引数：\"あ\"");
		Method("あ");

		// 引数に"ABC","DEF","GHI"を設定してメソッド呼び出し
		System.out.println("引数：\"ABC\",\"DEF\",\"GHI\"");
		Method("ABC", "DEF", "GHI");

		// 引数に配列を設定してメソッド呼び出し
		String[] ar = { "1", "2", "3" };
		System.out.println("引数：" + Arrays.toString(ar));
		Method(ar);
	}

	// 可変長引数の説明
	static void Method(String... s) {

		// sは配列の扱い
		// sの要素の数だけfor文で処理を繰り返す
		for (String str : s) {

			// 要素を出力
			System.out.println(str);

		}
	}
}
