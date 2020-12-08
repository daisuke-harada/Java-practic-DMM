package practice_silver_02;

import java.util.ArrayList;

public class practicr2_6 {
	public static void main(String[] args) {
		// 型推論
		var e = new ArrayList<>();
		var a = 10;
		// var a = {1, 2, 3, 4, };
		// var b = () -> {};
		var b = new animal();
		b = new elefant();
		b.run();
	}
}
