package practice_silver_09;

import java.util.List;

public class practice_foreach {
	public static void main(String[] args) {
		List<String> list = List.of("A", "B", "C");
//		Consumer<String> logic = new Consumer<String>() {
//			@Override
//			public void accept(String str) {
//				System.out.println(str);
//			}
//		};
		//1.ラムダ式に置き換える
//		Consumer<String> logic = (str) -> System.out.println(str);
		//2.Consumer型の変数に代入するのを省略する。
//		list.forEach((str) -> System.out.println(str));

		// メソッド参照
		// staticメソッドの場合はクラス名::メソッド名
		// インスタンスメソッドの場合はインスタンス名::メソッド名
//		Consumer<String> logic = practice_silver_09.practice_foreach::test;
//		list.forEach(logic);

		//標準クラスライブラリのメソッド参照
		// Systemクラスのstaticなoutフィールドを使い、printlnメソッドを使用している
//		Consumer<String> logic = System.out::println;
//		list.forEach(logic);
		//さらに省略

		list.forEach(System.out::println);
	}

	public static void test(String str) {
		System.out.println(str);
	}
}
