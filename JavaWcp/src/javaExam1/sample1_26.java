package javaExam1;

public class sample1_26 {
	static double c;
	static float d;
	static char g;
	public static void main(String[] args) {
		short b = (short) 'b';
		System.out.println(b);
		int a = 9;
		long f = 1000;
		c = a;
		System.out.println(c);
		d = a;
		System.out.println(d);
		c = f;
		d = f;
		System.out.println(c);
		System.out.println(d);
		g = (char)a;
		System.out.println(g);
		g = (char)f;
		System.out.println(g);
	}
}
