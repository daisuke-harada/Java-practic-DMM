package practice_silver_09;

import java.util.ArrayList;

public class practice_9_13 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");

		for (String str: list) {
			list.remove(2);
			System.out.println(list.size());
			System.out.println(str);
		}
	}
}
