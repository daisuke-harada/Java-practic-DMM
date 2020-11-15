package ChapterEX4;

import java.math.BigDecimal;

abstract class Fruit {
    BigDecimal price;
    String name;

	Fruit(String name, BigDecimal price) {
		this.price = price;
		this.name = name;
	}
	abstract protected BigDecimal getPrice();
	abstract protected String getName();
}
