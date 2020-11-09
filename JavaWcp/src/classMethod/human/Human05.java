package classMethod.human;

public class Human05 {
	//nameとageはprivateな変数なので直接参照はできない
	private String name;
	private int age;

	public Human05() {
		name = "山田";
		age = 20;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}
