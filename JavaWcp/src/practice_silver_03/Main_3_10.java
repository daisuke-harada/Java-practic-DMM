package practice_silver_03;

public class Main_3_10 {
	public static void main(String[] args) {
		Object a = new Sample_3_10(10);
		Object b = new Sample_3_10(10);
		System.out.println(a.equals(b));
		Animal c = new Animal("ライオン");
		Animal d = new Animal("ワニ");
	}
}
