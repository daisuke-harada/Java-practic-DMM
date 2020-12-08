package practice_silver_05;

public class practice_5_10 {

	public static void main(String[] args) {
		int[] A = {3, 4};
		int[] B = A;
		System.out.println(A == B);
		int[] C = new int[] {3,4};
		int[] D = C.clone();
		System.out.println(D == C);
		for(int i: D) {
			System.out.println(i);
		}

		int[][] E = {{2, 3, 4}, {5, 6, 7}};
		for(int[] i: E) {
			for(int l: i) {
			System.out.println(l);
			}
		}

	}

}
