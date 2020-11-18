package practice;

public class moziretu_hikaku {
	public static void main(String[] args) {
		String a = "applePie";
		String b = "applePie";
		boolean c = a == b;
		// true
  		System.out.println(c);

		String a2 = "applePie";
		String d2 = "apple";
		String e2 = d2+ "Pie";
		boolean c2 = a2 == e2;
		boolean c3 = a2.equals(e2);
		// false
		System.out.println(c2);
		// true
		System.out.println(c3);
	}

}
