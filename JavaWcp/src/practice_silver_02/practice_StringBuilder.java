package practice_silver_02;

public class practice_StringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		String str = "原田";
		str += "大輔";
		// StringBUilderは余分にバッファを16文字を持っている。
		System.out.println(sb.capacity());
        sb.append("fghijk");
        sb.append("ドラゴン");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.replace(0, 4,"e");
		System.out.println(sb);
		System.out.println(sb.indexOf("jg"));

	}

}
