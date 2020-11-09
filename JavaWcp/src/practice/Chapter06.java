package practice;


public class Chapter06 {
	public static void main (String[] arg) {
		int val = 2+5;
		System.out.println(val);
		System.out.println(++val);
		System.out.println(val*=5);
		boolean bool;
		bool = val == 50;
		System.out.println(bool);
		bool = (val < 50) && (val % 10 == 0);
		System.out.println(bool);
	}
}
