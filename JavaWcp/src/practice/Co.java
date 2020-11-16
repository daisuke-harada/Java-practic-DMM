package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public interface Co {
	List<String> animals = (List<String>) Arrays.asList("dog", "cat", "fox", "elephant");
	public static void main(String[] args) {
		Collections.sort(
			    animals,
			    new Comparator<String>() {
			      @Override
			      public int compare(String x, String y) {
			        // 数値が小さい順に並べる
			        return x.compareTo(y);
			      }
			    });
	}
	}
