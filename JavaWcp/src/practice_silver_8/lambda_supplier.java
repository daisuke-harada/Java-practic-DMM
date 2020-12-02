package practice_silver_8;

import java.util.function.Supplier;

public class lambda_supplier {
	public static void main(String[] args) {
		Supplier<String> func = () -> {
			return "Hello, lambda";
		};
		System.out.println(func.get());
	}
}
