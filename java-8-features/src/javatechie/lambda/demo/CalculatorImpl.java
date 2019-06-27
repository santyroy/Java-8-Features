package javatechie.lambda.demo;

/*
 * Lambda Expression is an expression through which we can represent anonymous expression
 * 
 * Syntax: Parameter	Expression	Body
 * 			  ()			->		{ }
 * 
 * Generally we use lambda expression to implement functional interface (An interface which has only one abstract method)
 * example of functional interface:
 * 1. Runnable -> run()
 * 2. Callable -> call()
 * 3. Comparable -> obj1.compareTo(T obj2)
 * 4. Comparator -> compare(T obj1, T obj2)
 */

interface Calculator {
//	void switchOn();

//	void sum(int input);

	int substract(int i1, int i2);
}

public class CalculatorImpl /* implements Calculator */ {

//	@Override
//	public void switchOn() {
//		System.out.println("Switched On");
//	}

	public static void main(String[] args) {

		/////////////////// Traditional Approach /////////////////////////

//		CalculatorImpl calc = new CalculatorImpl();
//		calc.switchOn();

		//////////////////// lambda expression ////////////////////////////////

//		Calculator calc = () -> System.out.println("Switched On");
//		calc.switchOn();

//		Calculator calc = (input) -> System.out.println("Sum : " + (input + 5));
//		calc.sum(5);

		Calculator calc = (i1, i2) -> {
			if (i2 > i1) {
				return i2 - i1;
			}
			throw new RuntimeException("Message");
		};
		System.out.println(calc.substract(3, 10));
	}

}
