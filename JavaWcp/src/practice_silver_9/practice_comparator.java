package practice_silver_9;

import java.util.Arrays;
import java.util.Comparator;

public class practice_comparator {
	public static void main(String[] args) {
		Student[] studentarray = new Student[6];
		studentarray[0] = new Student("いのうえなおみ", 24, 'f', 158);
		studentarray[1] = new Student("たかはしたつや", 23, 'm', 176);
		studentarray[2] = new Student("いのうえなおみ", 27, 'm', 164);
		studentarray[3] = new Student("えのもとめぐみ", 24, 'f', 162);
		studentarray[4] = new Student("えのもとたすく", 24, 'm', 178);
		studentarray[5] = new Student("さくらぎたかはる", 26, 'f', 163);

		Arrays.sort(studentarray, new Comparator<Student>() {
			public int compare(Student student1, Student student2) {
				return student1.getAge() - student2.getAge();
			}
		});

		for (Student student : studentarray) {
			System.out.println(student.getName() + "," + student.getAge() + ","
					+ student.getSex() + "," + student.getHeight());
		}
	}
}
