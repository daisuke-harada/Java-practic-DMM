package practice_silver_06;

public class Sample {
	public static void main(String[] args) {
		int def = 5;
		def++;

		System.out.println(def);
		Animal animal = new Animal();
		animal.voice = "グラグラグラ";

		System.out.println(animal.special());
	}
}
