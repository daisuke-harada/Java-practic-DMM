package practice_silver_7;

public abstract class AbstractSample {
	public void Sample() {
		System.out.println("A");
		test();
		System.out.println("C");
	}
	protected abstract void test();
}
