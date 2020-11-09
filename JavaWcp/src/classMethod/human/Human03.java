package classMethod.human;

public class Human03 {
	// フィールド
	public String name;
	public int age;
	public String profession;

	public Human03() {
		// 変数は値ではないのでreturnは必要ない
		this.name = "山田";
		this.age = 20;
		this.profession = "プログラマー ";
	}

	public String getProfile () {
		// 文章の場合はreturnが必要!
		return "年齢は" + this.age + "職業は" + this.profession;
	}

	public void greet ( String friend) {
		if ( friend == null ) {
			System.out.println("挨拶する友達がわかりません!");
			// 何故ここにリターンが必要なのか？
			// return文がメソッドの中で実行されるとそれ以降の処理を実行せず呼び出し元へ処理が移すことができます。
			// 結論　これ以降の処理を行わずに呼び戻し元へ返すため!
			return;
		}
		// 文字や変数の出力はコンストラクタ内の処理がそのまま行われる。
		System.out.println(friend + "さん、こんにちわ!");
	}

}
