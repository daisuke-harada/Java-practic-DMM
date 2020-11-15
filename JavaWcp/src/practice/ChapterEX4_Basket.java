package practice;

public class ChapterEX4_Basket<E> {
	private E elem;

	ChapterEX4_Basket(E e) {
		elem = e;
	}

	void replace(E e) {
		elem = e;
	}

	E get() {
		return elem;
	}

	public static void main(String[] args) {
		ChapterEX4_Basket<Peach> appleBasket = new ChapterEX4_Basket<>(new Peach("桃"));
		System.out.println(appleBasket.get().getName());

		appleBasket.replace (new Peach("黄桃"));
		System.out.println(appleBasket.get().getName());
	}

}

