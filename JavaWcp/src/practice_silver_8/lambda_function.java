package practice_silver_8;

import java.util.function.Function;

public class lambda_function {
	public static void main(String[] args) {
		Function<String, Integer> func = (str) -> {
			return Integer.parseInt(str);
		};
		System.out.println(func.apply("100") * 2);
	}
}
