package practice_silver8;

public class practice_8_1 {
	public static void main(String[] args) {
		Algorithm algorithm = (String name) -> {
			System.out.println("hello, " + name);
		};
		Service s = new Service();
		s.setLogic(algorithm);
		s.doProcess("Lambda");
	}
}
