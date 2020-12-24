package practice_silver_08;

import java.util.function.Consumer;

public class lambda_consumer {
	public static void main(String[] args) {
		Consumer<String> func = str -> {
			System.out.println("Hello" + str);
		};
		// 引数の中にacceptで指定した値を入れる。
		// この場合はstrにacceptされる
		func.accept("Java");
	}
}
