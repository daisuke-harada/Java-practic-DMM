package practice;

public class Chapter15_4 {

	public static void main(String[] args) {
		for (int i = 1; i <= 2; i++) {
            // ThreadSampleクラスのインスタンスを生成
            ThreadSample t1 = new ThreadSample(i);
            // Threadクラスのインスタンスを作成
            Thread t2 = new Thread(t1);
            // Threadクラスのstartメソッドを呼び出す
            t2.start();
        }

        for (int i = 1; i <= 3; i++) {
            try {
                // Thread.sleepは、指定したミリ秒間スリープするメソッド
                Thread.sleep(1000);
                // 1000ミリ秒（1秒）間スリープしてメッセージを表示
                System.out.println("Chapter15_4のスレッド : " + i + "回目");
            // Thread.sleepの例外処理
            } catch (InterruptedException e) {
                e.printStackTrace();// スタックトレースを出力する （実行したメソッドのとき系列の一覧が出力される）
            }
        }

	}

}
