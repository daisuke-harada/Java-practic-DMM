package practice_silver_7;

public interface A {
	// defaultで修飾すると処理内容を記述できる。
	default void sample() {
		System.out.println();
	}
}
