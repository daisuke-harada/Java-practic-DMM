package practice_silver_8;

public class practice_8_1 {
	public static void main(String[] args) {
		/* ラムダ式は匿名クラスである。インターフェイスはインスタンスを作成することはできないが、
		 * 匿名クラスとして使用することはできる。
		 */

		Algorithm algorithm = (String name) -> {
			System.out.println("hello, " + name);
		};
		Service s = new Service();
		s.setLogic(algorithm);
		s.doProcess("Lambda");
	}
}
