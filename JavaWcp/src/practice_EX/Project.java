package practice_EX;

public class Project {
	public static void main(String[] args) {
		Basket<Apple> appBasket = new Basket<>(new Apple("ふじ"));
		System.out.println(appBasket.get().getName());
	}
}
