package javatechie.lambda.demo;

@FunctionalInterface
public interface MyFunctionalInterface {

	void m1();

	default void m2() {
		System.out.println("Default method - 2");
	}

	default void m3() {
		System.out.println("Default method - 3");
	}

	static void m4() {
		System.out.println("Static method - 4");
	}

}
