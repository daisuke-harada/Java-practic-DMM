package practice;

public class Soldier implements Character {
	private int hitpoint = 100;
	@Override
	public int attack() {
		System.out.println("戦士の会心の一撃!");
		return hitpoint;
	}
}
