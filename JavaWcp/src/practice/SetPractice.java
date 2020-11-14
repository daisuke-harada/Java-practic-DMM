package practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetPractice {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		Set<Integer> set2 = new LinkedHashSet<Integer>();

		set1.add("スイカ");
		set1.add("メロン");

		System.out.println(set1.contains("スイカ"));
		System.out.println(set1.contains("メロン"));

		for (String set : set1) {
			System.out.println(set1);
		}
		set1.remove("スイカ");
		set1.remove("メロン");

		System.out.println(set1.size());
	}
}
