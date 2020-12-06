package practice_silver_10;

public class toString_practice {
	private String name;
    private int price;

	public toString_practice(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "toString_practice [name=" + name + ", price=" + price + "]";
	}
}
