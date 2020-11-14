package practice;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class ChapterEX4 {

	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		set.add(1);

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "ドラゴン");
		String value = map.get(1);

	}

}
