package javaExam2;

import java.util.function.Consumer;

public class Sample36 {
	public static void main(String[] args) {
		final String val = "Hello, Lambda";
		Consumer<String> func = (a) -> System.out.println(val + a);
		func.accept(" & good");
	}
}
