package practice;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

	public static void main(String[] args) {
		Map<Integer, String> classmates = new HashMap();
		classmates.put(1, "青木");
		classmates.put(2, "石坂");
		classmates.put(3, "小野田");

		// キーのみ
		for(Integer key : classmates.keySet()) {
			System.out.println(key);
		}

		// 値のみ
		for (String name : classmates.values()) {
			System.out.println(name);
		}

		for (Map.Entry<Integer, String>classmate : classmates.entrySet()) {
			System.out.println(classmate.getKey() + "番は" + classmate.getValue() + "さん"); // 1番は青木さん、2番は石坂さん、3番は小野田さんの順に表示
		}


	}

}
