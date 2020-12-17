package practice_silver_09;

import java.util.ArrayList;
import java.util.List;

public class practice_ArrayList_01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("クリスマス");
		list.add("お正月");
		System.out.println(list.get(0));
		// ArrayListメソッドで作成された配列は、変数を出力すると、ハッシュコードではなく、配列の中身が出力される。
		System.out.println(list);
	}

}
