package javaExam1;

import java.util.function.Supplier;

public class sample1_4 {
	void sample1_4() {
		int i = 0;
		Supplier<Integer> foo = () -> i;
		i++;
		System.out.println(foo.get());
	}
}
