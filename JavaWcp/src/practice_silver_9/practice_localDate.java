package practice_silver_9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class practice_localDate {
	public static void main(String[] args) {

		// 現在日付を生成
		LocalDate ld1 = LocalDate.now();
		System.out.println(ld1);

		LocalDate ld2 = LocalDate.of(2018, 9, 1);
		System.out.println(ld2);

		LocalDate ld3 = LocalDate.parse("2018-10-01");
		System.out.println(ld3);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyy/MM/dd");
		LocalDate ld4 = LocalDate.parse("2018/11/01", dtf);
		System.out.println(ld4);
	}
}
