package practice_silver_02;

public class practice2_10 {

	public static void main(String[] args) {
		String str = "hoge, world.";
		hello(str);
		System.out.println(str);
	}

	private static void hello(String msg) {
		// replaceAllはそのインスタンスの文字列の中身を変えた、新たなインスタンスを作成し、その変数が持っていた参照元に返す。
		msg.replaceAll("hoge", "hello");
	}

}
