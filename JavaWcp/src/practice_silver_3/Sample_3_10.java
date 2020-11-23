package practice_silver_3;

public class Sample_3_10 {
	private int num;

	public Sample_3_10 (int num) {
		this.num = num;
	}

	public boolean equals (Sample_3_10 obj) {
		if (obj == null) {
			return false;
		}
		return this.num == obj.num;
	}
}
