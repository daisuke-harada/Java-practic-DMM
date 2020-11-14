package practice;

import java.util.ArrayList;
import java.util.List;

public class ChapterEX3 {

	public static void main(String[] args) {
		List<Character> party = new ArrayList<Character>();
		/* 回答例。
		 * party.add(new Soldier());　直接引数の中でクラスの作成ができる。
		 * party.add(new Playboy());
		 * Chapter14.partyAttack(party);
		 */
		Soldier soldier = new Soldier();
		Playboy playboy = new Playboy();

		party.add(soldier);
		party.add(playboy);

		ChapterEX3.partyAttack(party);
	}

	public static void partyAttack(List<Character> party) {
		for (Character character : party) {
			int hp = character.attack();
			System.out.println("ヒットポイント：" + hp);
		}
	}

}
