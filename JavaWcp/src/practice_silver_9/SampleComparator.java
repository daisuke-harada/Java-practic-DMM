package practice_silver_9;

import java.util.Comparator;

class SampleComparator implements Comparator<Student> {
	public int compare(Student student1, Student student2) {
		return student1.getAge() - student2.getAge();
	}
}
