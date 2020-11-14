package practice;

import java.util.ArrayList;
import java.util.List;

public class List_practice {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();

		// addメソッドで追加
		list1.add("りんご");
		list1.add("ナルト");
		list1.add("日向");

		// 位置を指定して要素を追加
		list1.add("サスケ");

		// appleにlist1の0要素を代入
		String apple = list1.get(0);
		String sasuke = list1.get(3);

		// ナルトという要素があるかチェックする。
		System.out.println(list1.contains("ナルト"));

		// 変数に代入された要素を出力する。
		System.out.println(apple);
		System.out.println(sasuke);

		// listに何要素入っているか確認する。
		System.out.println(list1.size());

		for (String prefecture: list1) {
			System.out.println(prefecture);
		}

		// りんご要素を削除する。
		list1.remove("りんご");
		list1.add(0, "グレープ");
		System.out.println(list1.contains("グレープ"));
		System.out.println(list1.size());
	}

}
