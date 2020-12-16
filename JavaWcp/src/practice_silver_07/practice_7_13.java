package practice_silver_07;

public class practice_7_13 extends Employee7 implements Worker7 {
	public static void main(String[] args) {
		Worker7 worker = new practice_7_13();
		// workerインターフェイスに定義されているworkメソッドはオーバーライドされているため
		worker.work();
	}

}
