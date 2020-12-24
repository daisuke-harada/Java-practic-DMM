package javaExam2;

public class sample03 {
	// フィールド（インスタンス変数)はローカル変数と違う領域にいるため、同盟でもコンパイルにならない
	int a = 0;
	public static void main(String[] args) {
		int a = 10;
		float b = 10.0f;
		double c = 20;

		a = (int)b;
		b = a;
		c = b;
		c = a;
	}
}
