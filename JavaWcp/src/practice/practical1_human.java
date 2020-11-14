package practice;

public class practical1_human {
	public class HumanFoot{
		public void kick() {
			System.out.println("蹴る");
		}
	}

	public static void main(String[] args) {
//		practical1_human human = new practical1_human();
//		practical1_human.HumanFoot humanFoot = human.new HumanFoot();
//		humanFoot.kick();

		//上の部分を１行で書いたもの
		new practical1_human().new HumanFoot().kick();
	}


}
