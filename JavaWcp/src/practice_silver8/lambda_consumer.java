package practice_silver8;

import java.util.function.Consumer;

public class lambda_consumer {
	public static void main(String[] args) {
		Consumer<String> func = str -> {
			System.out.println("Hello" + str);
		};
		func.accept("Java");
	}
}
