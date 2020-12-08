package practice_silver_09;

public class practice_math {
	public static void main(String[] args) {
		for (int i = -5; i < 5; i++) {
			System.out.println(i + "絶対値は" + Math.abs(i) + "です。");
		}

	   //  比較する2つの値は同じ型である必要があります。
	   int a = 10;
	   int b = 4;
	   System.out.println(Math.max(a, b));
	   System.out.println(Math.min(a, b));

	   // 1 番目の引数を、2 番目の引数で累乗した値を返します。
	   double c = 9;
	   double d = 4;
	   System.out.println(Math.pow(c, d));
	   // 平方根を求めるにはsqrt,立方根を求めるにはcbrt
	   double e = 9;
	   double f =200;
	   // 2 乗 (平方) して a になる数を a の平方根といいます。
	   System.out.println("「" + e + "」の平方根は");
	    System.out.println("「" + Math.sqrt(e) + "」です。");

	    // x3 = a を満たす x, 即 ち, 3 乗 (立方) して a になる数を a の立方根といいます. √ 2 と書きます
	    System.out.println("「" + f + "」の立方根は");
	    System.out.println("「" + Math.cbrt(f) + "」です。");
	    System.out.println(5.848035476425732*5.848035476425732*5.848035476425732);

	    // 四捨五入する方法
	    double g = 1.34d;
	    double h = 3.67d;
	    // ceilメソッド 切り上げ
	    System.out.println("「" + g + "」に対して");
	    System.out.println("切り上げ「" + Math.ceil(g) + "」");
	 // floorメソッド 切捨て
	    System.out.println("切り捨て「" + Math.floor(g) + "」");
	 // round(double)メソッド roundメソッドでは、引数の型と戻り値の型が異なりますので注意して下さい。
	    // round(float)メソッド roundメソッドでは、引数の型と戻り値の型が異なりますので注意して下さい。
	    System.out.println("四捨五入「" + Math.round(g) + "」");

	    System.out.println("「" + h + "」に対して");
	    System.out.println("切り上げ「" + Math.ceil(h) + "」");
	    System.out.println("切り捨て「" + Math.floor(h) + "」");
	    System.out.println("四捨五入「" + Math.round(h) + "」");
	}
}
