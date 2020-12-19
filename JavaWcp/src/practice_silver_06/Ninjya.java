package practice_silver_06;

public class Ninjya {
	private int speed;
	private String name;
	private int revel;

	public Ninjya(int speed, String name, int revel) {
		this(name, revel);
		this.speed = speed;
		System.out.println(this.revel + "の" + this.name + "見参");

	}
	{   System.out.println("準備はいいか？");
	}

	public Ninjya(String name, int revel) {
		this.name = name;
		this.revel = revel;
		System.out.println("これが俺の実力だ");
	}
}
