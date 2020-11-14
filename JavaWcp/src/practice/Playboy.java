package practice;

public class Playboy implements Character {
	private int hitpoint = 0;
	@Override
	public int attack() {
		System.out.println("遊び人はただ遊んでいるだけだった。");
		return hitpoint;
	}

}
