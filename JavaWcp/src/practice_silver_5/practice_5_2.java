package practice_silver_5;

public class practice_5_2 {
	
	public static void main(String[] args) {
		// データ型だけでなく、変数名の後ろにも配列を表す[]を表す
		int a[], e[];
		// 二次元配列
		int b[][] = {{3, 3},{3, 4}};
		
		// 二次元配列 変数とデータ型に[]を分けて作成することもできる。
		int[] c[] = {{3,4},{5,6}};
		
		String[] d = new String[3];
		d[0] = "ありがとう";
		
		// 一次元目と二次元目を別々のタイミングで生成することができる。
		int[][] array = new int[2][];
		array[1] = new int[8];
		array[1][0] = 3;
		
		System.out.println(array[1][0]);
		
		System.out.println(b[0][1]);
	}
}
