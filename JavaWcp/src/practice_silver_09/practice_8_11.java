package practice_silver_09;

import java.util.ArrayList;

public class practice_8_11 {
	public static void main(String[] args) {
		ArrayList<Item> list = new ArrayList<>();
		list.add(new Item("A", 100));
		list.add(new Item("B", 200));
		list.add(new Item("C", 300));
		list.add(new Item("A", 100));
		list.remove(new Item("A", 500));
		for (Item item : list) {
			System.out.println(item.getName());
		}
	}
}
