package ChapterEX6;

public class Do3 {

	public static void main(String[] args) {
//		Greeting2 greeting = (String word) -> {
//			  System.out.println(word);
//			};
//      上の省略形↓ メソッド参照
		Greeting2 greeting = System.out::println;
	}

}
