package practice_silver_08;

public class practice_8_4 {
	public static void main(String[] args) {
		int cnt = 0;
		for(int i = 0; i <= 3; i++) {
			cnt += 2;
		}
		// ラムダ式は宣言したタイミングで実行されるわけではないため、同じブロックの宣言された変数の値を変更するとコンパイルエラーが発生する。
		// 宣言後に変更されてしまうと意図していない動作をする可能性がある。
//		Runnable r = () -> {
//			for(cnt= 0; cnt < 10; cnt++) {
//				System.out.println(cnt);
//			}
//		};
//		new Thread(r).start();
	}
}
